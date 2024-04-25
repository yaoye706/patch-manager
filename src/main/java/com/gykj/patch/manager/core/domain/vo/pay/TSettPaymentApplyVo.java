package com.gykj.patch.manager.core.domain.vo.pay;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.Table;
import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 付款申请表 实体类。
 *
 * @author yaoye
 * @since 2024-04-12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "T_SETT_PAYMENT_APPLY")
public class TSettPaymentApplyVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 表ID唯一主键
     */
    @Id
    private String id;

    /**
     * 单据编号(唯一)
     */
    private String orderNo;

    /**
     * 主单编号(对私批量时值为单据编号)
     */
    private String mainOrderNo;

    /**
     * 付款类型1单笔付款 10资金调拨 2对私批量 16承兑汇票开票 17承兑汇票背书 9TT付款 6现金付款 5支票付款
     */
    private BigDecimal payType;

    /**
     * 付款日期(不带时分秒)
     */
    private String paymentDate;

    /**
     * 实际付款日期
     */
    private String relPaymentDate;

    /**
     * 业务类型ID
     */
    private String businessTypeId;

    /**
     * 业务类型名称
     */
    private String businessTypeName;

    /**
     * 外部系统单据编号(部分合并付款时有多个,分隔)
     */
    private String extOrderNo;

    /**
     * 应付单单据编号(部分合并付款时有多个,分隔)
     */
    private String billsPayOrderNo;

    /**
     * 单据来源 数据字典SettDataSource
     */
    private String dataSource;

    /**
     * 付款单位ID
     */
    private String payOrgId;

    /**
     * 付款单位编号
     */
    private String payOrgCode;

    /**
     * 付款单位名称
     */
    private String payOrgName;

    /**
     * 拨付单位ID(支付方式先拨后支有值)
     */
    private String appropriateOrgId;

    /**
     * 拨付单位编号(支付方式先拨后支有值)
     */
    private String appropriateOrgCode;

    /**
     * 拨付单位名称(支付方式先拨后支有值)
     */
    private String appropriateOrgName;

    /**
     * 付款金融机构类型 1 银行 2 第三方 3 结算中心 4 财务公司
     */
    private BigDecimal payAcctInstitutionType;

    /**
     * 付款方银行账号ID
     */
    private String payAccountId;

    /**
     * 付款方银行账号
     */
    private String payAccountNo;

    /**
     * 付款方账户名称
     */
    private String payAccountName;

    /**
     * 付款方开户行名称
     */
    private String payBranchName;

    /**
     * 付款方直连银行
     */
    private String payDirectBank;

    /**
     * 付款方开户行所属省
     */
    private String payAreaNameOfProvince;

    /**
     * 付款方开户行所属市
     */
    private String payAreaNameOfCity;

    /**
     * 付款方开户行联行号
     */
    private String payBranchCode;

    /**
     * 内部账户ID(机构类型为结算中有值)
     */
    private String innerAccountId;

    /**
     * 内部账户号(机构类型为结算中有值)
     */
    private String innerAccountNo;

    /**
     * 收款方单位ID
     */
    private String receiveOpenOrgId;

    /**
     * 收款方单位编号
     */
    private String receiveOpenOrgCode;

    /**
     * 收款方单位名称
     */
    private String receiveOpenOrgName;

    /**
     * 收款方银行账号
     */
    private String receiveAccountNo;

    /**
     * 收款方账户名称
     */
    private String receiveAccountName;

    /**
     * 收款方所属省
     */
    private String receiveAreaNameOfProvince;

    /**
     * 收款方所属市
     */
    private String receiveAreaNameOfCity;

    /**
     * 收款方开户行名称
     */
    private String receiveBranchName;

    /**
     * 收款方性质 1.企业 2.个人
     */
    private BigDecimal receiveNature;

    /**
     * 收款金融机构类型 1 银行 2 第三方 3 结算中心 4 财务公司
     */
    private BigDecimal receiveAcctInstitutionType;

    /**
     * 收款方直连银行(BOC)
     */
    private String recDirectBank;

    /**
     * 收款方开户行直联行号
     */
    private String receiveBranchCode;

    /**
     * 是否对内付款 1.是 2.否
     */
    private BigDecimal whetherInnerPay;

    /**
     * 支付方式 1.直联支付 2.线下支付 3.全额支付 4.差额支付
     */
    private BigDecimal payChannel;

    /**
     * 是否转线下支付 1.是 2.否
     */
    private BigDecimal whetherTurnOffLine;

    /**
     * 付款金额
     */
    private BigDecimal payAmount;

    /**
     * 对私金额(批量对私有值)
     */
    private BigDecimal privateAmount;

    /**
     * 币种(CNY)
     */
    private String payCurrencyType;

    /**
     * 币种名称
     */
    private String payCurrencyName;

    /**
     * 是否加急 1.是 2.否
     */
    private BigDecimal whetherUrgent;

    /**
     * 是否落地 1.是 2.否
     */
    private BigDecimal whetherGround;

    /**
     * 审批状态 1.已保存 2.审批中 3.审批拒绝 4.审批通过
     */
    private BigDecimal approvalStatus;

    /**
     * 业务状态 1.发起申请 2.待受理 3.受理中 4.受理拒绝 5.待支付 6.支付处理中 7.支付失败 8.支付成功 9.部分支付成功 10.支付异常 11.已退款
     */
    private BigDecimal payStatus;

    /**
     * 单据状态 1.正常 2.作废
     */
    private BigDecimal applyStatus;

    /**
     * 接口处理状态 1.待发送2.处理中3.处理成功4.接口校验失败
     */
    private BigDecimal interfaceProcessStatus;

    /**
     * 银企或线下返回码配置操作 1.自动退回 2.不自动退回
     */
    private BigDecimal icipOperation;

    /**
     * 失败原因
     */
    private String failureReason;

    /**
     * 单据类型 1.应付单 2.申请单 3.补录单 4.应付单受理
     */
    private BigDecimal orderType;

    /**
     * 付款用途
     */
    private String payUse;

    /**
     * 对私批量用途
     */
    private String privatePayUse;

    /**
     * 摘要(无效字段，用付款用途)
     */
    private String memo;

    /**
     * 备注
     */
    private String remark;

    /**
     * 记录状态 0.无效 1.有效
     */
    private BigDecimal dataStatus;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建人编号
     */
    private String createByCode;

    /**
     * 创建人名称
     */
    private String createByName;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 修改人编号
     */
    private String updateByCode;

    /**
     * 修改人名称
     */
    private String updateByName;

    /**
     * 乐观锁
     */
    private BigDecimal dataVersion;

    /**
     * 开户单位ID
     */
    private String openOrgId;

    /**
     * 开户单位名称
     */
    private String openOrgName;

    /**
     * 开户单位编号
     */
    private String openOrgCode;

    /**
     * 申请日期(默认提交日期)票据背书有值
     */
    private String applyDate;

    /**
     * 付款方直连银行名称
     */
    private String payDirectBankName;

    /**
     * 收款方直连银行名称
     */
    private String recDirectBankName;

    /**
     * 生成日记账类型(为2生成) 1.不生成 2.指令生成生成 3.流水认领生成
     */
    private BigDecimal generateJournal;

    /**
     * 优先级(0为最高) 0.不确定 1.高 2.中 3.低 
     */
    private BigDecimal priority;

    /**
     * 收款方支行ID
     */
    private String receiveBranchId;

    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 收款方币种(CNY)
     */
    private String receiveCurrencyType;

    /**
     * 收款方币种名称
     */
    private String receiveCurrencyName;

    /**
     * 空白凭证类型编号
     */
    private String voucherCode;

    /**
     * 空白凭证类型名称
     */
    private String voucherName;

    /**
     * 核销状态 1. 待核销 2 核销中 3 部分核销 4 已核销 5 核销退回
     */
    private BigDecimal verificatStatus;

    /**
     * 是否主单标识,批量对私时子单标识为2
     */
    private BigDecimal mainFlg;

    /**
     * 收款方名称
     */
    private String receiveName;

    /**
     * 租户ID
     */
    private String tenantId;

    /**
     * 流程贯穿号
     */
    private String globalBusinessNo;

    /**
     * 支付成功金额（含退款金额）
     */
    private BigDecimal paySucAmount;

    /**
     * 退款金额
     */
    private BigDecimal refundAmount;

    /**
     * 是否存在退款业务 1是 2否
     */
    private BigDecimal refundFlg;

    /**
     * 应付单与付款单一致的关联流水号
     */
    private String dealSerialNo;

    /**
     * 对接信用证业务字段 1 开证申请 2 到单承付 3 付款登记  4 开证修改 
     */
    private String locBusiness;

    /**
     * 资金用途（国资）编号
     */
    private String useFundsCode;

    /**
     * 资金用途（国资）名称
     */
    private String useFundsName;

    /**
     * 是否黑名单1是2否
     */
    private BigDecimal recBlack;

    /**
     * 收付单位是否同名1是2否
     */
    private BigDecimal sameUnit;

    /**
     * 外加属性1
     */
    private String attr1;

    /**
     * 外加属性2
     */
    private String attr2;

    /**
     * 外加属性3
     */
    private String attr3;

    /**
     * 外加属性4
     */
    private String attr4;

    /**
     * 外加属性5
     */
    private String attr5;

    /**
     * 外加属性6
     */
    private String attr6;

    /**
     * 外加属性7
     */
    private String attr7;

    /**
     * 外加属性8
     */
    private String attr8;

    /**
     * 外加属性9
     */
    private String attr9;

    /**
     * 提交日期
     */
    private String submitDate;

    /**
     * 提交人名称
     */
    private String submitTime;

    private String submitterCode;

    private String submitterName;

    /**
     * 业务类型编号
     */
    private String businessTypeCode;

    @CsvBindByName(column = "type_status")
    private String typeStatus;

}
