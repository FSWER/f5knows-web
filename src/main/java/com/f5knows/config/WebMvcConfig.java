package com.f5knows.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将templates目录下的CSS、JS文件映射为静态资源，防止Spring把这些资源识别成thymeleaf模版
        registry.addResourceHandler("/static/**.js").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/static/**.css").addResourceLocations("classpath:/static/");
        //其他静态资源
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}

