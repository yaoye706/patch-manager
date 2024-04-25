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
 * 信用证开证担保合同表  实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("信用证开证担保合同表 ")
@Table(value = "T_LOFC_GUARANTEE_CONTRACT")
public class TLofcGuaranteeContractVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @Id
    @ApiModelProperty("id")
    private String id;

    /**
     * 合同号
     */
    @ApiModelProperty("合同号")
    private String contractNo;

    /**
     * 债权方类型1内部2外部
     */
    @ApiModelProperty("债权方类型1内部2外部")
    private BigDecimal creditorType;

    /**
     * 担保方式1第三方保证、2第三方质押、3第三方抵押、4第三方信用担保、5抵押、6质押
     */
    @ApiModelProperty("担保方式1第三方保证、2第三方质押、3第三方抵押、4第三方信用担保、5抵押、6质押")
    private BigDecimal gurtWay;

    /**
     * 债权方id
     */
    @ApiModelProperty("债权方id")
    private String creditorId;

    /**
     * 债权方编码
     */
    @ApiModelProperty("债权方编码")
    private String creditorCode;

    /**
     * 债权方名称
     */
    @ApiModelProperty("债权方名称")
    private String creditorName;

    /**
     * 被担保方id
     */
    @ApiModelProperty("被担保方id")
    private String byGurtId;

    /**
     * 被担保方编码
     */
    @ApiModelProperty("被担保方编码")
    private String byGurtCode;

    /**
     * 被担保方名称
     */
    @ApiModelProperty("被担保方名称")
    private String byGurtName;

    /**
     * 担保人类型1内部单位2外部单位
     */
    @ApiModelProperty("担保人类型1内部单位2外部单位")
    private BigDecimal gurtnametype;

    /**
     * 担保方id
     */
    @ApiModelProperty("担保方id")
    private String gurtId;

    /**
     * 担保方编码
     */
    @ApiModelProperty("担保方编码")
    private String gurtCode;

    /**
     * 担保方名称
     */
    @ApiModelProperty("担保方名称")
    private String gurtName;

    /**
     * 委托担保协议编码
     */
    @ApiModelProperty("委托担保协议编码")
    private String gurtDealCode;

    /**
     * 币种编码
     */
    @ApiModelProperty("币种编码")
    private String currencyType;

    /**
     * 币种名称
     */
    @ApiModelProperty("币种名称")
    private String currencyName;

    /**
     * 担保总金额
     */
    @ApiModelProperty("担保总金额")
    private BigDecimal gurtAmount;

    /**
     * 担保余额
     */
    @ApiModelProperty("担保余额")
    private BigDecimal usableGurtAmount;

    /**
     * 担保起始日
     */
    @ApiModelProperty("担保起始日")
    private String gurtStartDate;

    /**
     * 担保到期日
     */
    @ApiModelProperty("担保到期日")
    private String gurtEndDate;

    /**
     * 关联担保额度编号
     */
    @ApiModelProperty("关联担保额度编号")
    private String gurtLinesCode;

    /**
     * 担保额度币种编码
     */
    @ApiModelProperty("担保额度币种编码")
    private String gurtCurrencyType;

    /**
     * 担保额度币种名称
     */
    @ApiModelProperty("担保额度币种名称")
    private String gurtCurrencyName;

    /**
     * 最高担保额度 1是2否
     */
    @ApiModelProperty("最高担保额度 1是2否")
    private BigDecimal gurtLinesType;

    /**
     * 换算汇率
     */
    @ApiModelProperty("换算汇率")
    private BigDecimal rate;

    /**
     * 担保总额度占用金额
     */
    @ApiModelProperty("担保总额度占用金额")
    private BigDecimal gurtUseAmount;

    /**
     * 用途
     */
    @ApiModelProperty("用途")
    private String instructions;

    /**
     *  1手动2选择
     */
    @ApiModelProperty(" 1手动2选择")
    private BigDecimal addOrSelect;

    /**
     * 合同汇率(%)
     */
    @ApiModelProperty("合同汇率(%)")
    private BigDecimal contractRate;

    /**
     * 担保责任比例(%)
     */
    @ApiModelProperty("担保责任比例(%)")
    private BigDecimal gurtDutyScale;

    /**
     * 本次担保额度
     */
    @ApiModelProperty("本次担保额度")
    private BigDecimal gurtQuota;

    /**
     * 占用金额折算
     */
    @ApiModelProperty("占用金额折算")
    private BigDecimal occuptAmount;

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
     * 是否反向生成1是2否
     */
    @ApiModelProperty("是否反向生成1是2否")
    private BigDecimal reverseGenerated;

    /**
     * 记录状态 0无效1有效
     */
    @ApiModelProperty("记录状态 0无效1有效")
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
     * 修改时间
     */
    @ApiModelProperty("修改时间")
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
     * 连带责任保证
     */
    @ApiModelProperty("连带责任保证")
    private BigDecimal guarantyLiability;

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

    /**
     * 担保金额是否循环 1是2否
     */
    @ApiModelProperty("担保金额是否循环 1是2否")
    private BigDecimal gurtAmountCycle;

    /**
     * 是否允许多个融资合同关联 1是2否
     */
    @ApiModelProperty("是否允许多个融资合同关联 1是2否")
    private BigDecimal gurtConnectCycle;

}
