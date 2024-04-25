package com.gykj.patch.manager.core.dao.base.entity;

import com.mybatisflex.annotation.Table;
import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 客商信息表 实体类。
 *
 * @author yaoye
 * @since 2024-04-15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "T_BASE_COUNTER_PARTY")
public class TBaseCounterParty implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @CsvBindByName(column = "id")
    private String id;

    /**
     * 客商编码
     */
    @CsvBindByName(column = "contacts_org_code")
    private String contactsOrgCode;

    /**
     * 客商性质 1企业 2个人
     */
    @CsvBindByName(column = "contacts_org_property")
    private BigDecimal contactsOrgProperty;

    /**
     * 客商类型 1供应商 2客户
     */
    @CsvBindByName(column = "contacts_org_type")
    private BigDecimal contactsOrgType;

    /**
     * 内部单位 1是  2否
     */
    @CsvBindByName(column = "internal_org")
    private BigDecimal internalOrg;

    /**
     * 客商名称
     */
    @CsvBindByName(column = "contacts_org_name")
    private String contactsOrgName;

    /**
     * 内部客商单位主键id
     */
    @CsvBindByName(column = "internal_org_id")
    private String internalOrgId;

    /**
     * 是否全集团公用
     */
    @CsvBindByName(column = "group_public")
    private BigDecimal groupPublic;

    /**
     * 客户等级
     */
    @CsvBindByName(column = "customer_Level")
    private BigDecimal customerLevel;

    /**
     * 创建人编码
     */
    @CsvBindByName(column = "create_By_code")
    private String createByCode;

    /**
     * 创建人名称
     */
    @CsvBindByName(column = "create_by_name")
    private String createByName;

    /**
     * 创建时间
     */
    @CsvBindByName(column = "create_time")
    private String createTime;

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
     * 修改时间
     */
    @CsvBindByName(column = "update_time")
    private String updateTime;

    /**
     * 乐观锁
     */
    @CsvBindByName(column = "data_version")
    private BigDecimal dataVersion;

    /**
     * 记录状态 0无效；1有效
     */
    @CsvBindByName(column = "data_status")
    private BigDecimal dataStatus;

    /**
     * 使用单位id
     */
    @CsvBindByName(column = "use_org_id")
    private String useOrgId;

    /**
     * 使用单位名称
     */
    @CsvBindByName(column = "use_org_name")
    private String useOrgName;

    /**
     * 备注
     */
    @CsvBindByName(column = "remark")
    private String remark;

    /**
     * 租户id
     */
    @CsvBindByName(column = "tenant_id")
    private String tenantId;

    /**
     * 客商标志号(组织机构代码或身份证号)
     */
    @CsvBindByName(column = "counter_party_signno")
    private String counterPartySignno;

    /**
     * 黑白名单标志，1：白名单 2：黑名单 3:灰名单 
     */
    @CsvBindByName(column = "black_White")
    private BigDecimal blackWhite;

    /**
     * 境内外 1.境内；2境外
     */
    @CsvBindByName(column = "in_Out_land")
    private BigDecimal inOutLand;

    /**
     * 常驻国家
     */
    @CsvBindByName(column = "counterparty_country")
    private String counterpartyCountry;

    /**
     * 客商地址
     */
    @CsvBindByName(column = "counterparty_address")
    private String counterpartyAddress;

}
