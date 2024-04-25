package com.gykj.patch.manager.core.domain.vo.logm;

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
 * 资金调拨信息表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("资金调拨信息表")
@Table(value = "T_LOGM_FUND_ALLOCATION")
public class TLogmFundAllocationVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @Id
    @ApiModelProperty("id")
    private String id;

    /**
     * 关联单据ID
     */
    @ApiModelProperty("关联单据ID")
    private String contractId;

    /**
     * 单据类型;1开函2收函
     */
    @ApiModelProperty("单据类型;1开函2收函")
    private BigDecimal letterType;

    /**
     * 期望调拨日期
     */
    @ApiModelProperty("期望调拨日期")
    private String expectTime;

    /**
     * 调拨金融
     */
    @ApiModelProperty("调拨金融")
    private BigDecimal amount;

    /**
     * 调拨币种编码
     */
    @ApiModelProperty("调拨币种编码")
    private String currencyType;

    /**
     * 支付方式编码
     */
    @ApiModelProperty("支付方式编码")
    private String payMethod;

    /**
     * 业务类型编码
     */
    @ApiModelProperty("业务类型编码")
    private String businessType;

    /**
     * 是否占预算;0-不占 1-占用 默认0
     */
    @ApiModelProperty("是否占预算;0-不占 1-占用 默认0")
    private BigDecimal budget;

    /**
     * 资金预算项
     */
    @ApiModelProperty("资金预算项")
    private String fundBudgetItem;

    /**
     * 付款方账户
     */
    @ApiModelProperty("付款方账户")
    private String payerAccount;

    /**
     * 付款方账户名称
     */
    @ApiModelProperty("付款方账户名称")
    private String payerAccountName;

    /**
     * 付款方账户开户行
     */
    @ApiModelProperty("付款方账户开户行")
    private String payerAccountBank;

    /**
     * 收款方账户
     */
    @ApiModelProperty("收款方账户")
    private String payeeAccount;

    /**
     * 收款方账户名称
     */
    @ApiModelProperty("收款方账户名称")
    private String payeeAccountName;

    /**
     * 收款方账户名称开户行
     */
    @ApiModelProperty("收款方账户名称开户行")
    private String payeeAccountBank;

    /**
     * 摘要
     */
    @ApiModelProperty("摘要")
    private String summary;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String description;

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
    private BigDecimal dataVersion;

    /**
     * 数据状态;0无效；1有效
     */
    @ApiModelProperty("数据状态;0无效；1有效")
    private BigDecimal dataStatus;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    @ApiModelProperty("")
    private String currencyName;

    @ApiModelProperty("")
    private String payeeAccountBankName;

    @ApiModelProperty("")
    private String payeeCurrencyType;

    @ApiModelProperty("")
    private String payeeCurrencyName;

    @ApiModelProperty("")
    private String payerAccountBankName;

    @ApiModelProperty("")
    private String payerCurrencyType;

    @ApiModelProperty("")
    private String payerCurrencyName;

    /**
     * 付款账户id
     */
    @ApiModelProperty("付款账户id")
    private String payerAccountId;

    /**
     * 收款账户id
     */
    @ApiModelProperty("收款账户id")
    private String payeeAccountId;

    /**
     * 业务类型名称
     */
    @ApiModelProperty("业务类型名称")
    private String businessTypeName;

    /**
     * 业务类型ID
     */
    @ApiModelProperty("业务类型ID")
    private String businessTypeId;

}
