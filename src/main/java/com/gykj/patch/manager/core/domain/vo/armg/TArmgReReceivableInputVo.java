package com.gykj.patch.manager.core.domain.vo.armg;

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
 * 应收单录入 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("应收单录入")
@Table(value = "T_ARMG_RE_RECEIVABLE_INPUT")
public class TArmgReReceivableInputVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @Id
    @ApiModelProperty("id")
    private String id;

    /**
     * 单据编号
     */
    @ApiModelProperty("单据编号")
    private String businessNo;

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
     * 单据来源:1应收款、2接口平台
     */
    @ApiModelProperty("单据来源:1应收款、2接口平台")
    private BigDecimal businessSource;

    /**
     * 收款类型:1银行账户收款、2现金收款、3支票收款、4收到承兑汇票、5收到信用证、6收到承兑交单
     */
    @ApiModelProperty("收款类型:1银行账户收款、2现金收款、3支票收款、4收到承兑汇票、5收到信用证、6收到承兑交单")
    private BigDecimal receiptType;

    /**
     * 收款子类型:1转账收款、2承兑汇票收款、3转账支票收款、4信用证收款、5承兑交单收款
     */
    @ApiModelProperty("收款子类型:1转账收款、2承兑汇票收款、3转账支票收款、4信用证收款、5承兑交单收款")
    private BigDecimal receiptSubType;

    /**
     * 业务类型:(基础模块获取)
     */
    @ApiModelProperty("业务类型:(基础模块获取)")
    private String businessType;

    /**
     * 业务类型名称
     */
    @ApiModelProperty("业务类型名称")
    private String businessTypeName;

    /**
     * 对内收款:0否1是
     */
    @ApiModelProperty("对内收款:0否1是")
    private BigDecimal isInternal;

    /**
     * 预计收款日期
     */
    @ApiModelProperty("预计收款日期")
    private String receiptEstimateTime;

    /**
     * 收款单位
     */
    @ApiModelProperty("收款单位")
    private String receiptOrgId;

    /**
     * 收款单位编号
     */
    @ApiModelProperty("收款单位编号")
    private String receiptOrgCode;

    /**
     * 收款单位名称
     */
    @ApiModelProperty("收款单位名称")
    private String receiptOrgName;

    /**
     * 收款账号ID
     */
    @ApiModelProperty("收款账号ID")
    private String receiptAccountId;

    /**
     * 收款账号
     */
    @ApiModelProperty("收款账号")
    private String receiptAccountNo;

    /**
     * 收款账号名称
     */
    @ApiModelProperty("收款账号名称")
    private String receiptAccountName;

    /**
     * 收款开户单位
     */
    @ApiModelProperty("收款开户单位")
    private String receiptDepositCompany;

    /**
     * 收款开户银行
     */
    @ApiModelProperty("收款开户银行")
    private String receiptDepositBank;

    /**
     * 收款开户银行号(预留)
     */
    @ApiModelProperty("收款开户银行号(预留)")
    private String receiptDepositNo;

    /**
     * 收款币种
     */
    @ApiModelProperty("收款币种")
    private String currencyCode;

    /**
     * 收款币种名称
     */
    @ApiModelProperty("收款币种名称")
    private String currencyName;

    /**
     * 收款金额
     */
    @ApiModelProperty("收款金额")
    private BigDecimal receiptAmount;

    /**
     * 票证类型/凭证类型:(实物模块获取)或1转账支票、2现金支票
     */
    @ApiModelProperty("票证类型/凭证类型:(实物模块获取)或1转账支票、2现金支票")
    private String vouType;

    /**
     * 票证类型/凭证类型名称
     */
    @ApiModelProperty("票证类型/凭证类型名称")
    private String vouTypeName;

    /**
     * 票据介质:1电子、2纸质
     */
    @ApiModelProperty("票据介质:1电子、2纸质")
    private BigDecimal draftCategory;

    /**
     * 票据类型: 1银行承兑汇票、2商业承兑汇票
     */
    @ApiModelProperty("票据类型: 1银行承兑汇票、2商业承兑汇票")
    private BigDecimal draftType;

    /**
     * 信用证类型:(信用证模块获取)
     */
    @ApiModelProperty("信用证类型:(信用证模块获取)")
    private String creditType;

    /**
     * 信用证类型名称
     */
    @ApiModelProperty("信用证类型名称")
    private String creditTypeName;

    /**
     * 国内/国际:1国内信用证、2国际信用证
     */
    @ApiModelProperty("国内/国际:1国内信用证、2国际信用证")
    private BigDecimal homeOrAbroad;

    /**
     * 承兑交单类型:(承兑交单模块获取)
     */
    @ApiModelProperty("承兑交单类型:(承兑交单模块获取)")
    private String apdmType;

    /**
     * 承兑交单类型名称
     */
    @ApiModelProperty("承兑交单类型名称")
    private String apdmTypeName;

    /**
     * 摘要
     */
    @ApiModelProperty("摘要")
    private String abstractInfo;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remarks;

    /**
     * 付款单位
     */
    @ApiModelProperty("付款单位")
    private String payOrgId;

    /**
     * 付款单位编号
     */
    @ApiModelProperty("付款单位编号")
    private String payOrgCode;

    /**
     * 付款单位名称
     */
    @ApiModelProperty("付款单位名称")
    private String payOrgName;

    /**
     * 付款账号ID
     */
    @ApiModelProperty("付款账号ID")
    private String payAccountId;

    /**
     * 付款账号
     */
    @ApiModelProperty("付款账号")
    private String payAccountNo;

    /**
     * 付款账号名称
     */
    @ApiModelProperty("付款账号名称")
    private String payAccountName;

    /**
     * 付款开户单位
     */
    @ApiModelProperty("付款开户单位")
    private String payOpenUnit;

    /**
     * 付款开户银行
     */
    @ApiModelProperty("付款开户银行")
    private String payDepositBank;

    /**
     * 付款开户银行号(预留)
     */
    @ApiModelProperty("付款开户银行号(预留)")
    private String payDepositNo;

    /**
     * 省KEY(预留)
     */
    @ApiModelProperty("省KEY(预留)")
    private String payProvinceKey;

    /**
     * 省名称(预留)
     */
    @ApiModelProperty("省名称(预留)")
    private String payProvinceName;

    /**
     * 市KEY(预留)
     */
    @ApiModelProperty("市KEY(预留)")
    private String payCityKey;

    /**
     * 市名称(预留)
     */
    @ApiModelProperty("市名称(预留)")
    private String payCityName;

    /**
     * 付款方性质：1企业、2个人
     */
    @ApiModelProperty("付款方性质：1企业、2个人")
    private BigDecimal payNatureType;

    /**
     * 核销方式:1自动核销、2手动核销
     */
    @ApiModelProperty("核销方式:1自动核销、2手动核销")
    private BigDecimal writeoffType;

    /**
     * 核销状态:1未核销、2部分核销、3已核销
     */
    @ApiModelProperty("核销状态:1未核销、2部分核销、3已核销")
    private BigDecimal writeoffStatus;

    /**
     * 监控状态:0无效1有效
     */
    @ApiModelProperty("监控状态:0无效1有效")
    private BigDecimal monitorStatus;

    /**
     * 审批状态:1已保存、2审批中、3审批拒绝、4审批通过、5提交失败、6撤销中、7已撤销
     */
    @ApiModelProperty("审批状态:1已保存、2审批中、3审批拒绝、4审批通过、5提交失败、6撤销中、7已撤销")
    private BigDecimal approvalStatus;

    /**
     * 记录状态:0无效1有效
     */
    @ApiModelProperty("记录状态:0无效1有效")
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
     * 索引
     */
    @ApiModelProperty("索引")
    private String updateTime;

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
     * 乐观锁
     */
    @ApiModelProperty("乐观锁")
    private BigDecimal dataVersion;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * 审批日期
     */
    @ApiModelProperty("审批日期")
    private String approvalDate;

    /**
     * 坏账计提余额
     */
    @ApiModelProperty("坏账计提余额")
    private BigDecimal badDebtAmount;

    /**
     * 接口平台退回路劲
     */
    @ApiModelProperty("接口平台退回路劲")
    private String returnUrl;

    /**
     * 接口来源编码
     */
    @ApiModelProperty("接口来源编码")
    private String sourceCode;

    /**
     * 接口来源名称
     */
    @ApiModelProperty("接口来源名称")
    private String sourceName;

    /**
     * 已核销金额
     */
    @ApiModelProperty("已核销金额")
    private BigDecimal writeOffAmount;

    /**
     * 付款方性质（基础模块默认）
     */
    @ApiModelProperty("付款方性质（基础模块默认）")
    private BigDecimal cpOrgProperty;

    /**
     * 客商类型:1供应商 2客户
     */
    @ApiModelProperty("客商类型:1供应商 2客户")
    private BigDecimal contactsOrgType;

    /**
     * 账期
     */
    @ApiModelProperty("账期")
    private String accountPeriod;

    /**
     * 合同开始日期
     */
    @ApiModelProperty("合同开始日期")
    private String contractStartDate;

    /**
     * 入账日期
     */
    @ApiModelProperty("入账日期")
    private String receiptDate;

    private String typeStatus;

}
