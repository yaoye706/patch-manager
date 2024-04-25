package com.gykj.patch.manager.core.dao.lofc.entity;

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
 * 应收信用证提示登记,登记,修改单据表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("应收信用证提示登记,登记,修改单据表")
@Table(value = "T_LOFC_REC_LETTER_OF_CREDIT")
public class TLofcRecLetterOfCredit implements Serializable {

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
     * 业务类型:1,待登记(开证受益人为内部单位自动生成的记录) 2,收证登记 3,收证修改
     */
    @ApiModelProperty("业务类型:1,待登记(开证受益人为内部单位自动生成的记录) 2,收证登记 3,收证修改")
    private BigDecimal businessType;

    /**
     * 开证时,受益人为内部单位,自动生成的收证待登记记录,在提示收证登记提交后,生成的登记记录,记录中本字段存对应的待登记记录id
     */
    @ApiModelProperty("开证时,受益人为内部单位,自动生成的收证待登记记录,在提示收证登记提交后,生成的登记记录,记录中本字段存对应的待登记记录id")
    private String applyId;

    /**
     * 待登记单据初始为待登记状态,在提示收证登记提交后,变更为已登记,登记记录.默认为空.
1,待登记 2,已登记
     */
    @ApiModelProperty("待登记单据初始为待登记状态,在提示收证登记提交后,变更为已登记,登记记录.默认为空. 1,待登记 2,已登记")
    private BigDecimal businessStatus;

    /**
     * 信用证id,收证登记审批通过后,生成信用证信息,记录信用证id.收证修改,记录修改的信用证的id
     */
    @ApiModelProperty("信用证id,收证登记审批通过后,生成信用证信息,记录信用证id.收证修改,记录修改的信用证的id")
    private String locId;

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
    private BigDecimal insideOrgFlag;

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
     * 提示地点
     */
    @ApiModelProperty("提示地点")
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
     * 开证账户name
     */
    @ApiModelProperty("开证账户name")
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
     * oldInfoJson 合同变更前信息json字符串
     */
    @ApiModelProperty("oldInfoJson 合同变更前信息json字符串")
    private String oldInfoJson;

    /**
     * newInfoJson 合同变更后信息json字符串
     */
    @ApiModelProperty("newInfoJson 合同变更后信息json字符串")
    private String newInfoJson;

    /**
     * 变更原因
     */
    @ApiModelProperty("变更原因")
    private String changeReason;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * 单据编号
     */
    @ApiModelProperty("单据编号")
    private String businessNo;

    /**
     * 结算方式
     */
    @ApiModelProperty("结算方式")
    private String settlementMethod;

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
     * 开证银行直连编号
     */
    @ApiModelProperty("开证银行直连编号")
    private String directCode;

    /**
     * 是否直连
     */
    @ApiModelProperty("是否直连")
    private BigDecimal directType;

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
     * 黑白名单
     */
    @ApiModelProperty("黑白名单")
    private BigDecimal blackOrWhite;

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
