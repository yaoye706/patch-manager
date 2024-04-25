package com.gykj.patch.manager.core.domain.vo.logm;

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
 * 留置物信息 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("留置物信息")
@Table(value = "T_LOGM_BD_RETENTION")
public class TLogmBdRetentionVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 表ID唯一主键
     */
    @Id
    @ApiModelProperty("表ID唯一主键")
    private String id;

    /**
     * 所属单位ID
     */
    @ApiModelProperty("所属单位ID")
    private String belongOrgId;

    /**
     * 所属单位CODE
     */
    @ApiModelProperty("所属单位CODE")
    private String belongOrgCode;

    /**
     * 所属单位名称
     */
    @ApiModelProperty("所属单位名称")
    private String belongOrgName;

    /**
     * 留置物类型编码
     */
    @ApiModelProperty("留置物类型编码")
    private String retentionTypeCode;

    /**
     * 留置物类型名称
     */
    @ApiModelProperty("留置物类型名称")
    private String retentionTypeName;

    /**
     * 留置物名称
     */
    @ApiModelProperty("留置物名称")
    private String retentionName;

    /**
     * 留置物名称编码
     */
    @ApiModelProperty("留置物名称编码")
    private String retentionCode;

    /**
     * 留置物描述
     */
    @ApiModelProperty("留置物描述")
    private String retentionRemark;

    /**
     * 担保合同ID
     */
    @ApiModelProperty("担保合同ID")
    private String contractId;

    /**
     * 1新增2选择
     */
    @ApiModelProperty("1新增2选择")
    private BigDecimal addOrSelect;

    /**
     * 数据类型1.申请，2.登记，3变更，4生效保函
     */
    @ApiModelProperty("数据类型1.申请，2.登记，3变更，4生效保函")
    private String dataType;

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
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private String createTime;

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
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private String updateTime;

    /**
     * 乐观锁
     */
    @ApiModelProperty("乐观锁")
    private BigDecimal dataVersion;

    /**
     * 记录状态 0无效；1有效
     */
    @ApiModelProperty("记录状态 0无效；1有效")
    private BigDecimal dataStatus;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

}
