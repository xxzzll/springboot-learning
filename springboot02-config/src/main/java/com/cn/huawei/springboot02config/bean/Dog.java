/**
 * FileName: Dog
 * Author:   xixi
 * Date:     19-7-7 上午2:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.huawei.springboot02config.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *  <br>
 * 〈@Value注解的使用，用来给某个特定属性从配置文件中设置值〉
 *
 * @author xixi
 * @create 19-7-7
 * @since 1.0.0
 */
@Component
public class Dog {
    /**
     * <bean class="Dog">
     *      <property name="name" value="？=字面量|${key}环境变量、配置文件中获取|#{SpeL}"></property>
     * </bean>
     */

    @Value("${dog.name}")
    private String name;
    @Value("#{0.2*10}")
    private Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
