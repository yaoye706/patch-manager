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
 * 费用信息表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("费用信息表")
@Table(value = "t_logm_fee")
public class TLogmFeeVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @ApiModelProperty("主键")
    private String id;

    /**
     * 下拉选择费用种类设置中的信息
     */
    @ApiModelProperty("下拉选择费用种类设置中的信息")
    private String feeTypeId;

    /**
     * 费用收取方式:固定金额/按费用比率
     */
    @ApiModelProperty("费用收取方式:固定金额/按费用比率")
    private Integer feeCollectType;

    /**
     * 费用收取周期：一次性收取、每年、每半年、每半年、每季度、每月、每日
     */
    @ApiModelProperty("费用收取周期：一次性收取、每年、每半年、每半年、每季度、每月、每日")
    private Integer feeCollectPeriod;

    /**
     * 费用比率当‘费用收取方式’选择按费用比率时，该字段必填录入数字格式，保留两位小数，当‘费用收取方式’选择固定金额时，该字段置灰
     */
    @ApiModelProperty("费用比率当‘费用收取方式’选择按费用比率时，该字段必填录入数字格式，保留两位小数，当‘费用收取方式’选择固定金额时，该字段置灰")
    private BigDecimal feeRate;

    /**
     * 汇率
     */
    @ApiModelProperty("汇率")
    private BigDecimal exchangeRate;

    /**
     * 币种编号
     */
    @ApiModelProperty("币种编号")
    private String currencyType;

    /**
     * 币种名称
     */
    @ApiModelProperty("币种名称")
    private String currencyName;

    /**
     * 费用金额：保函金额*汇率*手续费率
     */
    @ApiModelProperty("费用金额：保函金额*汇率*手续费率")
    private BigDecimal amount;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String description;

    /**
     * 关联单据ID
     */
    @ApiModelProperty("关联单据ID")
    private String contractId;

    /**
     * 数据类型 1申请，2登记，3变更，4废弃，5结束，6生效
     */
    @ApiModelProperty("数据类型 1申请，2登记，3变更，4废弃，5结束，6生效")
    private Integer dataType;

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
    private Integer dataVersion;

    /**
     * 审批状态 已保存、审批中、审批拒绝、审批通过
     */
    @ApiModelProperty("审批状态 已保存、审批中、审批拒绝、审批通过")
    private Integer flowsStatus;

    /**
     * 数据状态 0无效；1有效
     */
    @ApiModelProperty("数据状态 0无效；1有效")
    private Integer dataStatus;

    /**
     * 费用种类名称
     */
    @ApiModelProperty("费用种类名称")
    private String feeTypeName;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

}
