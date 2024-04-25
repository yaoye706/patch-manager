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
 * 应收单据和收款单据的映射表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("应收单据和收款单据的映射表")
@Table(value = "t_armg_receivable_or_receipt")
public class TArmgReceivableOrReceipt implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @Id
    @ApiModelProperty("主键id")
    private String id;

    /**
     * 应收单据id
     */
    @ApiModelProperty("应收单据id")
    private String receivableId;

    /**
     * 收款单据id
     */
    @ApiModelProperty("收款单据id")
    private String collectId;

    /**
     * 单据排序
     */
    @ApiModelProperty("单据排序")
    private String pageSize;

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

}
