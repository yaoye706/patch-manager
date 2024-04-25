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
 * 费用支付登记 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("费用支付登记")
@Table(value = "T_LOFC_OPEN_FEE_REGISTER")
public class TLofcOpenFeeRegister implements Serializable {

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
     * 申请单编号
     */
    @ApiModelProperty("申请单编号")
    private String businessNo;

    /**
     * 支付日期
     */
    @ApiModelProperty("支付日期")
    private String payTime;

    /**
     * 信用证id
     */
    @ApiModelProperty("信用证id")
    private String creditId;

    /**
     * 费用类型id
     */
    @ApiModelProperty("费用类型id")
    private String feeTypeId;

    /**
     * 费用类型编号
     */
    @ApiModelProperty("费用类型编号")
    private String feeTypeCode;

    /**
     * 费用类型名称
     */
    @ApiModelProperty("费用类型名称")
    private String feeTypeName;

    /**
     * 支付币种类型
     */
    @ApiModelProperty("支付币种类型")
    private String payCurrencyType;

    /**
     * 支付币种名称
     */
    @ApiModelProperty("支付币种名称")
    private String payCurrencyName;

    /**
     * 费用金额
     */
    @ApiModelProperty("费用金额")
    private BigDecimal feeAmount;

    /**
     * 支付账户id
     */
    @ApiModelProperty("支付账户id")
    private String payAccount;

    /**
     * 支付账户名称
     */
    @ApiModelProperty("支付账户名称")
    private String payAccountName;

    /**
     * 支付账户账号
     */
    @ApiModelProperty("支付账户账号")
    private String payAccountNo;

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
     * 信用证对应的费用id
     */
    @ApiModelProperty("信用证对应的费用id")
    private String creditFeeid;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * 流程号
     */
    @ApiModelProperty("流程号")
    private String processNo;

    /**
     * payaccountBankName 支付账户开户行名称
     */
    @ApiModelProperty("payaccountBankName 支付账户开户行名称")
    private String payAccountBankname;

    /**
     * 流程贯穿号
     */
    @ApiModelProperty("流程贯穿号")
    private String globalBusinessNo;

    /**
     * 应收/应付
     */
    @ApiModelProperty("应收/应付")
    private BigDecimal locType;

}
