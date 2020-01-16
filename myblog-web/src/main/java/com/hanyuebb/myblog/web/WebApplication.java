package com.hanyuebb.myblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * ClassName:WebApplication
 * Package:com.hanyuebb.myblog.web
 * Description:
 *
 * @date:2020/1/16 1:26
 * @auther:zh
 */
@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = {"com.hanyuebb.myblog.web.mapper","com.hanyuebb.myblog.common.mapper"})
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class,args);
    }
}
