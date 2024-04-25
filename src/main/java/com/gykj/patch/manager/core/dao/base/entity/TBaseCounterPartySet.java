package com.gykj.patch.manager.core.dao.base.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Clob;

/**
 * 客商指标设置 实体类。
 *
 * @author yaoye
 * @since 2024-04-16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "t_base_counter_party_set")
public class TBaseCounterPartySet implements Serializable {

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
     * 指标名称
     */
    private String indicatorName;

    /**
     * 指标类型
     */
    private BigDecimal indicatorType;

    /**
     * 是否外部获取1是2否
     */
    private BigDecimal dataSource;

    /**
     * 值是否能修改
     */
    private String whetherUpdate;

    /**
     * 获取频率(天)
     */
    private BigDecimal term;

    /**
     * 模板编号
     */
    private String templateCode;

    /**
     * 模板内容
     */
    private Clob templateContent;

    /**
     * 字典编号
     */
    private String dictionaryValue;

    /**
     * 顺序
     */
    private BigDecimal elementOrder;

    /**
     * 扩展字段对应值
     */
    private String expandElementName;

    /**
     * 扩展字段对应id
     */
    private String expandElementId;

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
