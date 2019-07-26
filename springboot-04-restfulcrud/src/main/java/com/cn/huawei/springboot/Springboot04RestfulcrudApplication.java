package com.cn.huawei.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class Springboot04RestfulcrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04RestfulcrudApplication.class, args);
    }


    // 自定义视图解析器
    @Bean
    public ViewResolver getMyViewResolver(){
        return new MyViewResolver();
    }

    public static class MyViewResolver implements ViewResolver {
        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}
