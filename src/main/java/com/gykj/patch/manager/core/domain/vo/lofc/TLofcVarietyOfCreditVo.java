package com.gykj.patch.manager.core.domain.vo.lofc;

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
 * 信用证授信品种表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("信用证授信品种表")
@Table(value = "T_LOFC_VARIETY_OF_CREDIT")
public class TLofcVarietyOfCreditVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @Id
    @ApiModelProperty("id")
    private String id;

    /**
     * 记录状态0无效1有效
     */
    @ApiModelProperty("记录状态0无效1有效")
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
     * 信用证id
     */
    @ApiModelProperty("信用证id")
    private String creditId;

    /**
     * 授信品种id
     */
    @ApiModelProperty("授信品种id")
    private String varietyId;

    /**
     * 授信品种名称
     */
    @ApiModelProperty("授信品种名称")
    private String varietyName;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

}
