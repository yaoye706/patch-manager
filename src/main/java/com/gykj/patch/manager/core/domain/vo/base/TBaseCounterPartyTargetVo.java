package com.gykj.patch.manager.core.domain.vo.base;

import com.mybatisflex.annotation.Table;
import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 客商特殊信息指标 实体类。
 *
 * @author yaoye
 * @since 2024-04-16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "t_base_counter_party_target")
public class TBaseCounterPartyTargetVo implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * ID
     */
    @CsvBindByName(column = "id")
    private String id;

    /**
     * 单据编号
     */
    @CsvBindByName(column = "business_no")
    private String businessNo;

    /**
     * 字段名称
     */
    @CsvBindByName(column = "indicator_name")
    private String indicatorName;

    /**
     * 指标值
     */
    @CsvBindByName(column = "target_value")
    private String targetValue;

    /**
     * 取值方式
     */
    @CsvBindByName(column = "data_source")
    private BigDecimal dataSource;

    /**
     * 字典编号
     */
    @CsvBindByName(column = "dictionary_value")
    private String dictionaryValue;

    /**
     * 客商表id
     */
    @CsvBindByName(column = "counter_party_id")
    private String counterPartyId;

    /**
     * 创建时间
     */
    @CsvBindByName(column = "create_time")
    private String createTime;

    /**
     * 创建人编码
     */
    @CsvBindByName(column = "create_by_code")
    private String createByCode;

    /**
     * 创建人名称
     */
    @CsvBindByName(column = "create_by_name")
    private String createByName;

    /**
     * 修改时间
     */
    @CsvBindByName(column = "update_time")
    private String updateTime;

    /**
     * 修改人编码
     */
    @CsvBindByName(column = "update_by_code")
    private String updateByCode;

    /**
     * 修改人名称
     */
    @CsvBindByName(column = "update_by_name")
    private String updateByName;

    /**
     * 乐观锁
     */
    @CsvBindByName(column = "data_version")
    private BigDecimal dataVersion;

    /**
     * 记录状态 1:有效 0:无效
     */
    @CsvBindByName(column = "data_status")
    private BigDecimal dataStatus;

    /**
     * 租户id
     */
    @CsvBindByName(column = "tenant_id")
    private String tenantId;


    /**
     * UPDATE ADD DELETE
     */
    @CsvBindByName(column = "type_status")
    private String typeStatus;
}
