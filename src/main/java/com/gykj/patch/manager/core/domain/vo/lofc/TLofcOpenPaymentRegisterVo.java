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
 * 信用证-付款登记 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("信用证-付款登记")
@Table(value = "T_LOFC_OPEN_PAYMENT_REGISTER")
public class TLofcOpenPaymentRegisterVo implements Serializable {

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
     * 信用证id
     */
    @ApiModelProperty("信用证id")
    private String creditId;

    /**
     * 到单承付id
     */
    @ApiModelProperty("到单承付id")
    private String arrivalId;

    /**
     * 付款时间
     */
    @ApiModelProperty("付款时间")
    private String payTime;

    /**
     * 付款账户id
     */
    @ApiModelProperty("付款账户id")
    private String payAccount;

    /**
     * 付款账户名称
     */
    @ApiModelProperty("付款账户名称")
    private String payAccountName;

    /**
     * 付款账户开户行
     */
    @ApiModelProperty("付款账户开户行")
    private String payAccountBankName;

    /**
     * 付款账户编号
     */
    @ApiModelProperty("付款账户编号")
    private String payAccountNo;

    /**
     * 付款金额
     */
    @ApiModelProperty("付款金额")
    private BigDecimal payAmount;

    /**
     * 币种类型
     */
    @ApiModelProperty("币种类型")
    private String payCurrencyType;

    /**
     * 币种名称
     */
    @ApiModelProperty("币种名称")
    private String payCurrencyName;

    /**
     * 支付资金来源类型（1自有资金、2融资资金、3其他）
     */
    @ApiModelProperty("支付资金来源类型（1自有资金、2融资资金、3其他）")
    private BigDecimal fundSourceType;

    /**
     * 自有资金
     */
    @ApiModelProperty("自有资金")
    private BigDecimal ownFunds;

    /**
     * 其他金额
     */
    @ApiModelProperty("其他金额")
    private BigDecimal otherFunds;

    /**
     * 融资资金
     */
    @ApiModelProperty("融资资金")
    private BigDecimal financingFunds;

    /**
     * 融资合同id
     */
    @ApiModelProperty("融资合同id")
    private String financingContractId;

    /**
     * 融资合同类型
     */
    @ApiModelProperty("融资合同类型")
    private BigDecimal financingContractType;

    /**
     * 融资合同名称
     */
    @ApiModelProperty("融资合同名称")
    private String financingContractName;

    /**
     * 融资合同编号
     */
    @ApiModelProperty("融资合同编号")
    private String financingContractNo;

    /**
     * 审批状态
     */
    @ApiModelProperty("审批状态")
    private BigDecimal approvalStatus;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remarks;

    /**
     * 授信释放金额
     */
    @ApiModelProperty("授信释放金额")
    private BigDecimal releaseAmount;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * 申请单编号
     */
    @ApiModelProperty("申请单编号")
    private String businessNo;

    /**
     * applyStatus 到单状态
     */
    @ApiModelProperty("applyStatus 到单状态")
    private BigDecimal applyStatus;

    /**
     * creditAmount 折算币种开证金额
     */
    @ApiModelProperty("creditAmount 折算币种开证金额")
    private BigDecimal creditAmount;

    /**
     * exchangeRate 汇率
     */
    @ApiModelProperty("exchangeRate 汇率")
    private BigDecimal exchangeRate;

    /**
     * 待释放金额
     */
    @ApiModelProperty("待释放金额")
    private BigDecimal waitReleaseAmount;

    /**
     * 流程贯穿号
     */
    @ApiModelProperty("流程贯穿号")
    private String globalBusinessNo;

    /**
     * 解付标识 1、未解付过 2、已经过解付 已解付数据不能撤销
     */
    @ApiModelProperty("解付标识 1、未解付过 2、已经过解付 已解付数据不能撤销")
    private BigDecimal payoutSign;

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
    private String openLocOrgId;

    /**
     * 付款单位编号
     */
    @ApiModelProperty("付款单位编号")
    private String openLocOrgCode;

    /**
     * 付款单位名称
     */
    @ApiModelProperty("付款单位名称")
    private String openLocOrgName;

}
