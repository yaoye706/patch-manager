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
 * 承兑交单核销子表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("承兑交单核销子表")
@Table(value = "t_armg_da_cancel_sub")
public class TArmgDaCancelSubVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @Id
    @ApiModelProperty("主键ID")
    private String id;

    /**
     * 主表id
     */
    @ApiModelProperty("主表id")
    private String mainId;

    /**
     * 交易单号
     */
    @ApiModelProperty("交易单号")
    private String transactionNo;

    /**
     * 业务单位
     */
    @ApiModelProperty("业务单位")
    private String businessUnit;

    /**
     * 承兑交单类型 承兑交单管理模块启用状态的类型信息。
     */
    @ApiModelProperty("承兑交单类型 承兑交单管理模块启用状态的类型信息。")
    private String apdmTypeName;

    /**
     * 承兑交单类型id
     */
    @ApiModelProperty("承兑交单类型id")
    private String apdmTypeId;

    /**
     * 托收行
     */
    @ApiModelProperty("托收行")
    private String collectionBank;

    /**
     * 代收行
     */
    @ApiModelProperty("代收行")
    private String agentCollectionBank;

    /**
     * 付款单位
     */
    @ApiModelProperty("付款单位")
    private String payOrgName;

    /**
     * 付款单位Id
     */
    @ApiModelProperty("付款单位Id")
    private String payOrgId;

    /**
     * 交单币种
     */
    @ApiModelProperty("交单币种")
    private String currencyType;

    /**
     * 交单金额
     */
    @ApiModelProperty("交单金额")
    private BigDecimal billAmount;

    /**
     * 承兑日期
     */
    @ApiModelProperty("承兑日期")
    private String acceptanceDate;

    /**
     * 到期日期
     */
    @ApiModelProperty("到期日期")
    private String dueDate;

    /**
     * 货物描述
     */
    @ApiModelProperty("货物描述")
    private String cargoDescription;

    /**
     * 操作类型1新增2选择
     */
    @ApiModelProperty("操作类型1新增2选择")
    private BigDecimal operationType;

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
     * 租户ID
     */
    @ApiModelProperty("租户ID")
    private String tenantId;

}
