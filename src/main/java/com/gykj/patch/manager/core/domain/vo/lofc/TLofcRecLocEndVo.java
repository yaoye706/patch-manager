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
 * 收证结束登记表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("收证结束登记表")
@Table(value = "T_LOFC_REC_LOC_END")
public class TLofcRecLocEndVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 表ID唯一主键
     */
    @Id
    @ApiModelProperty("表ID唯一主键")
    private String id;

    /**
     * 记录状态 0无效；1有效
     */
    @ApiModelProperty("记录状态 0无效；1有效")
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
    private BigDecimal dataVersion;

    /**
     * 审批流程状态
     */
    @ApiModelProperty("审批流程状态")
    private BigDecimal approvalStatus;

    /**
     * 流水号
     */
    @ApiModelProperty("流水号")
    private String serialNo;

    /**
     * 流程号
     */
    @ApiModelProperty("流程号")
    private String processNo;

    /**
     * 收款信用证id
     */
    @ApiModelProperty("收款信用证id")
    private String creditId;

    /**
     * 结束日期
     */
    @ApiModelProperty("结束日期")
    private String endDate;

    /**
     * 结束方式，1:正常结束，2：异常结束
     */
    @ApiModelProperty("结束方式，1:正常结束，2：异常结束")
    private BigDecimal endWay;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    /**
     * 收款信用证余额
     */
    @ApiModelProperty("收款信用证余额")
    private BigDecimal recCreditBalance;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * 单据编号
     */
    @ApiModelProperty("单据编号")
    private String businessNo;

    /**
     * 收证结束说明
     */
    @ApiModelProperty("收证结束说明")
    private String recLocEndDescription;

    /**
     * 流程贯穿号
     */
    @ApiModelProperty("流程贯穿号")
    private String globalBusinessNo;

}
