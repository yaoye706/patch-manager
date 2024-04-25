package com.gykj.patch.manager.core.domain.vo.base;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Table;
import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 客商账户信息表 实体类。
 *
 * @author yaoye
 * @since 2024-04-15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TBaseCounterPartyAcctVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @CsvBindByName(column = "id")
    private String id;

    /**
     * 币种
     */
    @CsvBindByName(column = "currency_code")
    private String currencyCode;

    /**
     * 省
     */
    @CsvBindByName(column = "cprovince_code")
    private String provinceCode;

    /**
     * 市
     */
    @CsvBindByName(column = "city_code")
    private String cityCode;

    /**
     * 联行号
     */
    @CsvBindByName(column = "cnaps_code")
    private String cnapsCode;

    /**
     * BIC码
     */
    @CsvBindByName(column = "bic_code")
    private String bicCode;

    /**
     * 国家编码
     */
    @CsvBindByName(column = "country_code")
    private String countryCode;

    /**
     * 国家
     */
    @CsvBindByName(column = "bank_country")
    private String bankCountry;

    /**
     * 地区编码
     */
    @CsvBindByName(column = "area_code")
    private String areaCode;

    /**
     * 地区
     */
    @CsvBindByName(column = "area")
    private String bankArea;

    /**
     * 国外详细地址
     */
    @CsvBindByName(column = "enLocation_detail")
    private String enLocationDetail;

    /**
     * 客商id
     */
    @CsvBindByName(column = "contacts_org_id")
    private String contactsOrgId;

    /**
     * 序号
     */
    @CsvBindByName(column = "serial_number")
    private String serialNumber;

    /**
     * 银行账号
     */
    @CsvBindByName(column = "bank_account")
    private String bankAccount;

    /**
     * 账号名称
     */
    @CsvBindByName(column = "account_title")
    private String accountTitle;

    /**
     * 所属银行id
     */
    @CsvBindByName(column = "belongs_bank_id")
    private String belongsBankId;

    /**
     * 开户行名称
     */
    @CsvBindByName(column = "bank_name")
    private String bankName;

    /**
     * 开户行id
     */
    @CsvBindByName(column = "bank_id")
    private String bankId;

    /**
     * 开户行（省）
     */
    @CsvBindByName(column = "bank_province")
    private String bankProvince;

    /**
     * 开户行（市）
     */
    @CsvBindByName(column = "bank_city")
    private String bankCity;

    /**
     * 国外银行地址1
     */
    @Column(value = "en_location_1")
    @CsvBindByName(column = "en_location_1")
    private String enLocation1;

    /**
     * 国外银行地址2
     */
    @Column(value = "en_location_2")
    @CsvBindByName(column = "en_location_2")
    private String enLocation2;

    /**
     * 国外银行地址3
     */
    @Column(value = "en_location_3")
    @CsvBindByName(column = "en_location_3")
    private String enLocation3;

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
