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
 * 保函信息表 实体类。
 *
 * @author yaoye
 * @since 2024-04-19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("保函信息表")
@Table(value = "t_logm_open")
public class TLogmOpenVo implements Serializable {

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
     * 保函编号
     */
    @ApiModelProperty("保函编号")
    private String letterCode;

    /**
     * 合同编号
     */
    @ApiModelProperty("合同编号")
    private String contractCode;

    /**
     * 开立保函日期
     */
    @ApiModelProperty("开立保函日期")
    private String openLogmDate;

    /**
     * 申请登记变更结束日期：默认当前日期
     */
    @ApiModelProperty("申请登记变更结束日期：默认当前日期")
    private String businessDate;

    /**
     * 开立方式：直开、转开、转递
     */
    @ApiModelProperty("开立方式：直开、转开、转递")
    private Integer openWay;

    /**
     * 保函种类维护列表内容
     */
    @ApiModelProperty("保函种类维护列表内容")
    private String kindId;

    /**
     * 保函种类编号
     */
    @ApiModelProperty("保函种类编号")
    private String kindCode;

    /**
     * 保函种类名称
     */
    @ApiModelProperty("保函种类名称")
    private String kindName;

    /**
     * 根据保函种类，显示保函类型
     */
    @ApiModelProperty("根据保函种类，显示保函类型")
    private Integer styleCode;

    /**
     * 保函形式。电子、纸质
     */
    @ApiModelProperty("保函形式。电子、纸质")
    private Integer letterShape;

    /**
     * 是否见索即付.1是2否
     */
    @ApiModelProperty("是否见索即付.1是2否")
    private Integer letterIsPay;

    /**
     * 开函银行id（往来机构）
     */
    @ApiModelProperty("开函银行id（往来机构）")
    private String officeId;

    /**
     * 开函银行code（往来机构）
     */
    @ApiModelProperty("开函银行code（往来机构）")
    private String officeCode;

    /**
     * 开函银行name（往来机构）
     */
    @ApiModelProperty("开函银行name（往来机构）")
    private String officeName;

    /**
     * 国家：基础数据--国家列表选项
     */
    @ApiModelProperty("国家：基础数据--国家列表选项")
    private String countryCode;

    /**
     * 国家名称
     */
    @ApiModelProperty("国家名称")
    private String countryName;

    /**
     * 保函金额
     */
    @ApiModelProperty("保函金额")
    private BigDecimal amount;

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
     * 是否有固定结束日期:1是2否
     */
    @ApiModelProperty("是否有固定结束日期:1是2否")
    private Integer endDateFix;

    /**
     * 开始日期
     */
    @ApiModelProperty("开始日期")
    private String startDate;

    /**
     * 结束日期
     */
    @ApiModelProperty("结束日期")
    private String endDate;

    /**
     * 开函：核算单位id，收函：登记单位
     */
    @ApiModelProperty("开函：核算单位id，收函：登记单位")
    private String orgId;

    /**
     * 开函：核算单位code，收函：登记单位
     */
    @ApiModelProperty("开函：核算单位code，收函：登记单位")
    private String orgCode;

    /**
     * 开函：核算单位name，收函：登记单位
     */
    @ApiModelProperty("开函：核算单位name，收函：登记单位")
    private String orgName;

    /**
     * 开函：申请单位id，收函：受益人单位
     */
    @ApiModelProperty("开函：申请单位id，收函：受益人单位")
    private String applyOrgId;

    /**
     * 开函：申请单位code，收函：受益人单位
     */
    @ApiModelProperty("开函：申请单位code，收函：受益人单位")
    private String applyOrgCode;

    /**
     * 开函：申请单位name，收函：受益人单位
     */
    @ApiModelProperty("开函：申请单位name，收函：受益人单位")
    private String applyOrgName;

    /**
     * 开函：申请人地址，，收函：受益人地址
     */
    @ApiModelProperty("开函：申请人地址，，收函：受益人地址")
    private String applyAddress;

    /**
     * 开函:受益人名称,收函：申请人名称
     */
    @ApiModelProperty("开函:受益人名称,收函：申请人名称")
    private String beneficiaryName;

    /**
     * 开函:受益人地址，收函：申请人地址
     */
    @ApiModelProperty("开函:受益人地址，收函：申请人地址")
    private String beneficiaryAddress;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
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
     * 业务状态 合同状态1生效2结束
     */
    @ApiModelProperty("业务状态 合同状态1生效2结束")
    private Integer businessStatus;

    /**
     * 业务数据类型1开函2收函
     */
    @ApiModelProperty("业务数据类型1开函2收函")
    private Integer businessDataType;

    /**
     * 锁定状态 1是2否（在途单据是1否则2）
     */
    @ApiModelProperty("锁定状态 1是2否（在途单据是1否则2）")
    private Integer lockStatus;

    /**
     * 操作状态：1正常，2变更中，3结束中，4废弃中
     */
    @ApiModelProperty("操作状态：1正常，2变更中，3结束中，4废弃中")
    private Integer operationStatus;

    /**
     * 数据状态 0无效；1有效
     */
    @ApiModelProperty("数据状态 0无效；1有效")
    private Integer dataStatus;

    /**
     * 担保方式
     */
    @ApiModelProperty("担保方式")
    private String guaranteeMethod;

    /**
     * 上级机构编号
     */
    @ApiModelProperty("上级机构编号")
    private String superiorCode;

    /**
     * 上级机构名称
     */
    @ApiModelProperty("上级机构名称")
    private String superiorName;

    /**
     * 网点机构id
     */
    @ApiModelProperty("网点机构id")
    private String siteOfficeId;

    /**
     * 网点机构code
     */
    @ApiModelProperty("网点机构code")
    private String siteOfficeCode;

    /**
     * 网点机构名称
     */
    @ApiModelProperty("网点机构名称")
    private String financialNetwork;

    /**
     * 上级网点机构编号
     */
    @ApiModelProperty("上级网点机构编号")
    private String siteSuperiorCode;

    /**
     * 是否占用授信
     */
    @ApiModelProperty("是否占用授信")
    private Integer whetherOccupy;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * 是否结构化产品;0否；1是  默认0
     */
    @ApiModelProperty("是否结构化产品;0否；1是  默认0")
    private BigDecimal structureProduct;

    /**
     * 是否资金调拨;0否；1是  默认0
     */
    @ApiModelProperty("是否资金调拨;0否；1是  默认0")
    private BigDecimal fundAllocation;

    /**
     * 银行状态;1-黑名单； 2-白名单
     */
    @ApiModelProperty("银行状态;1-黑名单； 2-白名单")
    private BigDecimal bankStatus;

    /**
     * 集团内;1-集团内
     */
    @ApiModelProperty("集团内;1-集团内")
    private BigDecimal groupWithin;

    /**
     * 付款账户币种名称
     */
    @ApiModelProperty("付款账户币种名称")
    private BigDecimal financeStatus;

    /**
     * 融资锁定id
     */
    @ApiModelProperty("融资锁定id")
    private String financeId;

    /**
     * 受益人编码
     */
    @ApiModelProperty("受益人编码")
    private String beneficiaryCode;

    /**
     * 保函历史合同中占用授信使用的编码
     */
    @ApiModelProperty("保函历史合同中占用授信使用的编码")
    private String credReleaseCode;

    /**
     * 申请人/开函人银行账号ID
     */
    @ApiModelProperty("申请人/开函人银行账号ID")
    private String accountId;

    /**
     * 申请人/开函人银行账号
     */
    @ApiModelProperty("申请人/开函人银行账号")
    private String accountNo;

    /**
     * 账户号/开函人开户行编号
     */
    @ApiModelProperty("账户号/开函人开户行编号")
    private String bankCode;

    /**
     * 账户号/开函人开户行名称
     */
    @ApiModelProperty("账户号/开函人开户行名称")
    private String bankName;

    /**
     * 开户行行号
     */
    @ApiModelProperty("开户行行号")
    private String cnapsCode;

    /**
     * 是否有追索期 1是2否
     */
    @ApiModelProperty("是否有追索期 1是2否")
    private BigDecimal whetherRecoursePeriod;

    /**
     * 追索期（天）
     */
    @ApiModelProperty("追索期（天）")
    private BigDecimal recoursePeriod;

    /**
     * 数据来源 1手工维护2系统对接
     */
    @ApiModelProperty("数据来源 1手工维护2系统对接")
    private BigDecimal dataSource;

}
