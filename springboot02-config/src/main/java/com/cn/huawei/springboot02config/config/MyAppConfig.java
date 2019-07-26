/**
 * FileName: MyAppConfig
 * Author:   xixi
 * Date:     19-7-7 下午1:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.huawei.springboot02config.config;

import com.cn.huawei.springboot02config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  <br>
 * @Configuration:指明当前类是个配置类，替代Spring配置文件
 * 在配置文件用<bean></bean>标签添加组件
 *
 * @author xixi
 * @create 19-7-7
 * @since 1.0.0
 */

@Configuration
public class MyAppConfig {

    // 将方法的返回值添加到容器中，容器中组件id默认为方法名
    @Bean
    public HelloService helloService01(){
        System.out.println("配置类@Bean给容器添加组件了....");
        return new HelloService();
    }
}
