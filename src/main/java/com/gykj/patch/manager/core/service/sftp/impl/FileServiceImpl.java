package com.gykj.patch.manager.core.service.sftp.impl;

import com.gykj.patch.manager.core.service.sftp.FileService;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

/**
 * @author yaoye
 * @desc 操作sfpt上的文件
 * @date 2024/4/24 09:57
 **/
@Service
@Slf4j
public class FileServiceImpl implements FileService {

    @Resource
    private ChannelSftp channelSftp;



    /**
     * 删除文件夹
     * @param directory         SFTP服务器的文件路径
     */
    public void delete(String directory){
        Vector vector = listFiles(directory);
        vector.remove(0);
        vector.remove(0);
        for(Object v : vector){
            ChannelSftp.LsEntry lsEntry = (ChannelSftp.LsEntry)v;
            try{
                channelSftp.cd(directory);
                channelSftp.rm(lsEntry.getFilename());
            }catch (SftpException e){
                log.error("文件删除异常！", e);
            }
        }
    }

    /**
     * 获取文件夹下的文件
     * @param directory 路径
     * @return
     */
    public Vector<?> listFiles(String directory){
        try{
            if(isDirExist(directory)){
                Vector<?> vector =  channelSftp.ls(directory);
                //移除上级目录和根目录："." ".."
                vector.remove(0);
                vector.remove(0);
                return vector;
            }
        }catch (SftpException e){
            log.error("获取文件夹信息异常！", e);
        }
        return null;
    }


    /**
     * 判断目录是否存在
     * @param directory 路径
     * @return
     */
    public boolean isDirExist(String directory) {
        boolean isDirExistFlag = false;
        try {
            SftpATTRS sftpATTRS = channelSftp.lstat(directory);
            isDirExistFlag = true;
            return sftpATTRS.isDir();
        } catch (Exception e) {
            if (e.getMessage().toLowerCase().equals("no such file")) {
                isDirExistFlag = false;
            }
        }
        return isDirExistFlag;
    }

    /**
     * 检测文件夹是否存在
     * @param directory     路径
     * @return
     */
    public boolean booleanUrl(String directory){
        try{
            if(channelSftp.ls(directory) == null){
                return false;
            }
        }catch (Exception e){
            log.error("检测文件夹异常！", e);
        }
        return true;
    }


    /**
     * 删除文件
     * @param directory         SFTP服务器的文件路径
     * @param deleteFileName    删除的文件名称
     */
    public void delete(String directory, String deleteFileName){
        try{
            channelSftp.cd(directory);
            channelSftp.rm(deleteFileName);
        }catch (SftpException e){
            log.error("文件删除异常！", e);
        }
    }

    /**
     * 从服务器获取文件并返回字节数组
     * @param path 要下载文件的路径
     * @param file 要下载的文件
     */
    public byte[] downloadByte(String path, String file) throws Exception {
        // 切换到文件所在目录
        channelSftp.cd(path);
        //获取文件并返回给输入流,若文件不存在该方法会抛出常
        InputStream is = channelSftp.get(file);
        byte[] fileData = IOUtils.toByteArray(is);
        if(is != null){
            is.close();
        }
        return fileData;
    }


    /**
     * 从服务器获取文件并返回字节数组
     * @param path 要下载文件的路径
     * @param file 要下载的文件
     */
    public InputStream download(String path, String file) throws Exception {
        // 切换到文件所在目录
        channelSftp.cd(path);
        //获取文件并返回给输入流,若文件不存在该方法会抛出常
        return  channelSftp.get(file);
    }

    /**
     * 将输入流的数据上传到sftp作为文件
     * @param path  上传到该目录
     * @param uploadFile 服务器保存的文件
     * @throws Exception
     */
    public void upload(MultipartFile uploadFile, String path) throws Exception{
        String fileName = uploadFile.getOriginalFilename();
        // 用uuid + 原来的文件名生成新名字，防止文件名重复也可以辨识上传的文件是哪个,可以省略这一步
        String newName = UUID.randomUUID().toString().replaceAll("-","") + fileName;
        File file = new File(path + newName);
        //将MultipartFilez转换为File，会生成文件
        FileUtils.copyInputStreamToFile(uploadFile.getInputStream(), file);
        // 如果该目录不存在则直接创建新的目录，并切换到该目录
        try {
            channelSftp.cd(path);
        } catch (Exception e) {
            channelSftp.mkdir(path);
            channelSftp.cd(path);
        }
        channelSftp.put(Files.newInputStream(file.toPath()), newName);
        // 操作完成，删除刚刚生成的文件
        file.delete();
    }

    @Override
    public List<String> getFileNames(String path) {
        List<String> list = new ArrayList<>();
        try {
            Vector<ChannelSftp.LsEntry> files = channelSftp.ls(path);
            for (ChannelSftp.LsEntry file : files) {
                if (!file.getAttrs().isDir()) {
                    list.add(file.getFilename());
                }
            }
        } catch (SftpException e) {
            e.printStackTrace();
        }

        return list;

    }
}

