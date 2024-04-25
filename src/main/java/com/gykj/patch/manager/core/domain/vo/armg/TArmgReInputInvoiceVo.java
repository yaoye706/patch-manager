package com.gykj.patch.manager.core.domain.vo.armg;

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
 * 应收单发票 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("应收单发票")
@Table(value = "T_ARMG_RE_INPUT_INVOICE")
public class TArmgReInputInvoiceVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @Id
    @ApiModelProperty("id")
    private String id;

    /**
     * 应收单ID-索引
     */
    @ApiModelProperty("应收单ID-索引")
    private String receivableId;

    /**
     * 发票类型:1增值税专用发票、2增值税普通发票
     */
    @ApiModelProperty("发票类型:1增值税专用发票、2增值税普通发票")
    private BigDecimal invoiceType;

    /**
     * 发票代码
     */
    @ApiModelProperty("发票代码")
    private String invoiceCode;

    /**
     * 发票号码
     */
    @ApiModelProperty("发票号码")
    private String invoiceNo;

    /**
     * 开票日期
     */
    @ApiModelProperty("开票日期")
    private String billingTime;

    /**
     * 含税金额
     */
    @ApiModelProperty("含税金额")
    private BigDecimal amount;

    /**
     * 税率(%)
     */
    @ApiModelProperty("税率(%)")
    private BigDecimal taxRate;

    /**
     * 税额
     */
    @ApiModelProperty("税额")
    private BigDecimal taxAmount;

    /**
     * 不含税金额
     */
    @ApiModelProperty("不含税金额")
    private BigDecimal notAmount;

    /**
     * 记录状态:0无效1有效
     */
    @ApiModelProperty("记录状态:0无效1有效")
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
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private String updateTime;

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
     * 乐观锁
     */
    @ApiModelProperty("乐观锁")
    private BigDecimal dataVersion;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    private String typeStatus;

}
