/**
 * FileName: MyWebMvcConfiguration
 * Author:   xixi
 * Date:     19-7-10 上午12:12
 * Description: 自定义MVC的Configuiration
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.huawei.springboot.config;

import com.cn.huawei.springboot.component.LoginHandlerInterceptor;
import com.cn.huawei.springboot.component.MyLocaleResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *  <br>
 * 〈自定义MVC的Configuiration〉
 * 使用WebMvcConfigurer可以扩展SpringMVC的功能
 * @author xixi
 * @create 19-7-10
 * @since 1.0.0
 */
//@EnableWebMvc  // 不要接管SpringMVC
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private static final Logger logger = LoggerFactory.getLogger(WebMvcConfig.class);

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 浏览器发送 /test 请求来到 succes
        registry.addViewController("/test").setViewName("success");
//        registry.addViewController("/").setViewName("index");
//        registry.addViewController("index.html").setViewName("index");
    }

    @Bean // 将组件注册到容器中
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                logger.info("add view mapping");
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                logger.info("add interceptors");

                // 添加拦截器拦截路径模式
                // 静态资源: .css .js .png ... SpringBoot 1.xx版本已经做好了静态资源映射;
                // SpringBoot 2.xx需要自己配置排除静态资源规则
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/index.html", "/", "/user/login", "/asserts/**", "/webjars/**");
            }
        };
        return webMvcConfigurer;
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

}
