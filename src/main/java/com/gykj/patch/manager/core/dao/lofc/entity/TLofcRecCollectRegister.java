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
 * 收款登记表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("收款登记表")
@Table(value = "T_LOFC_REC_COLLECT_REGISTER")
public class TLofcRecCollectRegister implements Serializable {

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
     * 交单登记id
     */
    @ApiModelProperty("交单登记id")
    private String deliveryId;

    /**
     * 收款日期
     */
    @ApiModelProperty("收款日期")
    private String collectDate;

    /**
     * 收款金额
     */
    @ApiModelProperty("收款金额")
    private BigDecimal collectAmount;

    /**
     * 收款币种
     */
    @ApiModelProperty("收款币种")
    private String currencyType;

    /**
     * 收款币种名称
     */
    @ApiModelProperty("收款币种名称")
    private String currencyName;

    /**
     * 收款账户id
     */
    @ApiModelProperty("收款账户id")
    private String collectAccountId;

    /**
     * 收款账户
     */
    @ApiModelProperty("收款账户")
    private String collectAccountNo;

    /**
     * 收款账户name
     */
    @ApiModelProperty("收款账户name")
    private String collectAccountName;

    /**
     * 收款方账户开户行
     */
    @ApiModelProperty("收款方账户开户行")
    private String collectBankName;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * businessNo 单据编号
     */
    @ApiModelProperty("businessNo 单据编号")
    private String businessNo;

    /**
     * 汇率
     */
    @ApiModelProperty("汇率")
    private BigDecimal collectRate;

    /**
     * 折算开证币种金额
     */
    @ApiModelProperty("折算开证币种金额")
    private BigDecimal convertedAmount;

    /**
     * 流程贯穿号
     */
    @ApiModelProperty("流程贯穿号")
    private String globalBusinessNo;

    /**
     * 应付管理关联业务单号
     */
    @Column(value = "outBusinessNo")
    @ApiModelProperty("应付管理关联业务单号")
    private String outBusinessNo;

}
