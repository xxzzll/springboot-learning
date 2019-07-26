/**
 * FileName: Persion
 * Author:   xixi
 * Date:     19-7-7 上午2:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.huawei.springboot02config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *  <br>
 * 将配置文件中配置的每一个属性的值，映射到这个组件中;
 * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定;
 *      prefix = "persion"：配置文件中哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，容器才能提供的ConfigurationProperties功能;
 * @ConfigurationProperties(prefix = "persion")默认从全局配置文件中获取值;
 *
 * @author xixi
 * @create 19-7-7
 * @since 1.0.0
 */
//@PropertySource(value = "classpath:persion.properties")
@Component // 交给spring容器管理
@ConfigurationProperties(prefix = "persion")
@Validated // JSR303数据校验，和@ConfigurationProperties注解一起使用，来验证属性的值是否符合指定类型规范，如：@Email-邮件地址类型
public class Persion {

//    @Email // 必须是邮箱格式的数据
    private String lastName;
    private Integer age;
    private Date birthday;
    private Map<String,Object> maps;
    private List<Object> list;
    private Dog dog;

    @Override
    public String toString() {
        return "Persion{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", maps=" + maps +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
