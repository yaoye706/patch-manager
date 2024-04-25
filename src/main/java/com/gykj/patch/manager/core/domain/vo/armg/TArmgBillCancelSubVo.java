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
 * 承兑汇票核销子表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("承兑汇票核销子表")
@Table(value = "t_armg_bill_cancel_sub")
public class TArmgBillCancelSubVo implements Serializable {

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
     * 票据号码
     */
    @ApiModelProperty("票据号码")
    private String daraftCode;

    /**
     * 票据介质1电子2纸质
     */
    @ApiModelProperty("票据介质1电子2纸质")
    private BigDecimal daraftCategory;

    /**
     * 票据类型1银行承兑汇票2商业承兑汇票
     */
    @ApiModelProperty("票据类型1银行承兑汇票2商业承兑汇票")
    private BigDecimal daraftType;

    /**
     * 出票日期
     */
    @ApiModelProperty("出票日期")
    private String drawDate;

    /**
     * 票面金额
     */
    @ApiModelProperty("票面金额")
    private BigDecimal faceAmount;

    /**
     * 出票人
     */
    @ApiModelProperty("出票人")
    private String drawerName;

    /**
     * 汇票到期日
     */
    @ApiModelProperty("汇票到期日")
    private String billDueDate;

    /**
     * 出票人开户银行
     */
    @ApiModelProperty("出票人开户银行")
    private String drawerOpenBank;

    /**
     * 承兑人
     */
    @ApiModelProperty("承兑人")
    private String acceptor;

    /**
     * 前手交易人
     */
    @ApiModelProperty("前手交易人")
    private String formerTrader;

    /**
     * 持票人
     */
    @ApiModelProperty("持票人")
    private String ticketHolder;

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


    private String typeStatus;


}
