package com.cn.huawei.springboot02config;

import com.cn.huawei.springboot02config.bean.Dog;
import com.cn.huawei.springboot02config.bean.Persion;
import com.cn.huawei.springboot02config.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springboot的测试单元
 * 可以在测试期间很方便的类似编码一样进行自动注入容器的功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ConfigApplicationTests {

    @Autowired
    Persion persion;
    @Autowired
    Dog dog;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        Boolean b = ioc.containsBean("helloService01");
        System.out.println(b);
    }

    @Test
    public void contextLoads() {
        System.out.println(persion);
        System.out.println(dog);
    }

}
