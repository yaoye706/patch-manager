package com.gykj.patch.manager.core.job.basic;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.collection.TransCollection;
import com.google.common.collect.Lists;
import com.gykj.patch.manager.core.dao.armg.entity.*;
import com.gykj.patch.manager.core.dao.pay.entity.TSettPaymentApply;
import com.gykj.patch.manager.core.domain.vo.armg.*;
import com.gykj.patch.manager.core.domain.vo.pay.TSettPaymentApplyVo;
import com.gykj.patch.manager.core.service.armg.*;
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
 * @desc 应收处理
 * @date 2024/4/11 08:40
 **/

@Slf4j
public class HandleArmgCSVJob {

    @Autowired
    private FileService fileServiceImpl;

    @Autowired
    private TArmgReReceivableInputService tArmgReReceivableInputService;

    @Autowired
    private TArmgReceiptEntryMainService tArmgReceiptEntryMainService;

    @Autowired
    private TArmgReceivableOrReceiptService tArmgReceivableOrReceiptService;


    @Autowired
    private TArmgBankFlowSubService tArmgBankFlowSubService;


    @Autowired
    private TArmgBillCancelSubService tArmgBillCancelSubService;


    @Autowired
    private TArmgCashCancelSubService tArmgCashCancelSubService;

    @Autowired
    private TArmgReInputInvoiceService tArmgReInputInvoiceService;



    public void handle(){
        LocalDate localDate = LocalDate.now().minusDays(1);
        String path = LocalDateUtil.getLocalDate(localDate, LocalDateUtil.DAY_FORMAT);
        List<String> fileNames = fileServiceImpl.getFileNames(path);

        List<String> isDone = fileNames.stream().filter(e -> e.contains("is_done")).collect(Collectors.toList());
        if (CollectionUtil.isEmpty(isDone)){
            return;
        }

        for (String s : isDone) {
           if (s.contains("t_armg_re_receivable_input")){
               //应收单录入
               t_armg_re_receivable_input(s,path);
           }

            if (s.contains("t_armg_receipt_entry_main")){
                //收款单录入/应收核销
                t_armg_receipt_entry_main(s,path);
            }

            if (s.contains("t_armg_receivable_or_receipt")){
                //应收单录入/收款单录入/应收核销（应收单据和收款单据的映射表）
                t_armg_receivable_or_receipt(s,path);
            }

            if (s.contains("t_armg_bank_flow_sub")){
                //应收单录入/收款单录入/应收核销（银行流水子表)
                t_armg_bank_flow_sub(s,path);
            }
            if (s.contains("t_armg_bill_cancel_sub")){
                //应收单录入/收款单录入/应收核销（承兑汇票核销子表)
                t_armg_bill_cancel_sub(s,path);
            }
            //本次不填
            if (s.contains("t_armg_cash_cancel_sub")){
                //应收单录入/收款单录入/应收核销（现金收款核销子表)
                //t_armg_cash_cancel_sub(s,path);
            }
            //本次不填
            if (s.contains("t_armg_cashbill_cancel_sub")){
                //应收单录入/收款单录入/应收核销（现金支票收款核销子表)
                //t_armg_cashbill_cancel_sub(s,path);
            }
            if (s.contains("t_armg_credit_cancel_sub")){
                //应收单录入/收款单录入/应收核销（信用证核销子表)
                t_armg_credit_cancel_sub(s,path);
            }


//
//            if (s.contains("t_armg_da_cancel_sub")){
//                t_armg_da_cancel_sub(s,path);
//            }

            if (s.contains("t_armg_re_input_invoice")){
                t_armg_re_input_invoice(s,path);
            }
            //没有
//            if (s.contains("t_armg_re_budget_item")){
//                t_armg_re_budget_item(s,path);
//            }
        }
    }



    public void t_armg_re_input_invoice(String csvName,String path) {
        InputStream download = null;
        try {
            download = fileServiceImpl.download(path, csvName);
            List<TArmgReInputInvoiceVo> csvData = CsvUtils.getCsvData(download, TArmgReInputInvoiceVo.class);
            if (CollectionUtil.isEmpty(csvData)){
                return;
            }
            Map<String, List<TArmgReInputInvoiceVo>> collect = csvData.stream().collect(Collectors.groupingBy(TArmgReInputInvoiceVo::getTypeStatus));
            List<TArmgReInputInvoiceVo> add = collect.get("ADD");

            if (CollectionUtil.isNotEmpty(add)){
                List<TArmgReInputInvoice> tBaseCounterParties = BeanUtil.copyToList(add, TArmgReInputInvoice.class);
                List<List<TArmgReInputInvoice>> partition = Lists.partition(tBaseCounterParties, 200);
                for (List<TArmgReInputInvoice> baseCounterParties : partition) {
                    tArmgReInputInvoiceService.getMapper().insertBatch(baseCounterParties);
                }
            }

            List<TArmgReInputInvoiceVo> upDate = collect.get("UPDATE");
            if (CollectionUtil.isNotEmpty(upDate)){
                List<TArmgReInputInvoice> tBaseCounterParties = BeanUtil.copyToList(upDate, TArmgReInputInvoice.class);
                for (TArmgReInputInvoice tBaseCounterParty : tBaseCounterParties) {
                    tArmgReInputInvoiceService.updateById(tBaseCounterParty);
                }
            }


            List<TArmgReInputInvoiceVo> delete = collect.get("DELETE");

            if (CollectionUtil.isNotEmpty(delete)){
                List<TArmgReInputInvoice> tBaseCounterParties = BeanUtil.copyToList(delete, TArmgReInputInvoice.class);
                for (TArmgReInputInvoice tBaseCounterParty : tBaseCounterParties) {
                    tArmgReInputInvoiceService.removeById(tBaseCounterParty);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    public void t_armg_credit_cancel_sub(String csvName,String path) {
        InputStream download = null;
        try {
            download = fileServiceImpl.download(path, csvName);
            List<TArmgCashCancelSubVo> csvData = CsvUtils.getCsvData(download, TArmgCashCancelSubVo.class);
            if (CollectionUtil.isEmpty(csvData)){
                return;
            }
            Map<String, List<TArmgCashCancelSubVo>> collect = csvData.stream().collect(Collectors.groupingBy(TArmgCashCancelSubVo::getTypeStatus));
            List<TArmgCashCancelSubVo> add = collect.get("ADD");

            if (CollectionUtil.isNotEmpty(add)){
                List<TArmgCashCancelSub> tBaseCounterParties = BeanUtil.copyToList(add, TArmgCashCancelSub.class);
                List<List<TArmgCashCancelSub>> partition = Lists.partition(tBaseCounterParties, 200);
                for (List<TArmgCashCancelSub> baseCounterParties : partition) {
                    tArmgCashCancelSubService.getMapper().insertBatch(baseCounterParties);
                }
            }

            List<TArmgCashCancelSubVo> upDate = collect.get("UPDATE");
            if (CollectionUtil.isNotEmpty(upDate)){
                List<TArmgCashCancelSub> tBaseCounterParties = BeanUtil.copyToList(upDate, TArmgCashCancelSub.class);
                for (TArmgCashCancelSub tBaseCounterParty : tBaseCounterParties) {
                    tArmgCashCancelSubService.updateById(tBaseCounterParty);
                }
            }


            List<TArmgCashCancelSubVo> delete = collect.get("DELETE");

            if (CollectionUtil.isNotEmpty(delete)){
                List<TArmgCashCancelSub> tBaseCounterParties = BeanUtil.copyToList(delete, TArmgCashCancelSub.class);
                for (TArmgCashCancelSub tBaseCounterParty : tBaseCounterParties) {
                    tArmgCashCancelSubService.removeById(tBaseCounterParty);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }




    public void t_armg_cash_cancel_sub(String csvName,String path) {
        InputStream download = null;
        try {
            download = fileServiceImpl.download(path, csvName);
            List<TArmgCashCancelSubVo> csvData = CsvUtils.getCsvData(download, TArmgCashCancelSubVo.class);
            if (CollectionUtil.isEmpty(csvData)){
                return;
            }
            Map<String, List<TArmgCashCancelSubVo>> collect = csvData.stream().collect(Collectors.groupingBy(TArmgCashCancelSubVo::getTypeStatus));
            List<TArmgCashCancelSubVo> add = collect.get("ADD");

            if (CollectionUtil.isNotEmpty(add)){
                List<TArmgCashCancelSub> tBaseCounterParties = BeanUtil.copyToList(add, TArmgCashCancelSub.class);
                List<List<TArmgCashCancelSub>> partition = Lists.partition(tBaseCounterParties, 200);
                for (List<TArmgCashCancelSub> baseCounterParties : partition) {
                    tArmgCashCancelSubService.getMapper().insertBatch(baseCounterParties);
                }
            }

            List<TArmgCashCancelSubVo> upDate = collect.get("UPDATE");
            if (CollectionUtil.isNotEmpty(upDate)){
                List<TArmgCashCancelSub> tBaseCounterParties = BeanUtil.copyToList(upDate, TArmgCashCancelSub.class);
                for (TArmgCashCancelSub tBaseCounterParty : tBaseCounterParties) {
                    tArmgCashCancelSubService.updateById(tBaseCounterParty);
                }
            }


            List<TArmgCashCancelSubVo> delete = collect.get("DELETE");

            if (CollectionUtil.isNotEmpty(delete)){
                List<TArmgCashCancelSub> tBaseCounterParties = BeanUtil.copyToList(delete, TArmgCashCancelSub.class);
                for (TArmgCashCancelSub tBaseCounterParty : tBaseCounterParties) {
                    tArmgCashCancelSubService.removeById(tBaseCounterParty);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }



    public void t_armg_bill_cancel_sub(String csvName,String path) {
        InputStream download = null;
        try {
            download = fileServiceImpl.download(path, csvName);
            List<TArmgBillCancelSubVo> csvData = CsvUtils.getCsvData(download, TArmgBillCancelSubVo.class);
            if (CollectionUtil.isEmpty(csvData)){
                return;
            }
            Map<String, List<TArmgBillCancelSubVo>> collect = csvData.stream().collect(Collectors.groupingBy(TArmgBillCancelSubVo::getTypeStatus));
            List<TArmgBillCancelSubVo> add = collect.get("ADD");

            if (CollectionUtil.isNotEmpty(add)){
                List<TArmgBillCancelSub> tBaseCounterParties = BeanUtil.copyToList(add, TArmgBillCancelSub.class);
                List<List<TArmgBillCancelSub>> partition = Lists.partition(tBaseCounterParties, 200);
                for (List<TArmgBillCancelSub> baseCounterParties : partition) {
                    tArmgBillCancelSubService.getMapper().insertBatch(baseCounterParties);
                }
            }

            List<TArmgBillCancelSubVo> upDate = collect.get("UPDATE");
            if (CollectionUtil.isNotEmpty(upDate)){
                List<TArmgBillCancelSub> tBaseCounterParties = BeanUtil.copyToList(upDate, TArmgBillCancelSub.class);
                for (TArmgBillCancelSub tBaseCounterParty : tBaseCounterParties) {
                    tArmgBillCancelSubService.updateById(tBaseCounterParty);
                }
            }


            List<TArmgBillCancelSubVo> delete = collect.get("DELETE");

            if (CollectionUtil.isNotEmpty(delete)){
                List<TArmgBillCancelSub> tBaseCounterParties = BeanUtil.copyToList(delete, TArmgBillCancelSub.class);
                for (TArmgBillCancelSub tBaseCounterParty : tBaseCounterParties) {
                    tArmgBillCancelSubService.removeById(tBaseCounterParty);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }




    public void t_armg_bank_flow_sub(String csvName,String path) {
        InputStream download = null;
        try {
            download = fileServiceImpl.download(path, csvName);
            List<TArmgBankFlowSubVo> csvData = CsvUtils.getCsvData(download, TArmgBankFlowSubVo.class);
            if (CollectionUtil.isEmpty(csvData)){
                return;
            }
            Map<String, List<TArmgBankFlowSubVo>> collect = csvData.stream().collect(Collectors.groupingBy(TArmgBankFlowSubVo::getTypeStatus));
            List<TArmgBankFlowSubVo> add = collect.get("ADD");

            if (CollectionUtil.isNotEmpty(add)){
                List<TArmgBankFlowSub> tBaseCounterParties = BeanUtil.copyToList(add, TArmgBankFlowSub.class);
                List<List<TArmgBankFlowSub>> partition = Lists.partition(tBaseCounterParties, 200);
                for (List<TArmgBankFlowSub> baseCounterParties : partition) {
                    tArmgBankFlowSubService.getMapper().insertBatch(baseCounterParties);
                }
            }

            List<TArmgBankFlowSubVo> upDate = collect.get("UPDATE");
            if (CollectionUtil.isNotEmpty(upDate)){
                List<TArmgBankFlowSub> tBaseCounterParties = BeanUtil.copyToList(upDate, TArmgBankFlowSub.class);
                for (TArmgBankFlowSub tBaseCounterParty : tBaseCounterParties) {
                    tArmgBankFlowSubService.updateById(tBaseCounterParty);
                }
            }


            List<TArmgBankFlowSubVo> delete = collect.get("DELETE");

            if (CollectionUtil.isNotEmpty(delete)){
                List<TArmgBankFlowSub> tBaseCounterParties = BeanUtil.copyToList(delete, TArmgBankFlowSub.class);
                for (TArmgBankFlowSub tBaseCounterParty : tBaseCounterParties) {
                    tArmgBankFlowSubService.removeById(tBaseCounterParty);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void t_armg_receivable_or_receipt(String csvName,String path) {
        InputStream download = null;
        try {
            download = fileServiceImpl.download(path, csvName);
            List<TArmgReceivableOrReceiptVo> csvData = CsvUtils.getCsvData(download, TArmgReceivableOrReceiptVo.class);
            if (CollectionUtil.isEmpty(csvData)){
                return;
            }
            Map<String, List<TArmgReceivableOrReceiptVo>> collect = csvData.stream().collect(Collectors.groupingBy(TArmgReceivableOrReceiptVo::getTypeStatus));
            List<TArmgReceivableOrReceiptVo> add = collect.get("ADD");

            if (CollectionUtil.isNotEmpty(add)){
                List<TArmgReceivableOrReceipt> tBaseCounterParties = BeanUtil.copyToList(add, TArmgReceivableOrReceipt.class);
                List<List<TArmgReceivableOrReceipt>> partition = Lists.partition(tBaseCounterParties, 200);
                for (List<TArmgReceivableOrReceipt> baseCounterParties : partition) {
                    tArmgReceivableOrReceiptService.getMapper().insertBatch(baseCounterParties);
                }
            }

            List<TArmgReceivableOrReceiptVo> upDate = collect.get("UPDATE");
            if (CollectionUtil.isNotEmpty(upDate)){
                List<TArmgReceivableOrReceipt> tBaseCounterParties = BeanUtil.copyToList(upDate, TArmgReceivableOrReceipt.class);
                for (TArmgReceivableOrReceipt tBaseCounterParty : tBaseCounterParties) {
                    tArmgReceivableOrReceiptService.updateById(tBaseCounterParty);
                }
            }


            List<TArmgReceivableOrReceiptVo> delete = collect.get("DELETE");

            if (CollectionUtil.isNotEmpty(delete)){
                List<TArmgReceiptEntryMain> tBaseCounterParties = BeanUtil.copyToList(delete, TArmgReceiptEntryMain.class);
                for (TArmgReceiptEntryMain tBaseCounterParty : tBaseCounterParties) {
                    tArmgReceivableOrReceiptService.removeById(tBaseCounterParty);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }



    public void t_armg_receipt_entry_main(String csvName,String path) {
        InputStream download = null;
        try {
            download = fileServiceImpl.download(path, csvName);
            List<TArmgReceiptEntryMainVo> csvData = CsvUtils.getCsvData(download, TArmgReceiptEntryMainVo.class);
            if (CollectionUtil.isEmpty(csvData)){
                return;
            }
            Map<String, List<TArmgReceiptEntryMainVo>> collect = csvData.stream().collect(Collectors.groupingBy(TArmgReceiptEntryMainVo::getTypeStatus));
            List<TArmgReceiptEntryMainVo> add = collect.get("ADD");

            if (CollectionUtil.isNotEmpty(add)){
                List<TArmgReceiptEntryMain> tBaseCounterParties = BeanUtil.copyToList(add, TArmgReceiptEntryMain.class);
                List<List<TArmgReceiptEntryMain>> partition = Lists.partition(tBaseCounterParties, 200);
                for (List<TArmgReceiptEntryMain> baseCounterParties : partition) {
                    tArmgReceiptEntryMainService.getMapper().insertBatch(baseCounterParties);
                }
            }

            List<TArmgReceiptEntryMainVo> upDate = collect.get("UPDATE");
            if (CollectionUtil.isNotEmpty(upDate)){
                List<TArmgReceiptEntryMain> tBaseCounterParties = BeanUtil.copyToList(upDate, TArmgReceiptEntryMain.class);
                for (TArmgReceiptEntryMain tBaseCounterParty : tBaseCounterParties) {
                    tArmgReceiptEntryMainService.updateById(tBaseCounterParty);
                }
            }


            List<TArmgReceiptEntryMainVo> delete = collect.get("DELETE");

            if (CollectionUtil.isNotEmpty(delete)){
                List<TArmgReceiptEntryMain> tBaseCounterParties = BeanUtil.copyToList(delete, TArmgReceiptEntryMain.class);
                for (TArmgReceiptEntryMain tBaseCounterParty : tBaseCounterParties) {
                    tArmgReceiptEntryMainService.removeById(tBaseCounterParty);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    /**
     * 应收单录入
     */
    public void t_armg_re_receivable_input(String csvName,String path) {
        InputStream download = null;
        try {
            download = fileServiceImpl.download(path, csvName);
            List<TArmgReReceivableInputVo> csvData = CsvUtils.getCsvData(download, TArmgReReceivableInputVo.class);
            if (CollectionUtil.isEmpty(csvData)){
                return;
            }
            Map<String, List<TArmgReReceivableInputVo>> collect = csvData.stream().collect(Collectors.groupingBy(TArmgReReceivableInputVo::getTypeStatus));
            List<TArmgReReceivableInputVo> add = collect.get("ADD");

            if (CollectionUtil.isNotEmpty(add)){
                List<TArmgReReceivableInput> tBaseCounterParties = BeanUtil.copyToList(add, TArmgReReceivableInput.class);
                List<List<TArmgReReceivableInput>> partition = Lists.partition(tBaseCounterParties, 200);
                for (List<TArmgReReceivableInput> baseCounterParties : partition) {
                    tArmgReReceivableInputService.getMapper().insertBatch(baseCounterParties);
                }
            }

            List<TArmgReReceivableInputVo> upDate = collect.get("UPDATE");
            if (CollectionUtil.isNotEmpty(upDate)){
                List<TArmgReReceivableInput> tBaseCounterParties = BeanUtil.copyToList(upDate, TArmgReReceivableInput.class);
                for (TArmgReReceivableInput tBaseCounterParty : tBaseCounterParties) {
                    tArmgReReceivableInputService.updateById(tBaseCounterParty);
                }
            }


            List<TArmgReReceivableInputVo> delete = collect.get("DELETE");

            if (CollectionUtil.isNotEmpty(delete)){
                List<TArmgReReceivableInput> tBaseCounterParties = BeanUtil.copyToList(delete, TArmgReReceivableInput.class);
                for (TArmgReReceivableInput tBaseCounterParty : tBaseCounterParties) {
                    tArmgReReceivableInputService.removeById(tBaseCounterParty);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
























}

