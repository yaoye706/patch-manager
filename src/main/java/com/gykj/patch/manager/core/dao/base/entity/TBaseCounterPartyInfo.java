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
 * 客商特殊信息详情 实体类。
 *
 * @author yaoye
 * @since 2024-04-16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "t_base_counter_party_info")
public class TBaseCounterPartyInfo implements Serializable {

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
     * 描述
     */
    private String remark;

    /**
     * 取值方式
     */
    private BigDecimal dataSource;

    /**
     * 记录时间
     */
    private String callTime;

    /**
     * 指标表id
     */
    private String targetId;

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
