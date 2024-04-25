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
 * 参数设置 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("参数设置")
@Table(value = "t_lofc_paramter_setting")
public class TLofcParamterSettingVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @ApiModelProperty("主键")
    private String id;

    /**
     * 参数编号
     */
    @ApiModelProperty("参数编号")
    private String paramKey;

    /**
     * 参数名称
     */
    @ApiModelProperty("参数名称")
    private String paramName;

    /**
     * 后台初始
     */
    @ApiModelProperty("后台初始")
    private BigDecimal paramOrder;

    /**
     * 描述信息
     */
    @ApiModelProperty("描述信息")
    private String paramDesc;

    /**
     * 参数值
     */
    @ApiModelProperty("参数值")
    private String paramValue;

    /**
     * 1.选择型，2.输入型，3其他
     */
    @ApiModelProperty("1.选择型，2.输入型，3其他")
    private BigDecimal paramType;

    /**
     * 当“参数类型”为“选择型”时，本字段保存下拉框中的JSON字符串，比如：{"1":"开启","2":"关闭"}
     */
    @ApiModelProperty("当“参数类型”为“选择型”时，本字段保存下拉框中的JSON字符串，比如1开启2关闭")
    private String paramRange;

    /**
     * 1.展示可修改2.展示不可改3.不展示
     */
    @ApiModelProperty("1.展示可修改2.展示不可改3.不展示")
    private BigDecimal paramSettingFlag;

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
