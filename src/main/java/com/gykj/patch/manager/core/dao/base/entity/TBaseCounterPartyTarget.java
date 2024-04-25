package com.gykj.patch.manager.core.dao.base.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.Table;
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
public class TBaseCounterPartyTarget implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @Id
    private String id;

    /**
     * 单据编号
     */
    private String businessNo;

    /**
     * 字段名称
     */
    private String indicatorName;

    /**
     * 指标值
     */
    private String targetValue;

    /**
     * 取值方式
     */
    private BigDecimal dataSource;

    /**
     * 字典编号
     */
    private String dictionaryValue;

    /**
     * 客商表id
     */
    private String counterPartyId;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建人编码
     */
    private String createByCode;

    /**
     * 创建人名称
     */
    private String createByName;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 修改人编码
     */
    private String updateByCode;

    /**
     * 修改人名称
     */
    private String updateByName;

    /**
     * 乐观锁
     */
    private BigDecimal dataVersion;

    /**
     * 记录状态 1:有效 0:无效
     */
    private BigDecimal dataStatus;

    /**
     * 租户id
     */
    private String tenantId;

}
