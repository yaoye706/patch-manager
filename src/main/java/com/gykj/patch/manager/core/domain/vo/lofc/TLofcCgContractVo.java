package com.gykj.patch.manager.core.domain.vo.lofc;

import com.mybatisflex.annotation.Table;
import com.opencsv.bean.CsvBindByName;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 信用证开证授信合同  实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("信用证开证授信合同 ")
@Table(value = "T_LOFC_CG_CONTRACT")
public class TLofcCgContractVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id 表ID唯一主键
     */
    @CsvBindByName(column = "id")
    private String id;

    /**
     * dataStatus 记录状态 0无效；1有效
     */
    @CsvBindByName(column = "data_status")
    private BigDecimal dataStatus;

    /**
     * createTime 创建时间
     */
    @CsvBindByName(column = "create_time")
    private String createTime;

    /**
     * createByCode 创建人编码
     */
    @CsvBindByName(column = "create_by_code")
    private String createByCode;

    /**
     * createByName 创建人名称
     */
    @CsvBindByName(column = "create_by_name")
    private String createByName;

    /**
     * updateByCode 修改人编码
     */
    @CsvBindByName(column = "update_by_code")
    private String updateByCode;

    /**
     * updateByName 修改人名称
     */
    @CsvBindByName(column = "update_by_name")
    private String updateByName;

    /**
     * updateTime 修改时间
     */
    @CsvBindByName(column = "update_time")
    private String updateTime;

    /**
     * dataVersion 乐观锁
     */
    @CsvBindByName(column = "data_version")
    private BigDecimal dataVersion;

    /**
     * cgContractCode 授信合同号
     */
    @CsvBindByName(column = "cg_contract_code")
    private String contractNo;

    /**
     * officeName授信银行
     */
    @CsvBindByName(column = "office_name")
    private String officeName;

    /**
     * creditName 授信品种
     */
    @CsvBindByName(column = "credit_name")
    private String credtiName;

    /**
     * credtiId授信品种id
     */
    @CsvBindByName(column = "credit_id")
    private String creditId;

    /**
     * currencyId 币种
     */
    @CsvBindByName(column = "currency_id")
    private String currencyId;

    /**
     * occupyAmount 占用金额
     */
    @CsvBindByName(column = "occupy_amount")
    private BigDecimal occupyAmount;

    /**
     * availableBalance 授信余额
     */
    @CsvBindByName(column = "available_balance")
    private BigDecimal availableBalance;

    /**
     * exchangeRate 汇率
     */
    @CsvBindByName(column = "exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * amount 占用金额折算
     */
    @CsvBindByName(column = "amount")
    private BigDecimal amount;

    /**
     * associatedID 关联单据ID
     */
    @CsvBindByName(column = "associated_id")
    private String associatedId;

    /**
     * associatedType 关联单据类型:1开证申请,2开证登记,3开证修改,4信用证
     */
    @CsvBindByName(column = "associated_type")
    private BigDecimal associatedType;

    /**
     * 授信开始日期
     */
    @CsvBindByName(column = "start_date")
    private String startDate;

    /**
     * 授信结束日期
     */
    @CsvBindByName(column = "end_date")
    private String endDate;

    /**
     * 租户id
     */
    @CsvBindByName(column = "tenant_id")
    private String tenantId;

    /**
     * 调整前后标识 1、调整前  2、调整后
     */
    @CsvBindByName(column = "before_or_after")
    private BigDecimal beforeOrAfter;



}
