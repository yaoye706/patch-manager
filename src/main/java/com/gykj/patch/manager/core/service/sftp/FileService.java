package com.gykj.patch.manager.core.service.sftp;

import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;
import java.util.Vector;

/**
 * @Author: yaoye
 * @Date: 2024/4/23 16:43
 */
public interface FileService {
    /**
     * 删除文件夹
     *
     * @param directory SFTP服务器的文件路径
     */
    void delete(String directory);

    /**
     * 获取文件夹下的文件
     *
     * @param directory 路径
     * @return
     */
    Vector<?> listFiles(String directory);


    /**
     * 判断目录是否存在
     *
     * @param directory 路径
     * @return
     */
    boolean isDirExist(String directory);

    /**
     * 检测文件夹是否存在
     *
     * @param directory 路径
     * @return
     */
    boolean booleanUrl(String directory);


    /**
     * 删除文件
     *
     * @param directory      SFTP服务器的文件路径
     * @param deleteFileName 删除的文件名称
     */
    void delete(String directory, String deleteFileName);


    /**
     * 从服务器获取文件并返回字节数组
     * @param path 要下载文件的路径
     * @param file 要下载的文件
     */
    byte[] downloadByte(String path, String file) throws Exception;


    /**
     * 从服务器获取文件并返回 InputStream
     * @param path 要下载文件的路径
     * @param file 要下载的文件
     */
    InputStream download(String path, String file) throws Exception;


    /**
     * 将输入流的数据上传到sftp作为文件
     *
     * @param path       上传到该目录
     * @param uploadFile 服务器保存的文件
     * @throws Exception
     */
    public void upload(MultipartFile uploadFile, String path) throws Exception;




    List<String> getFileNames(String path);
}