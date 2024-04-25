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
 * 信用证开证费用信息 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("信用证开证费用信息")
@Table(value = "T_LOFC_FEE")
public class TLofcFeeVo implements Serializable {

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
     * 费用收取方式
     */
    @ApiModelProperty("费用收取方式")
    private BigDecimal feeCollectType;

    /**
     * 费用比率
     */
    @ApiModelProperty("费用比率")
    private BigDecimal feeRate;

    /**
     * 汇率
     */
    @ApiModelProperty("汇率")
    private BigDecimal exchangeRate;

    /**
     * 币种
     */
    @ApiModelProperty("币种")
    private String currencyType;

    /**
     * 金额
     */
    @ApiModelProperty("金额")
    private BigDecimal amount;

    /**
     * 关联单据ID
     */
    @ApiModelProperty("关联单据ID")
    private String associatedId;

    /**
     * 关联单据类型:1开证申请,2开证登记,3开证修改,4信用证
     */
    @ApiModelProperty("关联单据类型:1开证申请,2开证登记,3开证修改,4信用证")
    private BigDecimal associatedType;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * 币种名称
     */
    @ApiModelProperty("币种名称")
    private String currencyName;

    /**
     * 调整前后标识 1、调整前  2、调整后
     */
    @ApiModelProperty("调整前后标识 1、调整前  2、调整后")
    private BigDecimal beforeorafter;

    /**
     * 费用支付方
     */
    @ApiModelProperty("费用支付方")
    private BigDecimal feePaymentMethod;

    /**
     * 费用支付单位id
     */
    @ApiModelProperty("费用支付单位id")
    private String feePaymentOrgId;

    /**
     * 费用支付单位编码
     */
    @ApiModelProperty("费用支付单位编码")
    private String feePaymentOrgCode;

    /**
     * 费用支付单位名称
     */
    @ApiModelProperty("费用支付单位名称")
    private String feePaymentOrgName;

    /**
     * 费用支付账号id
     */
    @ApiModelProperty("费用支付账号id")
    private String feePaymentAccountId;

    /**
     * 费用支付账号编码
     */
    @ApiModelProperty("费用支付账号编码")
    private String feePaymentAccountCode;

    /**
     * 费用支付账号名称
     */
    @ApiModelProperty("费用支付账号名称")
    private String feePaymentAccountName;

}
