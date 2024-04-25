package com.gykj.patch.manager.core.domain.vo.logm;

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
 * 担保.保证.抵押.质押信息表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("担保.保证.抵押.质押信息表")
@Table(value = "t_logm_guar_contract")
public class TLogmGuarContractVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @ApiModelProperty("主键")
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
    private Integer creditorType;

    /**
     * 担保方式1第三方保证、2第三方质押、3第三方抵押、4第三方信用担保、5抵押、6质押
     */
    @ApiModelProperty("担保方式1第三方保证、2第三方质押、3第三方抵押、4第三方信用担保、5抵押、6质押")
    private Integer gurtWay;

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
     * 被担保方code
     */
    @ApiModelProperty("被担保方code")
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
    private Integer gurtNameType;

    /**
     * 担保方id
     */
    @ApiModelProperty("担保方id")
    private String gurtId;

    /**
     * 担保方code
     */
    @ApiModelProperty("担保方code")
    private String gurtCode;

    /**
     * 担保方name
     */
    @ApiModelProperty("担保方name")
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
    private String gurtAmount;

    /**
     * 担保余额
     */
    @ApiModelProperty("担保余额")
    private String usableGurtAmount;

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
    private Integer gurtLinesType;

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
     * 1手动2选择
     */
    @ApiModelProperty("1手动2选择")
    private Integer addOrSelect;

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
     * 是否反向生成
     */
    @ApiModelProperty("是否反向生成")
    private Integer logmReverse;

    /**
     * 关联单据ID
     */
    @ApiModelProperty("关联单据ID")
    private String contractId;

    /**
     * 单据类型1开函2收函
     */
    @ApiModelProperty("单据类型1开函2收函")
    private Integer letterType;

    /**
     * 数据类型1申请，2登记，3变更，4废弃，5结束，6生效
     */
    @ApiModelProperty("数据类型1申请，2登记，3变更，4废弃，5结束，6生效")
    private Integer dataType;

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
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private String createTime;

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
    private Integer dataVersion;

    /**
     * 审批状态 已保存、审批中、审批拒绝、审批通过
     */
    @ApiModelProperty("审批状态 已保存、审批中、审批拒绝、审批通过")
    private Integer flowsStatus;

    /**
     * 数据状态 0无效；1有效
     */
    @ApiModelProperty("数据状态 0无效；1有效")
    private Integer dataStatus;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * 担保金额是否循环 1是2否
     */
    @ApiModelProperty("担保金额是否循环 1是2否")
    private Integer gurtAmountCycle;

    /**
     * 是否允许多个融资合同关联 1是2否
     */
    @ApiModelProperty("是否允许多个融资合同关联 1是2否")
    private Integer gurtConnectCycle;

}
