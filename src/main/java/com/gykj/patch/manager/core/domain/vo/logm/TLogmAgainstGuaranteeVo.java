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
 * 反担保信息表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("反担保信息表")
@Table(value = "t_logm_against_guarantee")
public class TLogmAgainstGuaranteeVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @ApiModelProperty("主键")
    private String id;

    /**
     * 反担保类型1抵押2质押
     */
    @ApiModelProperty("反担保类型1抵押2质押")
    private String gurtType;

    /**
     * 抵押人/出质人名称
     */
    @ApiModelProperty("抵押人/出质人名称")
    private String guarantyName;

    /**
     * 押品类型名称
     */
    @ApiModelProperty("押品类型名称")
    private String collateralTypeName;

    /**
     * 押品类型编码
     */
    @ApiModelProperty("押品类型编码")
    private String collateralTypeCode;

    /**
     * 币种CODE
     */
    @ApiModelProperty("币种CODE")
    private String currencyType;

    /**
     * 币种名称
     */
    @ApiModelProperty("币种名称")
    private String currencyName;

    /**
     * 实际抵质押价值
     */
    @ApiModelProperty("实际抵质押价值")
    private BigDecimal againstPledge;

    /**
     * 抵押权人/抵押权人名称
     */
    @ApiModelProperty("抵押权人/抵押权人名称")
    private String guarantyPowerName;

    /**
     * 担保，保证抵押质押信息表id
     */
    @ApiModelProperty("担保，保证抵押质押信息表id")
    private String gurtContractId;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String description;

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

}
