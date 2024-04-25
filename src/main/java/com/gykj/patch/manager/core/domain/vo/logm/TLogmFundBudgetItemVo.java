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
 * 资金预算使用表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("资金预算使用表")
@Table(value = "T_LOGM_FUND_BUDGET_ITEM")
public class TLogmFundBudgetItemVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 表ID唯一主键
     */
    @Id
    @ApiModelProperty("表ID唯一主键")
    private String id;

    /**
     * 申请单ID
     */
    @ApiModelProperty("申请单ID")
    private String applyId;

    /**
     * 单据编号
     */
    @ApiModelProperty("单据编号")
    private String orderNo;

    /**
     * 资金预算明细ID
     */
    @ApiModelProperty("资金预算明细ID")
    private String budgetId;

    /**
     * 资金预算项目编号
     */
    @ApiModelProperty("资金预算项目编号")
    private String budgetCode;

    /**
     * 资金预算项目名称
     */
    @ApiModelProperty("资金预算项目名称")
    private String budgetName;

    /**
     * 预算填报单位id
     */
    @ApiModelProperty("预算填报单位id")
    private String budgetUnitId;

    /**
     * 预算填报单元名称
     */
    @ApiModelProperty("预算填报单元名称")
    private String budgetUnitName;

    /**
     * 周期类型id
     */
    @ApiModelProperty("周期类型id")
    private String periodTypeId;

    /**
     * 周期类型名称
     */
    @ApiModelProperty("周期类型名称")
    private String periodTypeName;

    /**
     * 占用/释放金额
     */
    @ApiModelProperty("占用/释放金额")
    private BigDecimal budgetAmount;

    /**
     * 可用额度
     */
    @ApiModelProperty("可用额度")
    private BigDecimal usedAmount;

    /**
     * 单据币种
     */
    @ApiModelProperty("单据币种")
    private String currencyCode;

    /**
     * 预算币种
     */
    @ApiModelProperty("预算币种")
    private String budgetCurrencyCode;

    /**
     * 币种名称
     */
    @ApiModelProperty("币种名称")
    private String budgetCurrencyName;

    /**
     * 汇率
     */
    @ApiModelProperty("汇率")
    private BigDecimal exchangeRate;

    /**
     * 汇率折算金额
     */
    @ApiModelProperty("汇率折算金额")
    private BigDecimal convertAmount;

    /**
     * 体系编号
     */
    @ApiModelProperty("体系编号")
    private String systemCode;

    /**
     * 体系名称
     */
    @ApiModelProperty("体系名称")
    private String systemName;

    /**
     * 预算类型1占用2释放3保存
     */
    @ApiModelProperty("预算类型1占用2释放3保存")
    private BigDecimal budgetType;

    /**
     * 数据状态 0无效；1有效
     */
    @ApiModelProperty("数据状态 0无效；1有效")
    private BigDecimal dataStatus;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private String createTime;

    /**
     * 创建人编号
     */
    @ApiModelProperty("创建人编号")
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
     * 修改人编号
     */
    @ApiModelProperty("修改人编号")
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
     * 预算币种名称
     */
    @ApiModelProperty("预算币种名称")
    private String currencyName;

    /**
     * 是否补录单据（1是2否）
     */
    @ApiModelProperty("是否补录单据（1是2否）")
    private BigDecimal route;

    /**
     * 预算项目id
     */
    @ApiModelProperty("预算项目id")
    private String itemId;

    /**
     * 部分占用成功时，需要释放金额
     */
    @ApiModelProperty("部分占用成功时，需要释放金额")
    private BigDecimal releaseAmount;

    /**
     * 流水号
     */
    @ApiModelProperty("流水号")
    private String serialNo;

    /**
     * 租户ID
     */
    @ApiModelProperty("租户ID")
    private String tenantId;

    /**
     * 周期体系id
     */
    @ApiModelProperty("周期体系id")
    private String periodSystemId;

    /**
     * 周期体系code
     */
    @ApiModelProperty("周期体系code")
    private String periodSystemCode;

    /**
     * 周期体系名称
     */
    @ApiModelProperty("周期体系名称")
    private String periodSystemName;

    /**
     * 周期区间id
     */
    @ApiModelProperty("周期区间id")
    private String rangeId;

    /**
     * 周期区间名称
     */
    @ApiModelProperty("周期区间名称")
    private String reportColumn;

}
