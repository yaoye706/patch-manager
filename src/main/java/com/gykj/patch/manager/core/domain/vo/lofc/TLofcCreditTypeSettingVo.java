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
 * 信用证类型设置表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("信用证类型设置表")
@Table(value = "T_LOFC_CREDIT_TYPE_SETTING")
public class TLofcCreditTypeSettingVo implements Serializable {

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
     * 信用证类型编号
     */
    @ApiModelProperty("信用证类型编号")
    private String creditTypeCode;

    /**
     * 信用证类型
     */
    @ApiModelProperty("信用证类型")
    private String creditTypeName;

    /**
     * 适用币种
     */
    @ApiModelProperty("适用币种")
    private String currencyType;

    /**
     * 适用币种名称
     */
    @ApiModelProperty("适用币种名称")
    private String currencyName;

    /**
     * 是否占用授信
     */
    @ApiModelProperty("是否占用授信")
    private BigDecimal isOccupyCredit;

    /**
     * 授信品种id
     */
    @ApiModelProperty("授信品种id")
    private String creditVarieties;

    /**
     * 授信品种名称
     */
    @ApiModelProperty("授信品种名称")
    private String creditVarietiesName;

    /**
     * 是否占用担保
     */
    @ApiModelProperty("是否占用担保")
    private BigDecimal isOccupyGuarantee;

    /**
     * 适用范围属性，1：公有，2：私有
     */
    @ApiModelProperty("适用范围属性，1：公有，2：私有")
    private BigDecimal suitableScope;

    /**
     * 适用组织id
     */
    @ApiModelProperty("适用组织id")
    private String suitableOrgId;

    /**
     * 适用组织Code
     */
    @ApiModelProperty("适用组织Code")
    private String suitableOrgCode;

    /**
     * 适用组织Name
     */
    @ApiModelProperty("适用组织Name")
    private String suitableOrgName;

    /**
     * 信用证大类，1：即期信用证，2：承兑信用证，3：延付信用证，4：假远期信用证
     */
    @ApiModelProperty("信用证大类，1：即期信用证，2：承兑信用证，3：延付信用证，4：假远期信用证")
    private BigDecimal creditMainType;

    /**
     * 显示资金调拨信息
     */
    @ApiModelProperty("显示资金调拨信息")
    private BigDecimal showFundAllocate;

    /**
     * 显示开证人/受益人账户信息
     */
    @ApiModelProperty("显示开证人/受益人账户信息")
    private BigDecimal showAccountFlag;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    /**
     * 启停标识 1启用 2停用
     */
    @ApiModelProperty("启停标识 1启用 2停用")
    private BigDecimal startOrStop;

    /**
     * 应付单业务类型
     */
    @ApiModelProperty("应付单业务类型")
    private String paymentBusinessType;

    /**
     * 应付单类型类型名称
     */
    @ApiModelProperty("应付单类型类型名称")
    private String paymentBusinessTypeName;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * 付款类型1、资金调拨，2、请款申请
     */
    @ApiModelProperty("付款类型1、资金调拨，2、请款申请")
    private BigDecimal payType;

    /**
     * 是否占用融资计划1是，2否
     */
    @ApiModelProperty("是否占用融资计划1是，2否")
    private BigDecimal occupyFinancingPlan;

    /**
     * 融资计划方式ID
     */
    @ApiModelProperty("融资计划方式ID")
    private String financingPlanId;

    /**
     * 融资计划方式CODE
     */
    @ApiModelProperty("融资计划方式CODE")
    private String financingPlanCode;

    /**
     * 融资计划方式NAME
     */
    @ApiModelProperty("融资计划方式NAME")
    private String financingPlanName;

    /**
     * 融资计划控制方式1、刚性控制；2、柔性控制；3、不控制
     */
    @ApiModelProperty("融资计划控制方式1、刚性控制；2、柔性控制；3、不控制")
    private String controllerMode;

    /**
     * 融资计划新旧1新，2旧
     */
    @ApiModelProperty("融资计划新旧1新，2旧")
    private BigDecimal financingPlanOldNew;

}
