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
 * 费用支付登记信息表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("费用支付登记信息表")
@Table(value = "t_logm_fee_register")
public class TLogmFeeRegisterVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @ApiModelProperty("主键")
    private String id;

    /**
     * 流水号
     */
    @ApiModelProperty("流水号")
    private String serialNo;

    /**
     * 贯穿整个业务流程编号，多个流程合成一笔记录多个流程编号，并以","分开
     */
    @ApiModelProperty("贯穿整个业务流程编号，多个流程合成一笔记录多个流程编号，并以分开")
    private String processNo;

    /**
     * 系统生成
     */
    @ApiModelProperty("系统生成")
    private String logmCode;

    /**
     * 付款日期
     */
    @ApiModelProperty("付款日期")
    private String businessDate;

    /**
     * 保函单id
     */
    @ApiModelProperty("保函单id")
    private String contractId;

    /**
     * 付款账号
     */
    @ApiModelProperty("付款账号")
    private String payAccountNo;

    /**
     * 付款账号名称
     */
    @ApiModelProperty("付款账号名称")
    private String payAccountName;

    /**
     * 付款账号id
     */
    @ApiModelProperty("付款账号id")
    private String payAccountId;

    /**
     * 关联流水号idid
     */
    @ApiModelProperty("关联流水号idid")
    private String transId;

    /**
     * 关联流水号idno
     */
    @ApiModelProperty("关联流水号idno")
    private String transNo;

    /**
     * 费用金额
     */
    @ApiModelProperty("费用金额")
    private BigDecimal amount;

    /**
     * 用途
     */
    @ApiModelProperty("用途")
    private String memo;

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
     * 已保存、审批中、审批拒绝、审批通过
     */
    @ApiModelProperty("已保存、审批中、审批拒绝、审批通过")
    private Integer flowsStatus;

    /**
     * 0无效；1有效
     */
    @ApiModelProperty("0无效；1有效")
    private Integer dataStatus;

    /**
     * 1待发送 2处理中 3处理成功4校验失败
     */
    @ApiModelProperty("1待发送 2处理中 3处理成功4校验失败")
    private Integer interfaceProcessStatus;

    /**
     * 审批流返回码
     */
    @ApiModelProperty("审批流返回码")
    private String backCode;

    /**
     * 审批流返回信息
     */
    @ApiModelProperty("审批流返回信息")
    private String backMsg;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

}
