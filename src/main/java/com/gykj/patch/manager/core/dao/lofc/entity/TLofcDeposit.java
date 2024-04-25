package com.gykj.patch.manager.core.dao.lofc.entity;

import com.mybatisflex.annotation.Column;
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
 * 信用证开证保证金 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("信用证开证保证金")
@Table(value = "T_LOFC_DEPOSIT")
public class TLofcDeposit implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id 表ID唯一主键
     */
    @Id
    @ApiModelProperty("id 表ID唯一主键")
    private String id;

    /**
     * dataStatus 记录状态 0无效；1有效
     */
    @ApiModelProperty("dataStatus 记录状态 0无效；1有效")
    private BigDecimal dataStatus;

    /**
     * createTime 创建时间
     */
    @ApiModelProperty("createTime 创建时间")
    private String createTime;

    /**
     * createByCode 创建人编码
     */
    @ApiModelProperty("createByCode 创建人编码")
    private String createByCode;

    /**
     * createByName 创建人名称
     */
    @ApiModelProperty("createByName 创建人名称")
    private String createByName;

    /**
     * updateByCode 修改人编码
     */
    @ApiModelProperty("updateByCode 修改人编码")
    private String updateByCode;

    /**
     * updateByName 修改人名称
     */
    @ApiModelProperty("updateByName 修改人名称")
    private String updateByName;

    /**
     * updateTime 修改时间
     */
    @ApiModelProperty("updateTime 修改时间")
    private String updateTime;

    /**
     * dataVersion 乐观锁
     */
    @ApiModelProperty("dataVersion 乐观锁")
    private BigDecimal dataVersion;

    /**
     * 担保方式：7、保证金担保
     */
    @ApiModelProperty("担保方式：7、保证金担保")
    private BigDecimal gurtWay;

    /**
     * businessNo 申请单号
     */
    @ApiModelProperty("businessNo 申请单号")
    private String businessNo;

    /**
     * orgCode 申请单位编号
     */
    @ApiModelProperty("orgCode 申请单位编号")
    private String orgCode;

    /**
     * orgName 申请单位名称
     */
    @ApiModelProperty("orgName 申请单位名称")
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
     * gurtAmount 保证金金额
     */
    @ApiModelProperty("gurtAmount 保证金金额")
    private BigDecimal gurtAmount;

    /**
     *  marginScale保证金比例=保证金金额/借款金额*100
     */
    @ApiModelProperty(" marginScale保证金比例=保证金金额/借款金额*100")
    private BigDecimal marginScale;

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
     *  保证金账户id
     */
    @ApiModelProperty(" 保证金账户id")
    private String acctId;

    /**
     *  保证金账户号
     */
    @ApiModelProperty(" 保证金账户号")
    private String acctNo;

    /**
     *  保证金账户名称
     */
    @ApiModelProperty(" 保证金账户名称")
    private String acctName;

    /**
     * depositNature 存款性质:1活期保证金存款2定期保证金存款
     */
    @ApiModelProperty("depositNature 存款性质:1活期保证金存款2定期保证金存款")
    private BigDecimal depositNature;

    /**
     * startDate 开始日期
     */
    @ApiModelProperty("startDate 开始日期")
    private String startDate;

    /**
     * endDate 到期日期
     */
    @ApiModelProperty("endDate 到期日期")
    private String endDate;

    /**
     * interestStatus 是否计息:1是2否
     */
    @ApiModelProperty("interestStatus 是否计息:1是2否")
    private BigDecimal interestStatus;

    /**
     * rate 利率
     */
    @ApiModelProperty("rate 利率")
    private BigDecimal rate;

    /**
     * settWay 结息方式:1按月结息2按季结息3按半年结息4按年结息
     */
    @ApiModelProperty("settWay 结息方式:1按月结息2按季结息3按半年结息4按年结息")
    private BigDecimal settWay;

    /**
     * associatedID 关联单据ID
     */
    @ApiModelProperty("associatedID 关联单据ID")
    private String associatedId;

    /**
     * associatedType 关联单据类型:1开证申请,2开证登记,3开证修改,4信用证
     */
    @ApiModelProperty("associatedType 关联单据类型:1开证申请,2开证登记,3开证修改,4信用证")
    private BigDecimal associatedType;

    /**
     * 是否反向生成1是2否
     */
    @ApiModelProperty("是否反向生成1是2否")
    private BigDecimal reverseGenerated;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * 添加方式 1新增2选择
     */
    @ApiModelProperty("添加方式 1新增2选择")
    private BigDecimal addOrSelect;

    /**
     * 申请单位id
     */
    @ApiModelProperty("申请单位id")
    private String orgId;

    /**
     * 存单号
     */
    @ApiModelProperty("存单号")
    private String depositNo;

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
     * 是否抵扣授信:1是 2否
     */
    @ApiModelProperty("是否抵扣授信:1是 2否")
    private BigDecimal isDeductionCredit;

    /**
     * 保证金存入单据编号
     */
    @ApiModelProperty("保证金存入单据编号")
    private String receiptNo;

    /**
     * 调整前后标识 1、调整前  2、调整后
     */
    @ApiModelProperty("调整前后标识 1、调整前  2、调整后")
    private BigDecimal beforeorafter;

    /**
     * 存款品种id
     */
    @ApiModelProperty("存款品种id")
    private String depositProductId;

    /**
     * 存款品种编号
     */
    @ApiModelProperty("存款品种编号")
    private String depositProductCode;

    /**
     * 存款品种名称
     */
    @ApiModelProperty("存款品种名称")
    private String depositProductName;

    /**
     * 解付方式(1解付、2抵扣、3没收、4不处理)
     */
    @ApiModelProperty("解付方式(1解付、2抵扣、3没收、4不处理)")
    private BigDecimal solutionPayMethod;

    /**
     * 解付金额 (和保证金金额保持一致)
     */
    @ApiModelProperty("解付金额 (和保证金金额保持一致)")
    private BigDecimal solutionPayAmt;

    /**
     * 解付日期
     */
    @ApiModelProperty("解付日期")
    private String solutionPayDate;

    /**
     * 保证金ID，解付记录关联保证金记录的ID
     */
    @ApiModelProperty("保证金ID，解付记录关联保证金记录的ID")
    private String depositId;

    /**
     * 核算单位ID
     */
    @ApiModelProperty("核算单位ID")
    private String calOrgId;

    /**
     * 核算单位code
     */
    @ApiModelProperty("核算单位code")
    private String calOrgCode;

    /**
     * 核算单位name
     */
    @ApiModelProperty("核算单位name")
    private String calOrgName;

    /**
     * 保证金单据业务编号
     */
    @Column(value = "depositRegisterBusinessNo")
    @ApiModelProperty("保证金单据业务编号")
    private String depositRegisterBusinessNo;

    /**
     * 剩余可解付金额字段,存在信用证关联的数据中
     */
    @ApiModelProperty("剩余可解付金额字段,存在信用证关联的数据中")
    private BigDecimal surplusSolutionPayamt;

    /**
     * 选择的保证金剩余可用额度
     */
    @Column(value = "availableOccupiedAmount")
    @ApiModelProperty("选择的保证金剩余可用额度")
    private BigDecimal availableOccupiedAmount;

}
