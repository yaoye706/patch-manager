package com.gykj.patch.manager.core.service.sftp.impl;

import com.gykj.patch.manager.core.service.sftp.FileService;
import com.gykj.patch.manager.core.service.sftp.GetFileService;
import com.gykj.patch.manager.core.util.LocalDateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.DocFlavor;
import java.time.LocalDate;
import java.util.List;
import java.util.Vector;

/**
 * @author yaoye
 * @desc TODO
 * @date 2024/4/24 17:41
 **/
@Service
@Slf4j
public class GetFileServiceImpl implements GetFileService {

    @Autowired
    public FileService fileServiceImpl;

    @Override
    public List<String> getFileList() {
        //获取当前时间每天12点以后跑

        return null;
    }
}

