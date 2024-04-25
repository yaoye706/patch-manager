package com.gykj.patch.manager.core.dao.armg.entity;

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
 * 资金预算项关联表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("资金预算项关联表")
@Table(value = "T_ARMG_RE_BUDGET_ITEM")
public class TArmgReBudgetItem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @Id
    @ApiModelProperty("id")
    private String id;

    /**
     * 关联id-索引
     */
    @ApiModelProperty("关联id-索引")
    private String relationId;

    /**
     * 关联种类:1应收单2收款单
     */
    @ApiModelProperty("关联种类:1应收单2收款单")
    private BigDecimal relationType;

    /**
     * 关联种类名称
     */
    @ApiModelProperty("关联种类名称")
    private String relationTypeName;

    /**
     * 资金预算编码
     */
    @ApiModelProperty("资金预算编码")
    private String itemCode;

    /**
     * 资金预算名称
     */
    @ApiModelProperty("资金预算名称")
    private String itemName;

    /**
     * 上级预算项目名称
     */
    @ApiModelProperty("上级预算项目名称")
    private String fatherItemName;

    /**
     * 占用金额（默认收款金额，可修改）
     */
    @ApiModelProperty("占用金额（默认收款金额，可修改）")
    private String userAmount;

    /**
     * 占用金额币种(默认收款币种)
     */
    @ApiModelProperty("占用金额币种(默认收款币种)")
    private String userCurrencyCode;

    /**
     * 占用金额币种名称(默认收款币种)
     */
    @ApiModelProperty("占用金额币种名称(默认收款币种)")
    private String userCurrencyName;

    /**
     * 汇率
     */
    @ApiModelProperty("汇率")
    private String exchangeRate;

    /**
     * 占用金额折算
     */
    @ApiModelProperty("占用金额折算")
    private String convertAmount;

    /**
     * 折算币种（默认预算币种）
     */
    @ApiModelProperty("折算币种（默认预算币种）")
    private String currencyCode;

    /**
     * 折算币种名称（默认预算币种）
     */
    @ApiModelProperty("折算币种名称（默认预算币种）")
    private String currencyName;

    /**
     * 所属预算体系
     */
    @ApiModelProperty("所属预算体系")
    private String systemId;

    /**
     * 所属预算体系名称
     */
    @ApiModelProperty("所属预算体系名称")
    private String systemName;

    /**
     * 周期体系
     */
    @ApiModelProperty("周期体系")
    private String periodSystemId;

    /**
     * 周期体系编号
     */
    @ApiModelProperty("周期体系编号")
    private String periodSystemCode;

    /**
     * 周期体系名称
     */
    @ApiModelProperty("周期体系名称")
    private String periodSystemName;

    /**
     * 周期类型
     */
    @ApiModelProperty("周期类型")
    private String periodTyepId;

    /**
     * 周期类型名称
     */
    @ApiModelProperty("周期类型名称")
    private String periodTypeName;

    /**
     * 周期区间
     */
    @ApiModelProperty("周期区间")
    private String rangeId;

    /**
     * 周期区间名称
     */
    @ApiModelProperty("周期区间名称")
    private String reportColumn;

    /**
     * 编制金额
     */
    @ApiModelProperty("编制金额")
    private String totalAmount;

    /**
     * 已占用额度
     */
    @ApiModelProperty("已占用额度")
    private String occupyAmount;

    /**
     * 剩余额度
     */
    @ApiModelProperty("剩余额度")
    private String amount;

    /**
     * 记录状态:0无效1有效
     */
    @ApiModelProperty("记录状态:0无效1有效")
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
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

}
