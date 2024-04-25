package com.gykj.patch.manager.core.domain.vo.base;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 客商特殊信息详情 实体类。
 *
 * @author yaoye
 * @since 2024-04-16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TBaseCounterPartyInfoVo implements Serializable {

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
     * 描述
     */
    @CsvBindByName(column = "remark")
    private String remark;

    /**
     * 取值方式
     */
    @CsvBindByName(column = "data_source")
    private BigDecimal dataSource;

    /**
     * 记录时间
     */
    @CsvBindByName(column = "call_time")
    private String callTime;

    /**
     * 指标表id
     */
    @CsvBindByName(column = "target_id")
    private String targetId;

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
