package com.gykj.patch.manager.core.job.basic;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import com.google.common.collect.Lists;
import com.gykj.patch.manager.core.dao.base.entity.TBaseCounterParty;
import com.gykj.patch.manager.core.dao.base.entity.TBaseCounterPartyAcct;
import com.gykj.patch.manager.core.domain.vo.base.TBaseCounterPartyAcctVo;
import com.gykj.patch.manager.core.domain.vo.base.TBaseCounterPartyVo;
import com.gykj.patch.manager.core.service.base.TBaseCounterPartyAcctService;
import com.gykj.patch.manager.core.service.base.TBaseCounterPartyService;
import com.gykj.patch.manager.core.service.sftp.FileService;
import com.gykj.patch.manager.core.util.CsvUtils;
import com.gykj.patch.manager.core.util.LocalDateUtil;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author yaoye
 * @desc 读取客商信息相关表的csv文件保存到数据库
 * @date 2024/4/11 08:40
 **/

@Slf4j
public class HandleBaseCSVJob {

    @Autowired
    private FileService fileServiceImpl;

    @Autowired
    private TBaseCounterPartyService tBaseCounterPartyService;

    @Autowired
    private TBaseCounterPartyAcctService tBaseCounterPartyAcctService;

    private static final String PATH = "rpc";






    public void handle(){
        LocalDate localDate = LocalDate.now().minusDays(1);
        String path = LocalDateUtil.getLocalDate(localDate, LocalDateUtil.DAY_FORMAT);
        List<String> fileNames = fileServiceImpl.getFileNames(path);

        List<String> isDone = fileNames.stream().filter(e -> e.contains("is_done")).collect(Collectors.toList());
        if (CollectionUtil.isEmpty(isDone)){
            return;
        }


        for (String s : isDone) {
           if (s.contains("t_base_counter_party")){
               t_base_counter_party(s,path);
           }

           if (s.contains("t_base_counter_party_acct")){
               t_base_counter_party(s,path);
           }
        }
    }




    public void t_base_counter_party(String csvName,String path) {
        InputStream download = null;
        try {
            download = fileServiceImpl.download(path, csvName);
            List<TBaseCounterPartyVo> csvData = CsvUtils.getCsvData(download, TBaseCounterPartyVo.class);
            if (CollectionUtil.isEmpty(csvData)){
                return;
            }
            Map<String, List<TBaseCounterPartyVo>> collect = csvData.stream().collect(Collectors.groupingBy(TBaseCounterPartyVo::getTypeStatus));
            List<TBaseCounterPartyVo> add = collect.get("ADD");

            if (CollectionUtil.isNotEmpty(add)){
                List<TBaseCounterParty> tBaseCounterParties = BeanUtil.copyToList(add, TBaseCounterParty.class);
                List<List<TBaseCounterParty>> partition = Lists.partition(tBaseCounterParties, 200);
                for (List<TBaseCounterParty> baseCounterParties : partition) {
                    tBaseCounterPartyService.getMapper().insertBatch(baseCounterParties);
                }
            }

            List<TBaseCounterPartyVo> upDate = collect.get("UPDATE");
            if (CollectionUtil.isNotEmpty(upDate)){
                List<TBaseCounterParty> tBaseCounterParties = BeanUtil.copyToList(upDate, TBaseCounterParty.class);
                for (TBaseCounterParty tBaseCounterParty : tBaseCounterParties) {
                    tBaseCounterPartyService.updateById(tBaseCounterParty);
                }
            }


            List<TBaseCounterPartyVo> delete = collect.get("DELETE");

            if (CollectionUtil.isNotEmpty(delete)){
                List<TBaseCounterParty> tBaseCounterParties = BeanUtil.copyToList(delete, TBaseCounterParty.class);
                for (TBaseCounterParty tBaseCounterParty : tBaseCounterParties) {
                    tBaseCounterPartyService.removeById(tBaseCounterParty);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }





    public void t_base_counter_party_acct(String csvName,String path) {
        InputStream download = null;
        try {
            download = fileServiceImpl.download(PATH, csvName);
            List<TBaseCounterPartyAcctVo> csvData = CsvUtils.getCsvData(download, TBaseCounterPartyAcctVo.class);
            if (CollectionUtil.isEmpty(csvData)){
                return;
            }
            Map<String, List<TBaseCounterPartyAcctVo>> collect = csvData.stream().collect(Collectors.groupingBy(TBaseCounterPartyAcctVo::getTypeStatus));
            List<TBaseCounterPartyAcctVo> add = collect.get("ADD");

            if (CollectionUtil.isNotEmpty(add)){
                List<TBaseCounterPartyAcct> tBaseCounterParties = BeanUtil.copyToList(add, TBaseCounterPartyAcct.class);
                List<List<TBaseCounterPartyAcct>> partition = Lists.partition(tBaseCounterParties, 200);
                for (List<TBaseCounterPartyAcct> baseCounterParties : partition) {
                    tBaseCounterPartyAcctService.getMapper().insertBatch(baseCounterParties);
                }
            }

            List<TBaseCounterPartyAcctVo> upDate = collect.get("UPDATE");
            if (CollectionUtil.isNotEmpty(upDate)){
                List<TBaseCounterPartyAcct> tBaseCounterParties = BeanUtil.copyToList(upDate, TBaseCounterPartyAcct.class);
                for (TBaseCounterPartyAcct tBaseCounterParty : tBaseCounterParties) {
                    tBaseCounterPartyAcctService.updateById(tBaseCounterParty);
                }
            }


            List<TBaseCounterPartyAcctVo> delete = collect.get("DELETE");

            if (CollectionUtil.isNotEmpty(delete)){
                List<TBaseCounterPartyAcct> tBaseCounterParties = BeanUtil.copyToList(delete, TBaseCounterPartyAcct.class);
                for (TBaseCounterPartyAcct tBaseCounterParty : tBaseCounterParties) {
                    tBaseCounterPartyAcctService.removeById(tBaseCounterParty);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



















}

