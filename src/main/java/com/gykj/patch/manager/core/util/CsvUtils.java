package com.gykj.patch.manager.core.util;

import cn.hutool.core.io.BOMInputStream;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/**
 * @author yaoye
 * @desc csv转为javabean
 * @date 2024/4/15 10:00
 **/
@Slf4j
public class CsvUtils {

    public static final Logger logger = LoggerFactory.getLogger(CsvUtils.class);
    private static final String CSV_LOWER = "csv";
    private static final String CSV = "CSV";

    /**
     * 解析csv文件并转成bean
     * @param clazz 类
     * @param <T> 泛型
     * @return 泛型bean集合
     */
    public static <T> List<T> getCsvData(InputStream inputStream, Class<T> clazz) throws IOException {
//        checkFile(file);
         InputStreamReader in = null;
        try {
            in = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        } catch (Exception e) {
            logger.error("读取csv文件失败！");
        }

//        List<String> list = IOUtils.readLines(inputStream, "utf-8");
//        for (String s : list) {
//            System.out.println(s);
//        }

        HeaderColumnNameMappingStrategy<T> strategy = new HeaderColumnNameMappingStrategy<>();
        strategy.setType(clazz);

        CsvToBean<T> csvToBean = new CsvToBeanBuilder<T>(in)
                .withSeparator(',')
                .withMappingStrategy(strategy)
                .build();
        return csvToBean.parse();
    }

    public static void checkFile(File file) throws IOException {
        // 判断文件是否存在
        if (null == file) {
            throw new FileNotFoundException("文件不存在");
        }
        // 获得文件名
        String fileName = file.getName();
        // 判断文件是否是csv文件
        if (!fileName.endsWith(CSV_LOWER) ) {
            throw new IOException(fileName + "不是csv文件");
        }
    }



}

