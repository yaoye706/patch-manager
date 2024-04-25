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
 * 信用证开证授信合同  实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("信用证开证授信合同 ")
@Table(value = "T_LOFC_CG_CONTRACT")
public class TLofcCgContract implements Serializable {

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
     * cgContractCode 授信合同号
     */
    @ApiModelProperty("cgContractCode 授信合同号")
    private String contractNo;

    /**
     * officeName授信银行
     */
    @ApiModelProperty("officeName授信银行")
    private String officeName;

    /**
     * creditName 授信品种
     */
    @ApiModelProperty("creditName 授信品种")
    private String credtiName;

    /**
     * credtiId授信品种id
     */
    @ApiModelProperty("credtiId授信品种id")
    private String creditId;

    /**
     * currencyId 币种
     */
    @ApiModelProperty("currencyId 币种")
    private String currencyId;

    /**
     * occupyAmount 占用金额
     */
    @ApiModelProperty("occupyAmount 占用金额")
    private BigDecimal occupyAmount;

    /**
     * availableBalance 授信余额
     */
    @ApiModelProperty("availableBalance 授信余额")
    private BigDecimal availableBalance;

    /**
     * exchangeRate 汇率
     */
    @ApiModelProperty("exchangeRate 汇率")
    private BigDecimal exchangeRate;

    /**
     * amount 占用金额折算
     */
    @ApiModelProperty("amount 占用金额折算")
    private BigDecimal amount;

    /**
     * associatedID 关联单据ID
     */
    @ApiModelProperty("associatedID 关联单据ID")
    private String associatedId;

    /**
     * associatedType 关联单据类型:1开证申请,2开证登记,3开证修改,4信用证
     */
    @ApiModelProperty("associatedType 关联单据类型:1开证申请,2开证登记,3开证修改,4信用证")
    private BigDecimal associatedType;

    /**
     * 授信开始日期
     */
    @ApiModelProperty("授信开始日期")
    private String startDate;

    /**
     * 授信结束日期
     */
    @ApiModelProperty("授信结束日期")
    private String endDate;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * 调整前后标识 1、调整前  2、调整后
     */
    @ApiModelProperty("调整前后标识 1、调整前  2、调整后")
    private BigDecimal beforeorafter;

}
