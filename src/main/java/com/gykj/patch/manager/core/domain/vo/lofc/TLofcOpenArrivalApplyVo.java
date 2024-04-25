package com.gykj.patch.manager.core.domain.vo.lofc;

import com.mybatisflex.annotation.Column;
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
 * 应付,到单申请表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("应付,到单申请表")
@Table(value = "T_LOFC_OPEN_ARRIVAL_APPLY")
public class TLofcOpenArrivalApplyVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 表ID唯一主键
     */
    @Id
    @ApiModelProperty("表ID唯一主键")
    private String id;

    /**
     * 记录状态 0无效；1有效
     */
    @ApiModelProperty("记录状态 0无效；1有效")
    private BigDecimal dataStatus;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private String createTime;

    /**
     * 创建人编码
     */
    @ApiModelProperty("创建人编码")
    private String createByCode;

    /**
     * 创建人名称
     */
    @ApiModelProperty("创建人名称")
    private String createByName;

    /**
     * 修改人编码
     */
    @ApiModelProperty("修改人编码")
    private String updateByCode;

    /**
     * 修改人名称
     */
    @ApiModelProperty("修改人名称")
    private String updateByName;

    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private String updateTime;

    /**
     * 乐观锁
     */
    @ApiModelProperty("乐观锁")
    private BigDecimal dataVersion;

    /**
     * 流水号
     */
    @ApiModelProperty("流水号")
    private String serialNo;

    /**
     * 流程号
     */
    @ApiModelProperty("流程号")
    private String processNo;

    /**
     * 关联信用证表id
     */
    @ApiModelProperty("关联信用证表id")
    private String creditId;

    /**
     * 到单日期
     */
    @ApiModelProperty("到单日期")
    private String arrivalTime;

    /**
     * 承兑日期
     */
    @ApiModelProperty("承兑日期")
    private String acceptTime;

    /**
     * 寄单日期
     */
    @ApiModelProperty("寄单日期")
    private String sendTime;

    /**
     * 预计付款时间
     */
    @ApiModelProperty("预计付款时间")
    private String expectPaytime;

    /**
     * 币种类型
     */
    @ApiModelProperty("币种类型")
    private String currencyType;

    /**
     * 币种名称
     */
    @ApiModelProperty("币种名称")
    private String currencyName;

    /**
     * 到单金额
     */
    @ApiModelProperty("到单金额")
    private BigDecimal applyAmount;

    /**
     * 折算币种开证金额
     */
    @ApiModelProperty("折算币种开证金额")
    private BigDecimal creditAmount;

    /**
     * 物流单号
     */
    @ApiModelProperty("物流单号")
    private String logisticsNum;

    /**
     * 货物描述
     */
    @ApiModelProperty("货物描述")
    private String goodsDescription;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remarks;

    /**
     * 单据状态
     */
    @ApiModelProperty("单据状态")
    private BigDecimal applyStatus;

    /**
     * 审批状态
     */
    @ApiModelProperty("审批状态")
    private BigDecimal approvalStatus;

    /**
     * 拒付原因
     */
    @ApiModelProperty("拒付原因")
    private String refuseReason;

    /**
     * 类型1到单通知2到单承付
     */
    @ApiModelProperty("类型1到单通知2到单承付")
    private BigDecimal type;

    /**
     * 类型为到单承付关联的到单通知id
     */
    @ApiModelProperty("类型为到单承付关联的到单通知id")
    private String noticeId;

    /**
     * 承兑类型1承付2拒付
     */
    @ApiModelProperty("承兑类型1承付2拒付")
    private BigDecimal commitmentType;

    /**
     * 是否资金调拨0否1是
     */
    @ApiModelProperty("是否资金调拨0否1是")
    private BigDecimal isAllot;

    /**
     * 期望调拨时间
     */
    @ApiModelProperty("期望调拨时间")
    private String allotTime;

    /**
     * 调拨金额
     */
    @ApiModelProperty("调拨金额")
    private BigDecimal allotAmount;

    /**
     * 收款账户id
     */
    @ApiModelProperty("收款账户id")
    private String receiveAccountId;

    /**
     * 收款账户名称
     */
    @ApiModelProperty("收款账户名称")
    private String receiveAccountName;

    /**
     * 收款账户开户行
     */
    @ApiModelProperty("收款账户开户行")
    private String receiveAccountBankname;

    /**
     * 收款账户账号
     */
    @ApiModelProperty("收款账户账号")
    private String receiveAccountNo;

    /**
     * 付款账户id
     */
    @ApiModelProperty("付款账户id")
    private String payAccountId;

    /**
     * 付款账户名称
     */
    @ApiModelProperty("付款账户名称")
    private String payAccountName;

    /**
     * 付款账户开户行
     */
    @ApiModelProperty("付款账户开户行")
    private String payAccountBankname;

    /**
     * 付款账户账号
     */
    @ApiModelProperty("付款账户账号")
    private String payAccountNo;

    /**
     * 调拨用途
     */
    @ApiModelProperty("调拨用途")
    private String purpose;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * businessNo 单据编号
     */
    @ApiModelProperty("businessNo 单据编号")
    private String businessNo;

    /**
     * 联动的到单状态
     */
    @Column(value = "orderStatus")
    @ApiModelProperty("联动的到单状态")
    private BigDecimal orderStatus;

    /**
     * 是否提醒，1：是，2：否
     */
    @ApiModelProperty("是否提醒，1：是，2：否")
    private BigDecimal isRemind;

    /**
     * exchangeRate 汇率
     */
    @ApiModelProperty("exchangeRate 汇率")
    private BigDecimal exchangeRate;

    /**
     * 是否有不符点1是，2否
     */
    @ApiModelProperty("是否有不符点1是，2否")
    private BigDecimal haveDiscrepancy;

    /**
     * 不符点描述
     */
    @ApiModelProperty("不符点描述")
    private String discrepancyDesc;

    /**
     * 交单表ID
     */
    @ApiModelProperty("交单表ID")
    private String deliveryOrderId;

    /**
     * 变更前信息json字符串
     */
    @ApiModelProperty("变更前信息json字符串")
    private String oldInfoJson;

    /**
     * 变更后信息json字符串
     */
    @ApiModelProperty("变更后信息json字符串")
    private String newInfoJson;

    /**
     * 变更原因
     */
    @ApiModelProperty("变更原因")
    private String changeReason;

    /**
     * 是否请款申请1是2否
     */
    @ApiModelProperty("是否请款申请1是2否")
    private BigDecimal isApplyPay;

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
     * 付款类型1、资金调拨，2、请款申请
     */
    @ApiModelProperty("付款类型1、资金调拨，2、请款申请")
    private BigDecimal payType;

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
     * 是否请款申请1是2否
     */
    @ApiModelProperty("是否请款申请1是2否")
    private BigDecimal isRequest;

    /**
     * 贴现利率
     */
    @ApiModelProperty("贴现利率")
    private BigDecimal discountRate;

    /**
     * 贴现日期
     */
    @ApiModelProperty("贴现日期")
    private String discountDate;

    /**
     * 流程贯穿号
     */
    @ApiModelProperty("流程贯穿号")
    private String globalBusinessNo;

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
     * 收款方币种编号
     */
    @ApiModelProperty("收款方币种编号")
    private String receiveCurrencyType;

    /**
     * 收款方币种名称
     */
    @ApiModelProperty("收款方币种名称")
    private String receiveCurrencyName;

    /**
     * 支付方式名称
     */
    @ApiModelProperty("支付方式名称")
    private String paymentMethodName;

    /**
     * 收款账户币种
     */
    @ApiModelProperty("收款账户币种")
    private String acctCurrencyCode;

    /**
     * 本位币
     */
    @ApiModelProperty("本位币")
    private String standardCurrency;

    /**
     * 本位币名称
     */
    @ApiModelProperty("本位币名称")
    private String standardCurrencyName;

    /**
     * 附件ID
     */
    @ApiModelProperty("附件ID")
    private String attachmentId;

    /**
     * 融资状态  1:未融资  2:融资处理中  3:已融资  4:已融资结清
     */
    @ApiModelProperty("融资状态  1:未融资  2:融资处理中  3:已融资  4:已融资结清")
    private BigDecimal financingStatus;

    /**
     * 应付管理关联业务单号
     */
    @ApiModelProperty("应付管理关联业务单号")
    private String applyId;

    /**
     * 数据来源：空：本功能 ；2接口
     */
    @ApiModelProperty("数据来源：空：本功能 ；2接口")
    private BigDecimal dataSource;

    /**
     * 模块编号
     */
    @ApiModelProperty("模块编号")
    private String moduleCode;

    /**
     * 模块服务名
     */
    @ApiModelProperty("模块服务名")
    private String moduleServiceName;

    /**
     * 回调Url
     */
    @ApiModelProperty("回调Url")
    private String callBackUrl;

    /**
     * 上下文
     */
    @ApiModelProperty("上下文")
    private String moduleContextPath;

    /**
     * 付款单位id
     */
    @ApiModelProperty("付款单位id")
    private String paymentOrgId;

    /**
     * 付款单位编号
     */
    @ApiModelProperty("付款单位编号")
    private String paymentOrgCode;

    /**
     * 付款单位名称
     */
    @ApiModelProperty("付款单位名称")
    private String paymentOrgName;

}
