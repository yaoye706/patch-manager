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
 * 现金收款核销子表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("现金收款核销子表")
@Table(value = "t_armg_cash_cancel_sub")
public class TArmgCashCancelSub implements Serializable {

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
     * 现金账号名称
     */
    @ApiModelProperty("现金账号名称")
    private String cashAccountName;

    /**
     * 收款现金账号
     */
    @ApiModelProperty("收款现金账号")
    private String receiptCashAccount;

    /**
     * 所属单位
     */
    @ApiModelProperty("所属单位")
    private String orgId;

    /**
     * 所属单位ID
     */
    @ApiModelProperty("所属单位ID")
    private String orgName;

    /**
     * 入库时间
     */
    @ApiModelProperty("入库时间")
    private String storageDate;

    /**
     * 入库金额
     */
    @ApiModelProperty("入库金额")
    private BigDecimal storageAmount;

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
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private String createTime;

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

    /**
     * 所属单位id
     */
    @ApiModelProperty("所属单位id")
    private String orgCode;

    /**
     * 收款账号id
     */
    @ApiModelProperty("收款账号id")
    private String accountId;

}
