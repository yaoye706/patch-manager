package com.gykj.patch.manager.core.dao.armg.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.Table;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 银行流水子表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("银行流水子表")
@Table(value = "t_armg_bank_flow_sub")
public class TArmgBankFlowSub implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @Id
    @ApiModelProperty("主键ID")
    private String id;

    /**
     * 关联主表的ID
     */
    @ApiModelProperty("关联主表的ID")
    private String mainId;

    /**
     * 银行流水号
     */
    @ApiModelProperty("银行流水号")
    private String transinfoNo;

    /**
     * 收款金额
     */
    @ApiModelProperty("收款金额")
    private BigDecimal transAmount;

    /**
     * 币种编码
     */
    @ApiModelProperty("币种编码")
    private String currencyType;

    /**
     * 收款账号
     */
    @ApiModelProperty("收款账号")
    private String accountNo;

    /**
     * 收款账号名称
     */
    @ApiModelProperty("收款账号名称")
    private String accountName;

    /**
     * 付款账号
     */
    @ApiModelProperty("付款账号")
    private String oppAccountNo;

    /**
     * 付款账号名称
     */
    @ApiModelProperty("付款账号名称")
    private String oppAccountName;

    /**
     * 摘要
     */
    @ApiModelProperty("摘要")
    private String memo;

    /**
     * 交易日期
     */
    @ApiModelProperty("交易日期")
    private String transTime;

    /**
     * 数据状态 1有效 ；0无效
     */
    @ApiModelProperty("数据状态 1有效 ；0无效")
    private BigDecimal dataStatus;

    /**
     * 创建人名称
     */
    @ApiModelProperty("创建人名称")
    private String createByName;

    /**
     * 创建人编码
     */
    @ApiModelProperty("创建人编码")
    private String createByCode;

    /**
     * 更新人名称
     */
    @ApiModelProperty("更新人名称")
    private String updateByName;

    /**
     * 更新人编码
     */
    @ApiModelProperty("更新人编码")
    private String updateByCode;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private String createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private String updateTime;

    /**
     * 乐观锁
     */
    @ApiModelProperty("乐观锁")
    private BigDecimal dataVersion;

    /**
     * 电子回单名称
     */
    @ApiModelProperty("电子回单名称")
    private String elecReceiptNo;

    /**
     * 银行流水id
     */
    @ApiModelProperty("银行流水id")
    private String transId;

    /**
     * 租户ID
     */
    @ApiModelProperty("租户ID")
    private String tenantId;

    /**
     * 银企电子回单号
     */
    @ApiModelProperty("银企电子回单号")
    private String toutfo;

    /**
     * 银企电子回单URL
     */
    @ApiModelProperty("银企电子回单URL")
    private String elecReceiptAddr;

    /**
     * 手工上传的回单信息ID
     */
    @ApiModelProperty("手工上传的回单信息ID")
    private String electronicReceiptId;

    /**
     * 手工上传的回单文件名
     */
    @ApiModelProperty("手工上传的回单文件名")
    private String electronicReceiptFileName;

}
