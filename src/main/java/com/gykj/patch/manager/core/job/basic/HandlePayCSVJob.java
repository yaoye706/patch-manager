package com.gykj.patch.manager.core.job.basic;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import com.google.common.collect.Lists;
import com.gykj.patch.manager.core.dao.base.entity.TBaseCounterParty;
import com.gykj.patch.manager.core.dao.base.entity.TBaseCounterPartyAcct;
import com.gykj.patch.manager.core.dao.pay.entity.TSettPaymentApply;
import com.gykj.patch.manager.core.domain.vo.base.TBaseCounterPartyAcctVo;
import com.gykj.patch.manager.core.domain.vo.base.TBaseCounterPartyVo;
import com.gykj.patch.manager.core.domain.vo.pay.TSettPaymentApplyVo;
import com.gykj.patch.manager.core.service.base.TBaseCounterPartyAcctService;
import com.gykj.patch.manager.core.service.base.TBaseCounterPartyService;
import com.gykj.patch.manager.core.service.pay.TSettPaymentApplyService;
import com.gykj.patch.manager.core.service.sftp.FileService;
import com.gykj.patch.manager.core.util.CsvUtils;
import com.gykj.patch.manager.core.util.LocalDateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author yaoye
 * @desc 结算处理
 * @date 2024/4/11 08:40
 **/

@Slf4j
public class HandlePayCSVJob {

    @Autowired
    private FileService fileServiceImpl;

    @Autowired
    private TSettPaymentApplyService tSettPaymentApplyService;



    public void handle(){
        LocalDate localDate = LocalDate.now().minusDays(1);
        String path = LocalDateUtil.getLocalDate(localDate, LocalDateUtil.DAY_FORMAT);
        List<String> fileNames = fileServiceImpl.getFileNames(path);

        List<String> isDone = fileNames.stream().filter(e -> e.contains("is_done")).collect(Collectors.toList());
        if (CollectionUtil.isEmpty(isDone)){
            return;
        }

        for (String s : isDone) {
           if (s.contains("t_sett_payment_apply")){
               t_sett_payment_apply(s,path);
           }
        }
    }




    public void t_sett_payment_apply(String csvName,String path) {
        InputStream download = null;
        try {
            download = fileServiceImpl.download(path, csvName);
            List<TSettPaymentApplyVo> csvData = CsvUtils.getCsvData(download, TSettPaymentApplyVo.class);
            if (CollectionUtil.isEmpty(csvData)){
                return;
            }
            Map<String, List<TSettPaymentApplyVo>> collect = csvData.stream().collect(Collectors.groupingBy(TSettPaymentApplyVo::getTypeStatus));
            List<TSettPaymentApplyVo> add = collect.get("ADD");

            if (CollectionUtil.isNotEmpty(add)){
                List<TSettPaymentApply> tBaseCounterParties = BeanUtil.copyToList(add, TSettPaymentApply.class);
                List<List<TSettPaymentApply>> partition = Lists.partition(tBaseCounterParties, 200);
                for (List<TSettPaymentApply> baseCounterParties : partition) {
                    tSettPaymentApplyService.getMapper().insertBatch(baseCounterParties);
                }
            }

            List<TSettPaymentApplyVo> upDate = collect.get("UPDATE");
            if (CollectionUtil.isNotEmpty(upDate)){
                List<TSettPaymentApply> tBaseCounterParties = BeanUtil.copyToList(upDate, TSettPaymentApply.class);
                for (TSettPaymentApply tBaseCounterParty : tBaseCounterParties) {
                    tSettPaymentApplyService.updateById(tBaseCounterParty);
                }
            }


            List<TSettPaymentApplyVo> delete = collect.get("DELETE");

            if (CollectionUtil.isNotEmpty(delete)){
                List<TSettPaymentApply> tBaseCounterParties = BeanUtil.copyToList(delete, TSettPaymentApply.class);
                for (TSettPaymentApply tBaseCounterParty : tBaseCounterParties) {
                    tSettPaymentApplyService.removeById(tBaseCounterParty);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }





















}

