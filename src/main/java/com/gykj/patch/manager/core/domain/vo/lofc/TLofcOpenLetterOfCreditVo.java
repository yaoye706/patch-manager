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
import java.sql.Clob;

/**
 * 应付信用证申请登记修改表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("应付信用证申请登记修改表")
@Table(value = "T_LOFC_OPEN_LETTER_OF_CREDIT")
public class TLofcOpenLetterOfCreditVo implements Serializable {

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
     * 业务类型:1,开证申请  2,开证登录 3,开证修改
     */
    @ApiModelProperty("业务类型:1,开证申请  2,开证登录 3,开证修改")
    private BigDecimal businessType;

    /**
     * 信用证id,业务类型为开证申请,开证登记为空  业务类型为开证修改,记录对应信用证的id
     */
    @ApiModelProperty("信用证id,业务类型为开证申请,开证登记为空  业务类型为开证修改,记录对应信用证的id")
    private String locId;

    /**
     * 开证申请单关联ID
     */
    @ApiModelProperty("开证申请单关联ID")
    private String applyId;

    /**
     * 审批流程状态
     */
    @ApiModelProperty("审批流程状态")
    private BigDecimal approvalStatus;

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
     * 1申请,2待登记,3登记处理中,4登录退回,5登记生效
     */
    @ApiModelProperty("1申请,2待登记,3登记处理中,4登录退回,5登记生效")
    private BigDecimal businessStatus;

    /**
     * 申请单编号
     */
    @ApiModelProperty("申请单编号")
    private String businessNo;

    /**
     * 信用证号,手动录入
     */
    @ApiModelProperty("信用证号,手动录入")
    private String locCode;

    /**
     * 核算单位
     */
    @ApiModelProperty("核算单位")
    private String orgId;

    /**
     * 核算单位编号
     */
    @ApiModelProperty("核算单位编号")
    private String orgCode;

    /**
     * 核算单位名称
     */
    @ApiModelProperty("核算单位名称")
    private String orgName;

    /**
     * 开证单位id
     */
    @ApiModelProperty("开证单位id")
    private String openLocOrgId;

    /**
     * 开证单位编号
     */
    @ApiModelProperty("开证单位编号")
    private String openLocOrgCode;

    /**
     * 开证单位
     */
    @ApiModelProperty("开证单位")
    private String openLocOrgName;

    /**
     * 信用证类型id
     */
    @ApiModelProperty("信用证类型id")
    private String locTypeId;

    /**
     * 信用证类型编号
     */
    @ApiModelProperty("信用证类型编号")
    private String locTypeCode;

    /**
     * 信用证类型名称
     */
    @ApiModelProperty("信用证类型名称")
    private String locTypeName;

    /**
     * 1,国内信用证 2,国际信用证
     */
    @ApiModelProperty("1,国内信用证 2,国际信用证")
    private BigDecimal homeOrAbroad;

    /**
     * 开证模式:1,直接开证 2,前对背 3,背对背
     */
    @ApiModelProperty("开证模式:1,直接开证 2,前对背 3,背对背")
    private BigDecimal openType;

    /**
     * 集团内:1,是 2,否
     */
    @ApiModelProperty("集团内:1,是 2,否")
    private String insideOrgFlag;

    /**
     * 母证/子证:1,母证 2,子证(收证时,母证)
     */
    @ApiModelProperty("母证/子证:1,母证 2,子证(收证时,母证)")
    private BigDecimal parentOrChild;

    /**
     * 受益人单位id
     */
    @ApiModelProperty("受益人单位id")
    private String favourOrgId;

    /**
     * 受益人单位编号
     */
    @ApiModelProperty("受益人单位编号")
    private String favourOrgCode;

    /**
     * 受益人单位名称
     */
    @ApiModelProperty("受益人单位名称")
    private String favourOrgName;

    /**
     * 开证银行id
     */
    @ApiModelProperty("开证银行id")
    private String openLocBankId;

    /**
     * 开证银行编号
     */
    @ApiModelProperty("开证银行编号")
    private String openLocBankCode;

    /**
     * 开证银行
     */
    @ApiModelProperty("开证银行")
    private String openLocBankName;

    /**
     * 通知银行id
     */
    @ApiModelProperty("通知银行id")
    private String noticeBankId;

    /**
     * 通知银行编号
     */
    @ApiModelProperty("通知银行编号")
    private String noticeBankCode;

    /**
     * 通知银行
     */
    @ApiModelProperty("通知银行")
    private String noticeBankName;

    /**
     * 开证日期
     */
    @ApiModelProperty("开证日期")
    private String openLocDate;

    /**
     * 期限
     */
    @ApiModelProperty("期限")
    private BigDecimal locTerm;

    /**
     * 期限单位:1,天 2,月 3,年
     */
    @ApiModelProperty("期限单位:1,天 2,月 3,年")
    private BigDecimal locTermUnit;

    /**
     * 信用证到期日期
     */
    @ApiModelProperty("信用证到期日期")
    private String dueDate;

    /**
     * 开证金额
     */
    @ApiModelProperty("开证金额")
    private BigDecimal locAmount;

    /**
     * 开证币种
     */
    @ApiModelProperty("开证币种")
    private String currencyType;

    /**
     * 开证币种名称
     */
    @ApiModelProperty("开证币种名称")
    private String currencyName;

    /**
     * 溢短装%
     */
    @ApiModelProperty("溢短装%")
    private BigDecimal moreOrLessRate;

    /**
     * 溢短装总额
     */
    @ApiModelProperty("溢短装总额")
    private BigDecimal moreOrLessAmount;

    /**
     * 是否议付:1,是 2否
     */
    @ApiModelProperty("是否议付:1,是 2否")
    private BigDecimal negotiationFlag;

    /**
     * 议付银行id
     */
    @ApiModelProperty("议付银行id")
    private String negotiationBankId;

    /**
     * 议付银行编号
     */
    @ApiModelProperty("议付银行编号")
    private String negotiationBankCode;

    /**
     * 议付银行
     */
    @ApiModelProperty("议付银行")
    private String negotiationBankName;

    /**
     * 远期天数
     */
    @ApiModelProperty("远期天数")
    private BigDecimal forwardDays;

    /**
     * 贴现利率
     */
    @ApiModelProperty("贴现利率")
    private BigDecimal discountRate;

    /**
     * 承兑币种名称
     */
    @ApiModelProperty("承兑币种名称")
    private String acceptanceCurrencyName;

    /**
     * 承兑币种
     */
    @ApiModelProperty("承兑币种")
    private String acceptanceCurrencyType;

    /**
     * 汇率类型:1,直接报价 2,间接报价
     */
    @ApiModelProperty("汇率类型:1,直接报价 2,间接报价")
    private BigDecimal exchangeRateType;

    /**
     * 汇率
     */
    @ApiModelProperty("汇率")
    private BigDecimal exchangeRate;

    /**
     * 承兑金额
     */
    @ApiModelProperty("承兑金额")
    private BigDecimal acceptanceAmount;

    /**
     * 贸易合同编号
     */
    @ApiModelProperty("贸易合同编号")
    private String tradeContractCode;

    /**
     * 贸易合同名称
     */
    @ApiModelProperty("贸易合同名称")
    private String tradeContractName;

    /**
     * 信用证性质:1,可撤销 2,不可撤销
     */
    @ApiModelProperty("信用证性质:1,可撤销 2,不可撤销")
    private BigDecimal locNature;

    /**
     * 是否有追索权:1,是 2,否
     */
    @ApiModelProperty("是否有追索权:1,是 2,否")
    private BigDecimal recourseFlag;

    /**
     * 是否允许分装:1,是 2,否
     */
    @ApiModelProperty("是否允许分装:1,是 2,否")
    private BigDecimal separateShipmentFlag;

    /**
     * 是否允许转船:1,是 2,否
     */
    @ApiModelProperty("是否允许转船:1,是 2,否")
    private BigDecimal transshipmentFlag;

    /**
     * 最晚装运日期
     */
    @ApiModelProperty("最晚装运日期")
    private String latestShipmentDate;

    /**
     * 起运港
     */
    @ApiModelProperty("起运港")
    private String shipmentPort;

    /**
     * 目地港
     */
    @ApiModelProperty("目地港")
    private String destinationPort;

    /**
     * 提示到期日
     */
    @ApiModelProperty("提示到期日")
    private String reminderDue;

    /**
     * 提示地点ti
     */
    @ApiModelProperty("提示地点ti")
    private String remindePosition;

    /**
     * 开证账户id
     */
    @ApiModelProperty("开证账户id")
    private String openLocAccountId;

    /**
     * 开证账户
     */
    @ApiModelProperty("开证账户")
    private String openLocAccountNo;

    /**
     * 开证账户名称
     */
    @ApiModelProperty("开证账户名称")
    private String openLocAccountName;

    /**
     * 开证账户开户行
     */
    @ApiModelProperty("开证账户开户行")
    private String openLocAccountBankName;

    /**
     * 开证银行地址
     */
    @ApiModelProperty("开证银行地址")
    private String openLocBankAddress;

    /**
     * 开证银行电话
     */
    @ApiModelProperty("开证银行电话")
    private String openLocBankTel;

    /**
     * 开证银行邮编
     */
    @ApiModelProperty("开证银行邮编")
    private String openLocBankPostCode;

    /**
     * 开证银行传真
     */
    @ApiModelProperty("开证银行传真")
    private String openLocBankFax;

    /**
     * 受益人账户id
     */
    @ApiModelProperty("受益人账户id")
    private String favourAccountId;

    /**
     * 受益人账户编号
     */
    @ApiModelProperty("受益人账户编号")
    private String favourAccountNo;

    /**
     * 受益人账户
     */
    @ApiModelProperty("受益人账户")
    private String favourAccountName;

    /**
     * 受益人账户开户行
     */
    @ApiModelProperty("受益人账户开户行")
    private String favourBankName;

    /**
     * 货物描述
     */
    @ApiModelProperty("货物描述")
    private String goodsDescription;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    /**
     * 变更原因
     */
    @ApiModelProperty("变更原因")
    private String changeReason;

    /**
     * 资金调拨：是、否
     */
    @ApiModelProperty("资金调拨：是、否")
    private BigDecimal fundTransfer;

    /**
     * 期望资调拨日期
     */
    @ApiModelProperty("期望资调拨日期")
    private String paymentDate;

    /**
     * 调拨金额
     */
    @ApiModelProperty("调拨金额")
    private BigDecimal paymentAmount;

    /**
     * 调拨币种名称
     */
    @ApiModelProperty("调拨币种名称")
    private String paymentCurrencyName;

    /**
     * 调拨币种
     */
    @ApiModelProperty("调拨币种")
    private String paymentCurrencyType;

    /**
     * 付款方账户id
     */
    @ApiModelProperty("付款方账户id")
    private String payAccountId;

    /**
     * 付款方账户
     */
    @ApiModelProperty("付款方账户")
    private String payAccountNo;

    /**
     * 付款方账户名称
     */
    @ApiModelProperty("付款方账户名称")
    private String payAccountName;

    /**
     * 付款方账户开户行
     */
    @ApiModelProperty("付款方账户开户行")
    private String payBranchName;

    /**
     * 收款方账户id
     */
    @ApiModelProperty("收款方账户id")
    private String receiveAccountId;

    /**
     * 收款方账户
     */
    @ApiModelProperty("收款方账户")
    private String receiveAccountNo;

    /**
     * 收款方账户名称
     */
    @ApiModelProperty("收款方账户名称")
    private String receiveAccountName;

    /**
     * 收款方账户开户行
     */
    @ApiModelProperty("收款方账户开户行")
    private String receiveBranchName;

    /**
     * 付款用途
     */
    @ApiModelProperty("付款用途")
    private String payUse;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * guaranteeMethod;担保方式
     */
    @ApiModelProperty("guaranteeMethod;担保方式")
    private String guaranteeMethod;

    /**
     * 承兑单位id
     */
    @ApiModelProperty("承兑单位id")
    private String acceptanceOrgId;

    /**
     * 承兑单位编号
     */
    @ApiModelProperty("承兑单位编号")
    private String acceptanceOrgCode;

    /**
     * 承兑单位名称
     */
    @ApiModelProperty("承兑单位名称")
    private String acceptanceOrgName;

    /**
     * 结算方式
     */
    @ApiModelProperty("结算方式")
    private String settlementMethod;

    /**
     * 是否结构化产品
     */
    @ApiModelProperty("是否结构化产品")
    private BigDecimal structuredProducts;

    /**
     * 付息方式
     */
    @ApiModelProperty("付息方式")
    private BigDecimal payInterestMethod;

    /**
     * 预计贴现时间
     */
    @ApiModelProperty("预计贴现时间")
    private String estimatedDiscountTime;

    /**
     * 付款类型
     */
    @ApiModelProperty("付款类型")
    private BigDecimal payType;

    /**
     * 摘要
     */
    @ApiModelProperty("摘要")
    private String summaryAbstract;

    /**
     * 资金调拨备注
     */
    @ApiModelProperty("资金调拨备注")
    private String allocationRemark;

    /**
     * 支付方式
     */
    @ApiModelProperty("支付方式")
    private BigDecimal paymentMethod;

    /**
     * 请款申请是否资金调拨
     */
    @ApiModelProperty("请款申请是否资金调拨")
    private BigDecimal fundTransferApply;

    /**
     * 业务类型id
     */
    @ApiModelProperty("业务类型id")
    private String businessTypeId;

    /**
     * 业务类型名称
     */
    @ApiModelProperty("业务类型名称")
    private String businessTypeName;

    /**
     * 是否占预算
     */
    @ApiModelProperty("是否占预算")
    private BigDecimal occupationBudget;

    /**
     * 支付方式名称
     */
    @ApiModelProperty("支付方式名称")
    private String paymentMethodName;

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
     * 附件id
     */
    @ApiModelProperty("附件id")
    private String annexId;

    /**
     * 利息加价
     */
    @ApiModelProperty("利息加价")
    private BigDecimal interestMarkUp;

    /**
     * 流程贯穿号
     */
    @ApiModelProperty("流程贯穿号")
    private String globalBusinessNo;

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
     * 结构化产品使用,申请登记关联ID
     */
    @ApiModelProperty("结构化产品使用,申请登记关联ID")
    private String applyRegisterRelateCode;

    /**
     * 大行名称
     */
    @ApiModelProperty("大行名称")
    private String bankTypeName;

    /**
     * 大行编码
     */
    @ApiModelProperty("大行编码")
    private String bankTypeCode;

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
     * 关联付款单编号
     */
    @ApiModelProperty("关联付款单编号")
    private String externalServiceNo;

    /**
     * 是否直连，1是（大行），2否，(支行)
     */
    @ApiModelProperty("是否直连，1是（大行），2否，(支行)")
    private BigDecimal directType;

    @ApiModelProperty("")
    private Clob oldInfoJson;

    @ApiModelProperty("")
    private Clob newInfoJson;

    /**
     * 受益人所属国家编码
     */
    @ApiModelProperty("受益人所属国家编码")
    private String countryCode;

    /**
     * 受益人所属国家名称
     */
    @ApiModelProperty("受益人所属国家名称")
    private String countryName;

    /**
     * 是否议付
     */
    @ApiModelProperty("是否议付")
    private BigDecimal negotiatePayment;

    /**
     * 议付日期
     */
    @ApiModelProperty("议付日期")
    private String negotiatePaymentDate;

}
