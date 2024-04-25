package com.gykj.patch.manager.core.util;

import cn.hutool.core.util.NumberUtil;
import com.mybatisflex.codegen.Generator;
import com.mybatisflex.codegen.config.ColumnConfig;
import com.mybatisflex.codegen.config.GlobalConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.math.BigDecimal;

/**
 * @author yaoye
 * @desc TODO
 * @date 2024/4/9 16:39
 **/
public class Codegen {

    public static void main(String[] args) {

//
//        double add = NumberUtil.add(426957984227.12, 401659279310.30);
//
//        BigDecimal divide = NumberUtil.div(NumberUtil.div(483620549.36, add), BigDecimal.valueOf(30), 2);
//
//        System.out.println(divide);


        //配置数据源
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:dm://120.46.135.203:5236/CMS_CORE?characterEncoding=utf-8");
        dataSource.setUsername("CMS_CORE");
        dataSource.setPassword("1qaz_@WSX");

//        //创建配置内容，两种风格都可以。
        GlobalConfig globalConfig = createGlobalConfigUseStyle1();
//        GlobalConfig globalConfig = createGlobalConfigUseStyle2();

        //通过 datasource 和 globalConfig 创建代码生成器
        Generator generator = new Generator(dataSource, globalConfig);

        //生成代码
        generator.generate();
    }

    public static GlobalConfig createGlobalConfigUseStyle1() {
        //创建配置内容
        GlobalConfig globalConfig = new GlobalConfig();


        //设置根包
        globalConfig.setBasePackage("com.test");

        //设置表前缀和只生成哪些表
//        globalConfig.setTablePrefix("tb_");
        globalConfig.setGenerateTable("t_logm_deposit"


        );

        //设置生成 entity 并启用 Lombok
        globalConfig.setEntityGenerateEnable(true);
        globalConfig.setEntityWithLombok(true);
        //设置项目的JDK版本，项目的JDK为14及以上时建议设置该项，小于14则可以不设置
//        globalConfig.setJdkVersion(17);

        //设置生成 mapper
        globalConfig.setMapperGenerateEnable(true);


        globalConfig.setMapperXmlGenerateEnable(true);

        globalConfig.setServiceGenerateEnable(true);


        globalConfig.setServiceImplGenerateEnable(true);

        globalConfig.setEntityWithSwagger(true);






        //可以单独配置某个列
//        ColumnConfig columnConfig = new ColumnConfig();
//        columnConfig.setColumnName("tenant_id");
//        columnConfig.setLarge(true);
//        columnConfig.setVersion(true);
//        globalConfig.setColumnConfig("tb_account", columnConfig);

        return globalConfig;
    }

    public static GlobalConfig createGlobalConfigUseStyle2() {
        //创建配置内容
        GlobalConfig globalConfig = new GlobalConfig();

        //设置根包
        globalConfig.getPackageConfig()
                .setBasePackage("com.test");

        //设置表前缀和只生成哪些表，setGenerateTable 未配置时，生成所有表
        globalConfig.getStrategyConfig()
                .setGenerateTable("T_ARMG_RE_RECEIVABLE_INPUT");

        //设置生成 entity 并启用 Lombok
        globalConfig.enableEntity()
                .setWithLombok(true)
                .setJdkVersion(8).
        setWithSwagger(true);

        //设置生成 mapper
        globalConfig.enableMapper();

//        //可以单独配置某个列
//        ColumnConfig columnConfig = new ColumnConfig();
//        columnConfig.setColumnName("tenant_id");
//        columnConfig.setLarge(true);
//        columnConfig.setVersion(true);
//        globalConfig.getStrategyConfig()
//                .setColumnConfig("tb_account", columnConfig);

        return globalConfig;
    }
}
