package com.gykj.patch.manager.core.domain.vo.lofc;

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
 * 付款调拨单 调拨单(调拨付款) 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("付款调拨单 调拨单(调拨付款)")
@Table(value = "T_LOFC_OPEN_PAYMENT_ALLOCATION")
public class TLofcOpenPaymentAllocationVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id 表ID唯一主键
     */
    @Id
    @ApiModelProperty("id 表ID唯一主键")
    private String id;

    /**
     * dataStatus 记录状态 0无效；1有效
     */
    @ApiModelProperty("dataStatus 记录状态 0无效；1有效")
    private BigDecimal dataStatus;

    /**
     * createTime 创建时间
     */
    @ApiModelProperty("createTime 创建时间")
    private String createTime;

    /**
     * createByCode 创建人编码
     */
    @ApiModelProperty("createByCode 创建人编码")
    private String createByCode;

    /**
     * createByName 创建人名称
     */
    @ApiModelProperty("createByName 创建人名称")
    private String createByName;

    /**
     * updateByCode 修改人编码
     */
    @ApiModelProperty("updateByCode 修改人编码")
    private String updateByCode;

    /**
     * updateByName 修改人名称
     */
    @ApiModelProperty("updateByName 修改人名称")
    private String updateByName;

    /**
     * updateTime 修改时间
     */
    @ApiModelProperty("updateTime 修改时间")
    private String updateTime;

    /**
     * dataVersion 乐观锁
     */
    @ApiModelProperty("dataVersion 乐观锁")
    private BigDecimal dataVersion;

    /**
     * applyId 关联业务单据id
     */
    @ApiModelProperty("applyId 关联业务单据id")
    private String applyId;

    /**
     * payaccount 付款方账户id
     */
    @ApiModelProperty("payaccount 付款方账户id")
    private String payAccountId;

    /**
     * payaccountNo 付款账户账号
     */
    @ApiModelProperty("payaccountNo 付款账户账号")
    private String payAccountNo;

    /**
     * payaccountName 付款账户名称
     */
    @ApiModelProperty("payaccountName 付款账户名称")
    private String payAccountName;

    /**
     * payaccountBankName 付款账户开户行
     */
    @ApiModelProperty("payaccountBankName 付款账户开户行")
    private String payAccountBankname;

    /**
     * receiveaccount 收款方账户id
     */
    @ApiModelProperty("receiveaccount 收款方账户id")
    private String receiveAccountId;

    /**
     * receiveaccountNo 收款账户账号
     */
    @ApiModelProperty("receiveaccountNo 收款账户账号")
    private String receiveAccountNo;

    /**
     * receiveaccountName 收款账户名称
     */
    @ApiModelProperty("receiveaccountName 收款账户名称")
    private String receiveAccountName;

    /**
     * receiveaccountBankName 收款账户开户行
     */
    @ApiModelProperty("receiveaccountBankName 收款账户开户行")
    private String receiveAccountBankname;

    /**
     * financingId 调拨单id
     */
    @ApiModelProperty("financingId 调拨单id")
    private String financingId;

    /**
     * amount 调拨金额
     */
    @ApiModelProperty("amount 调拨金额")
    private BigDecimal amount;

    /**
     * expPayTime 期望调拨日期
     */
    @ApiModelProperty("expPayTime 期望调拨日期")
    private String expPayTime;

    /**
     * purpose 用途
     */
    @ApiModelProperty("purpose 用途")
    private String purpose;

    /**
     * businessType 业务类型id
     */
    @ApiModelProperty("businessType 业务类型id")
    private String businessType;

    /**
     * businessTypeName 业务类型名称
     */
    @ApiModelProperty("businessTypeName 业务类型名称")
    private String businessTypeName;

    /**
     * payCurrencyType 付款币种id
     */
    @ApiModelProperty("payCurrencyType 付款币种id")
    private String payCurrencyType;

    /**
     * payCurrencyName 付款币种名称
     */
    @ApiModelProperty("payCurrencyName 付款币种名称")
    private String payCurrencyName;

    /**
     * payOrgId 付款单位id
     */
    @ApiModelProperty("payOrgId 付款单位id")
    private String payOrgId;

    /**
     * payOrgName 付款单位名称
     */
    @ApiModelProperty("payOrgName 付款单位名称")
    private String payOrgName;

    /**
     * payOrgCode 付款单位编号
     */
    @ApiModelProperty("payOrgCode 付款单位编号")
    private String payOrgCode;

    /**
     * recCurrencyType 收款币种id
     */
    @ApiModelProperty("recCurrencyType 收款币种id")
    private String recCurrencyType;

    /**
     * recCurrencyName 收款币种名称
     */
    @ApiModelProperty("recCurrencyName 收款币种名称")
    private String recCurrencyName;

    /**
     * tenantId 租户id
     */
    @ApiModelProperty("tenantId 租户id")
    private String tenantId;

    /**
     * serialNo 流水号
     */
    @ApiModelProperty("serialNo 流水号")
    private String serialno;

    /**
     * 回写状态
     */
    @ApiModelProperty("回写状态")
    private BigDecimal payStatus;

    /**
     * 业务类型编号（信用证业务）
     */
    @ApiModelProperty("业务类型编号（信用证业务）")
    private String bizCode;

    /**
     * 支付状态
     */
    @ApiModelProperty("支付状态")
    private String payStatusName;

    /**
     * 关联业务编号
     */
    @ApiModelProperty("关联业务编号")
    private String businessNo;

    /**
     * 实际付款日期(结算模块返回)
     */
    @ApiModelProperty("实际付款日期(结算模块返回)")
    private String relPaymentDate;

    /**
     * 单据编号(结算模块返回)
     */
    @ApiModelProperty("单据编号(结算模块返回)")
    private String orderNo;

    /**
     * 支付类型
     */
    @ApiModelProperty("支付类型")
    private BigDecimal payType;

    /**
     * 收款方单位id
     */
    @ApiModelProperty("收款方单位id")
    private String receiveOrgId;

    /**
     * 收款方单位编号
     */
    @ApiModelProperty("收款方单位编号")
    private String receiveOrgCode;

    /**
     * 收款方单位名称
     */
    @ApiModelProperty("收款方单位名称")
    private String receiveOrgName;

    /**
     * 调拨币种Code
     */
    @ApiModelProperty("调拨币种Code")
    private String allocationCurrencyCode;

    /**
     * 调拨币种名称
     */
    @ApiModelProperty("调拨币种名称")
    private String allocationCurrencyName;

    /**
     * 支付方式,1银企直连、2线下网银、3先拨后支
     */
    @ApiModelProperty("支付方式,1银企直连、2线下网银、3先拨后支")
    private BigDecimal paymentMethod;

    /**
     * 请款申请业务类型,基础模块-业务类型设置ID
     */
    @ApiModelProperty("请款申请业务类型,基础模块-业务类型设置ID")
    private String applyPayBusinessType;

    /**
     * 请款申请业务类型,基础模块-业务类型设置CODE
     */
    @ApiModelProperty("请款申请业务类型,基础模块-业务类型设置CODE")
    private String applyPayBusinessTypeCode;

    /**
     * 请款申请业务类型名称,基础模块-业务类型设置NAME
     */
    @ApiModelProperty("请款申请业务类型名称,基础模块-业务类型设置NAME")
    private String applyPayBusinessTypeName;

    /**
     * 是否占预算1是，2否
     */
    @ApiModelProperty("是否占预算1是，2否")
    private BigDecimal occupationBudget;

    /**
     * 摘要
     */
    @ApiModelProperty("摘要")
    private String summaryAbstract;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String commentRemark;

    /**
     * 支付方式名称
     */
    @ApiModelProperty("支付方式名称")
    private String paymentMethodName;

}
