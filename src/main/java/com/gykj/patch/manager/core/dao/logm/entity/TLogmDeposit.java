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
 * 保证金信息表 实体类。
 *
 * @author yaoye
 * @since 2024-04-23
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("保证金信息表")
@Table(value = "t_logm_deposit")
public class TLogmDeposit implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @ApiModelProperty("主键")
    private String id;

    /**
     * 担保方式：7、保证金担保
     */
    @ApiModelProperty("担保方式：7、保证金担保")
    private Integer gurtWay;

    /**
     * 申请单号
     */
    @ApiModelProperty("申请单号")
    private String businessNo;

    /**
     * 申请单位编号
     */
    @ApiModelProperty("申请单位编号")
    private String orgCode;

    /**
     * 申请单位名称
     */
    @ApiModelProperty("申请单位名称")
    private String orgName;

    /**
     * 币种编码
     */
    @ApiModelProperty("币种编码")
    private String currencyType;

    /**
     * 币种名称
     */
    @ApiModelProperty("币种名称")
    private String currencyName;

    /**
     * 保证金金额
     */
    @ApiModelProperty("保证金金额")
    private BigDecimal gurtAmount;

    /**
     * 保证金额比例=保证金金额/融资金额*100%
     */
    @ApiModelProperty("保证金额比例=保证金金额/融资金额*100%")
    private BigDecimal marginScale;

    /**
     * 保证金账户id
     */
    @ApiModelProperty("保证金账户id")
    private String acctId;

    /**
     * 保证金账户no
     */
    @ApiModelProperty("保证金账户no")
    private String acctNo;

    /**
     * 保证金账户name
     */
    @ApiModelProperty("保证金账户name")
    private String acctName;

    /**
     * 存款性质。1.活期保证金 2.定期保证金
     */
    @ApiModelProperty("存款性质。1.活期保证金 2.定期保证金")
    private Integer depositNature;

    /**
     * 是否计息1是2否
     */
    @ApiModelProperty("是否计息1是2否")
    private Integer interestStatus;

    /**
     * 利率
     */
    @ApiModelProperty("利率")
    private BigDecimal rate;

    /**
     * 结息方式。按月、按季、按半年、按年、利随本清、到期一次、其他
     */
    @ApiModelProperty("结息方式。按月、按季、按半年、按年、利随本清、到期一次、其他")
    private Integer settWay;

    /**
     * 开始日期
     */
    @ApiModelProperty("开始日期")
    private String startDate;

    /**
     * 结束日期
     */
    @ApiModelProperty("结束日期")
    private String endDate;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String description;

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
     * 数据类型1申请，2登记，3变更，4废弃，5结束，6生效
     */
    @ApiModelProperty("数据类型1申请，2登记，3变更，4废弃，5结束，6生效")
    private Integer dataType;

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
     * 担保责任比例
     */
    @ApiModelProperty("担保责任比例")
    private BigDecimal gurtDutyScale;

    /**
     * 汇率(%)
     */
    @ApiModelProperty("汇率(%)")
    private BigDecimal contractRate;

    /**
     * 本次担保额度
     */
    @ApiModelProperty("本次担保额度")
    private BigDecimal gurtQuota;

    /**
     * 占用金额折算
     */
    @ApiModelProperty("占用金额折算")
    private BigDecimal occuptAmount;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * 是否抵扣授信;0否；1是  默认0
     */
    @ApiModelProperty("是否抵扣授信;0否；1是  默认0")
    private BigDecimal deductCred;

    /**
     * 银行存单号;银行存款模块存单号
     */
    @ApiModelProperty("银行存单号;银行存款模块存单号")
    private String bankDepositNo;

    /**
     * 存款品种编码
     */
    @ApiModelProperty("存款品种编码")
    private String depositProductCode;

    /**
     * 存款品种名称
     */
    @ApiModelProperty("存款品种名称")
    private String depositProductName;

    /**
     * 新增或选择 1--新增，2--选择
     */
    @ApiModelProperty("新增或选择 1--新增，2--选择")
    private BigDecimal addOrSelect;

    /**
     * 折算币种编码
     */
    @ApiModelProperty("折算币种编码")
    private String convertCurrencyCode;

    /**
     * 折算币种名称
     */
    @ApiModelProperty("折算币种名称")
    private String convertCurrencyName;

    /**
     * 保证金业务编号
     */
    @ApiModelProperty("保证金业务编号")
    private String depositRegisterBusinessNo;

    /**
     * 品种id
     */
    @ApiModelProperty("品种id")
    private String depositProductId;

}
