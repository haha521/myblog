package com.hanyuebb.myblog.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ClassName:Swagger2
 * Package:com.hanyuebb.myblog.web.controller
 * Description:
 *
 * @date:2020/1/16 20:27
 * @auther:zh
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hanyuebb.myblog.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("hanyuebb的个人博客RESTful APIs")
                .description("自己的博客系统")
                .termsOfServiceUrl("http://www.hanyuebb.com/")
                .contact("@寒月饼饼")
                .version("1.0")
                .build();
    }

}