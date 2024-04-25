package com.gykj.patch.manager;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@MapperScan("com.gykj.patch.manager.core.dao")
public class PatchManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatchManagerApplication.class, args);


    }

}
