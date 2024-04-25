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
 * 收证交单登记 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("收证交单登记")
@Table(value = "T_LOFC_REC_DELIVERY_ORDER")
public class TLofcRecDeliveryOrder implements Serializable {

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
     * 1,待单登记中 2.已交单待收款  3,收款登记中 4,已收款
     */
    @ApiModelProperty("1,待单登记中 2.已交单待收款  3,收款登记中 4,已收款")
    private BigDecimal businessStatus;

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
     * 交单日期
     */
    @ApiModelProperty("交单日期")
    private String deliveryOrderDate;

    /**
     * 交单金额
     */
    @ApiModelProperty("交单金额")
    private BigDecimal deliveryOrderAmount;

    /**
     * 币种名称
     */
    @ApiModelProperty("币种名称")
    private String currencyName;

    /**
     * 币种
     */
    @ApiModelProperty("币种")
    private String currencyType;

    /**
     * 承兑日期
     */
    @ApiModelProperty("承兑日期")
    private String acceptanceDate;

    /**
     * 折算开证币种金额
     */
    @ApiModelProperty("折算开证币种金额")
    private BigDecimal convertedAmount;

    /**
     * 预计收款日期
     */
    @ApiModelProperty("预计收款日期")
    private String expectedCollectionDate;

    /**
     * 寄单日期
     */
    @ApiModelProperty("寄单日期")
    private String sendBillDate;

    /**
     * 物流号
     */
    @ApiModelProperty("物流号")
    private String logisticsNo;

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
     * 汇率
     */
    @ApiModelProperty("汇率")
    private BigDecimal deliveryRate;

    /**
     * 是否提醒，是：1，否：2
     */
    @ApiModelProperty("是否提醒，是：1，否：2")
    private BigDecimal isRemind;

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
     * 议付银行名称
     */
    @ApiModelProperty("议付银行名称")
    private String negotiationBankName;

    /**
     * 业务类型,空：交单，2：交单承付
     */
    @ApiModelProperty("业务类型,空：交单，2：交单承付")
    private BigDecimal businessType;

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
     * 被修改的交单登记记录ID
     */
    @ApiModelProperty("被修改的交单登记记录ID")
    private String deliveryOrderId;

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
     * 融资状态  1:未融资  2:融资处理中  3:已融资  4:已融资结清
     */
    @ApiModelProperty("融资状态  1:未融资  2:融资处理中  3:已融资  4:已融资结清")
    private BigDecimal financingStatus;

    /**
     * 应付管理关联锁定标识  1、未锁定  2、锁定
     */
    @ApiModelProperty("应付管理关联锁定标识  1、未锁定  2、锁定")
    private BigDecimal lockStatus;

    /**
     * 锁定交单外围模块业务编号
     */
    @ApiModelProperty("锁定交单外围模块业务编号")
    private String lockOutBusinessNo;

}
