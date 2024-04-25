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
 * 信用证核销子表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("信用证核销子表")
@Table(value = "t_armg_credit_cancel_sub")
public class TArmgCreditCancelSubVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @Id
    @ApiModelProperty("主键id")
    private String id;

    /**
     * 主表id
     */
    @ApiModelProperty("主表id")
    private String mainId;

    /**
     * 信用证号
     */
    @ApiModelProperty("信用证号")
    private String locCode;

    /**
     * 受益人
     */
    @ApiModelProperty("受益人")
    private String beneficiary;

    /**
     * 开证单位
     */
    @ApiModelProperty("开证单位")
    private String openLocOrgName;

    /**
     * 开证单位ID
     */
    @ApiModelProperty("开证单位ID")
    private String openLocOrgId;

    /**
     * 开证日期
     */
    @ApiModelProperty("开证日期")
    private String openLocDate;

    /**
     * 开证币种
     */
    @ApiModelProperty("开证币种")
    private String currencyType;

    /**
     * 开证金额
     */
    @ApiModelProperty("开证金额")
    private BigDecimal locAmount;

    /**
     * 国内国际1国内信用证、2国际信用证
     */
    @ApiModelProperty("国内国际1国内信用证、2国际信用证")
    private BigDecimal homeOrAbroad;

    /**
     * 选项：信用证模块启用状态的适用范围属性为公有或收款单位为适用组织的信用证类型。
     */
    @ApiModelProperty("选项：信用证模块启用状态的适用范围属性为公有或收款单位为适用组织的信用证类型。")
    private String locTypeName;

    /**
     * 信用证类型id
     */
    @ApiModelProperty("信用证类型id")
    private String locTypeId;

    /**
     * 开证银行
     */
    @ApiModelProperty("开证银行")
    private String openLocBank;

    /**
     * 通知银行
     */
    @ApiModelProperty("通知银行")
    private String notifyBank;

    /**
     * 期限
     */
    @ApiModelProperty("期限")
    private String term;

    /**
     * 有效期
     */
    @ApiModelProperty("有效期")
    private String validityTerm;

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
     * 交单单号
     */
    @ApiModelProperty("交单单号")
    private String businessNo;

    /**
     * 核算单位
     */
    @ApiModelProperty("核算单位")
    private String accountUnit;

    /**
     * 交单日期
     */
    @ApiModelProperty("交单日期")
    private String deliveryOrderDate;

    /**
     * 预计收款日期
     */
    @ApiModelProperty("预计收款日期")
    private String expectedCollectDate;

    /**
     * 交单币种
     */
    @ApiModelProperty("交单币种")
    private String daCurrency;

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
     * 信用证id
     */
    @ApiModelProperty("信用证id")
    private String creditId;

    /**
     * 交单登记id
     */
    @ApiModelProperty("交单登记id")
    private String deliveryId;

    /**
     * 单据类型 1信用证 2信用证交单
     */
    @ApiModelProperty("单据类型 1信用证 2信用证交单")
    private BigDecimal dataType;

    /**
     * 租户ID
     */
    @ApiModelProperty("租户ID")
    private String tenantId;

}
