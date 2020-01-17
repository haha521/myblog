package com.hanyuebb.myblog.web.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:MassageConverConfiguration
 * Package:com.hanyuebb.myblog.web.config
 * Description:
 *
 * @date:2020/1/17 12:31
 * @auther:zh
 */
@Configuration
public class MassageConverConfiguration {
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
        // 处理中文的乱码问题
        // 创建MediaType的集合
        List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
        // 设置编码格式为UTF8
        supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        // 将supportedMediaTypes对象赋值给fastJsonHttpMessageConverter的SupportedMediaTypes属性
        fastJsonHttpMessageConverter.setSupportedMediaTypes(supportedMediaTypes);
        fastJsonHttpMessageConverter.setFastJsonConfig(config);
        return new HttpMessageConverters(fastJsonHttpMessageConverter);
    }
}

