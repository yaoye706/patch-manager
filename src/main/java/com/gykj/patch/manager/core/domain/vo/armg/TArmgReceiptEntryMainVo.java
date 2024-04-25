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
 * 收款录入主表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("收款录入主表")
@Table(value = "t_armg_receipt_entry_main")
public class TArmgReceiptEntryMainVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @ApiModelProperty("主键")
    private String id;

    /**
     * 单据编号
     */
    @ApiModelProperty("单据编号")
    private String businessNo;

    /**
     * 收款日期
     */
    @ApiModelProperty("收款日期")
    private String receiptDate;

    /**
     * 1收付款、2接口平台
     */
    @ApiModelProperty("1收付款、2接口平台")
    private BigDecimal businessSource;

    /**
     * 收款类型 1银行账户收款、2现金收款、3支票收款、4收到承兑汇票、5收到信用证、6收到承兑交单
     */
    @ApiModelProperty("收款类型 1银行账户收款、2现金收款、3支票收款、4收到承兑汇票、5收到信用证、6收到承兑交单")
    private BigDecimal receiptType;

    /**
     * 收款单位名称
     */
    @ApiModelProperty("收款单位名称")
    private String receiptUnitName;

    /**
     * 收款单位编码
     */
    @ApiModelProperty("收款单位编码")
    private String receiptUnitCode;

    /**
     * 收款单位id
     */
    @ApiModelProperty("收款单位id")
    private String receiptUnitId;

    /**
     * 取基础模块设置中的值自定义
     */
    @ApiModelProperty("取基础模块设置中的值自定义")
    private String businessTypeId;

    /**
     * 业务类型名称
     */
    @ApiModelProperty("业务类型名称")
    private String businessTypeName;

    /**
     * 应收单据编号合并核销多个以逗号隔开
     */
    @ApiModelProperty("应收单据编号合并核销多个以逗号隔开")
    private String receivableNo;

    /**
     * 收款类型为银行转账时  1转账收款、2承兑汇票收款、3转账支票收款、4信用证收款、5承兑交单收款。收款类型为现金收款时 1现金收款、2现金支票收款。
     */
    @ApiModelProperty("收款类型为银行转账时  1转账收款、2承兑汇票收款、3转账支票收款、4信用证收款、5承兑交单收款。收款类型为现金收款时 1现金收款、2现金支票收款。")
    private BigDecimal receiptSubType;

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
     * 收款开户单位 收款方
     */
    @ApiModelProperty("收款开户单位 收款方")
    private String receiptOrgId;

    /**
     * 收款方 开户单位编号
     */
    @ApiModelProperty("收款方 开户单位编号")
    private String receiptOrgCode;

    /**
     * 收款方 开户单位名称
     */
    @ApiModelProperty("收款方 开户单位名称")
    private String receiptOrgName;

    /**
     * 收款方 开户银行
     */
    @ApiModelProperty("收款方 开户银行")
    private String depositBank;

    /**
     * 收款方 收款币种
     */
    @ApiModelProperty("收款方 收款币种")
    private String receiptCurrency;

    /**
     * 收款方 收款币种名称
     */
    @ApiModelProperty("收款方 收款币种名称")
    private String currencyName;

    /**
     * 收款方 对内收款1是2否
     */
    @ApiModelProperty("收款方 对内收款1是2否")
    private BigDecimal isInternal;

    /**
     * 收款方 收款金额
     */
    @ApiModelProperty("收款方 收款金额")
    private BigDecimal receiptAmount;

    /**
     * 票据介质1电子2纸质
     */
    @ApiModelProperty("票据介质1电子2纸质")
    private BigDecimal draftCategory;

    /**
     * 票据类型1银行承兑汇票2商业承兑汇票
     */
    @ApiModelProperty("票据类型1银行承兑汇票2商业承兑汇票")
    private BigDecimal draftType;

    /**
     * 选项：信用证模块启用状态的适用范围属性为公有或收款单位为适用组织的信用证类型。
     */
    @ApiModelProperty("选项：信用证模块启用状态的适用范围属性为公有或收款单位为适用组织的信用证类型。")
    private String creditTypeName;

    /**
     * 信用证类型id
     */
    @ApiModelProperty("信用证类型id")
    private String creditTypeId;

    /**
     * 国际国内1国内信用证2国际信用证
     */
    @ApiModelProperty("国际国内1国内信用证2国际信用证")
    private BigDecimal homeOrAbroad;

    /**
     * 选项：承兑交单管理模块启用状态的类型信息。
     */
    @ApiModelProperty("选项：承兑交单管理模块启用状态的类型信息。")
    private String apdmTypeName;

    /**
     * 承兑交单类型id
     */
    @ApiModelProperty("承兑交单类型id")
    private String apdmTypeId;

    /**
     * 资金预算项目名称
     */
    @ApiModelProperty("资金预算项目名称")
    private String budgetItemName;

    /**
     * 关联查询详情
     */
    @ApiModelProperty("关联查询详情")
    private String budgetItemId;

    /**
     * 摘要
     */
    @ApiModelProperty("摘要")
    private String abstractInfo;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    /**
     * 付款方 付款账号
     */
    @ApiModelProperty("付款方 付款账号")
    private String payAccountNo;

    /**
     * 付款方 付款账号名称
     */
    @ApiModelProperty("付款方 付款账号名称")
    private String payAccountName;

    /**
     * 付款方 付款账号银行
     */
    @ApiModelProperty("付款方 付款账号银行")
    private String payDepositBank;

    /**
     * 付款方性质1企业、2个人
     */
    @ApiModelProperty("付款方性质1企业、2个人")
    private BigDecimal payNatureType;

    /**
     * 付款方 付款开户单位
     */
    @ApiModelProperty("付款方 付款开户单位")
    private String payOpenUnit;

    /**
     * 付款方 付款单位
     */
    @ApiModelProperty("付款方 付款单位")
    private String payOrgId;

    /**
     * 付款方
     */
    @ApiModelProperty("付款方")
    private String payOrgCode;

    /**
     * 付款方
     */
    @ApiModelProperty("付款方")
    private String payOrgName;

    /**
     * 审批流状态：1 已保存 2 审批中 3 审批拒绝 4 审批通过 5 流程异常 6撤销中 7 已撤销
     */
    @ApiModelProperty("审批流状态：1 已保存 2 审批中 3 审批拒绝 4 审批通过 5 流程异常 6撤销中 7 已撤销")
    private BigDecimal approvalStatus;

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
     * 队列状态 队列状态 1待发送 2处理中 3处理成功4校验失败
     */
    @ApiModelProperty("队列状态 队列状态 1待发送 2处理中 3处理成功4校验失败")
    private BigDecimal interfaceProcessStatus;

    /**
     * 返回信息
     */
    @ApiModelProperty("返回信息")
    private String backMsg;

    /**
     * 返回码
     */
    @ApiModelProperty("返回码")
    private String backCode;

    /**
     * 贯穿整个业务流程编号
     */
    @ApiModelProperty("贯穿整个业务流程编号")
    private String processNo;

    /**
     * 审批时间
     */
    @ApiModelProperty("审批时间")
    private String approvalTime;

    /**
     * 已收金额
     */
    @ApiModelProperty("已收金额")
    private BigDecimal writeOffAmount;

    /**
     * 核销方式 1自动核销2手动核销
     */
    @ApiModelProperty("核销方式 1自动核销2手动核销")
    private BigDecimal writeOffType;

    /**
     * 收款账号ID
     */
    @ApiModelProperty("收款账号ID")
    private String receiptAccountId;

    /**
     * 开户银行ID
     */
    @ApiModelProperty("开户银行ID")
    private String depositBankId;

    /**
     * 开户银行编码
     */
    @ApiModelProperty("开户银行编码")
    private String depositBankCode;

    /**
     * 租户ID
     */
    @ApiModelProperty("租户ID")
    private String tenantId;

    /**
     * 是否属于逾期核销:1是，2否
     */
    @ApiModelProperty("是否属于逾期核销:1是，2否")
    private BigDecimal badDebtCancelFlag;

    private String typeStatus;



}
