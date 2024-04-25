package com.gykj.patch.manager.core.dao.logm.entity;

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
 * 授信信息表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("授信信息表")
@Table(value = "t_logm_cred_contract")
public class TLogmCredContract implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @ApiModelProperty("主键")
    private String id;

    /**
     * 授信合同号
     */
    @ApiModelProperty("授信合同号")
    private String contractNo;

    /**
     * 授信机构（银行
     */
    @ApiModelProperty("授信机构（银行")
    private String officeName;

    /**
     * 授信品种id
     */
    @ApiModelProperty("授信品种id")
    private String creditId;

    /**
     * 授信品种名称
     */
    @ApiModelProperty("授信品种名称")
    private String creditName;

    /**
     * 币种
     */
    @ApiModelProperty("币种")
    private String currencyId;

    /**
     * 占用金额
     */
    @ApiModelProperty("占用金额")
    private BigDecimal occupyAmount;

    /**
     * 占用金额折算
     */
    @ApiModelProperty("占用金额折算")
    private BigDecimal amount;

    /**
     * 授信余额
     */
    @ApiModelProperty("授信余额")
    private BigDecimal availableBalance;

    /**
     * 汇率
     */
    @ApiModelProperty("汇率")
    private BigDecimal exchangeRate;

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
     * 数据类型1.申请，2.登记，3变更，4生效保函
     */
    @ApiModelProperty("数据类型1.申请，2.登记，3变更，4生效保函")
    private Integer dataType;

    /**
     * 授信开始日期
     */
    @ApiModelProperty("授信开始日期")
    private String startDate;

    /**
     * 授信结束日期
     */
    @ApiModelProperty("授信结束日期")
    private String endDate;

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
