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
 * 现金支票收款核销子表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("现金支票收款核销子表")
@Table(value = "t_armg_cashbill_cancel_sub")
public class TArmgCashbillCancelSub implements Serializable {

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
     * 票证号
     */
    @ApiModelProperty("票证号")
    private String ticketNo;

    /**
     * 入库日期
     */
    @ApiModelProperty("入库日期")
    private String receiptDate;

    /**
     * 持有人
     */
    @ApiModelProperty("持有人")
    private String holder;

    /**
     * 1.若启用了实物管理，则取实物模块-空白凭证类型维护中勾选是否支付工具且为启用状态的类型。 若未启用实物管理，则下拉框选项有：转账支票、现金支票。
     */
    @ApiModelProperty("1.若启用了实物管理，则取实物模块-空白凭证类型维护中勾选是否支付工具且为启用状态的类型。 若未启用实物管理，则下拉框选项有：转账支票、现金支票。")
    private String ticketType;

    /**
     * 币种
     */
    @ApiModelProperty("币种")
    private String currencyType;

    /**
     * 票证金额
     */
    @ApiModelProperty("票证金额")
    private BigDecimal ticketAmount;

    /**
     * 出票人名称
     */
    @ApiModelProperty("出票人名称")
    private String drawer;

    /**
     * 出票日期
     */
    @ApiModelProperty("出票日期")
    private String drawDate;

    /**
     * 到期日
     */
    @ApiModelProperty("到期日")
    private String dueDate;

    /**
     * 付款期限
     */
    @ApiModelProperty("付款期限")
    private String paymentTerm;

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
     * 流水号
     */
    @ApiModelProperty("流水号")
    private String serialNo;

    /**
     * 租户ID
     */
    @ApiModelProperty("租户ID")
    private String tenantId;

}
