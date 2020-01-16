package com.hanyuebb.myblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
@MapperScan(basePackages = {"com.hanyuebb.myblog.web.mapper","com.hanyuebb.myblog.common.mapper"})
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class,args);
    }
}
