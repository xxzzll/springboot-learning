package com.cn.huawei.springboot03logging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03LoggingApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    // 日志级别
    // 由低到高：trace<debug<info<warn<error
    // 可以调整输出的日志级别;日志就会在这个级别以上做出信息输出
    @Test
    public void contextLoads() {
//        System.out.println("");

        logger.trace("这个是trace日志...");
        logger.debug("这个是debug日志...");
        // SpringBoot默认是info级别的日志记录，没有指出级别就用springboot默认给出的级别：root级别
        logger.info("这个是info日志...");
        logger.warn("这个是warn日志...");
        logger.error("这个是error日志...");


    }

}
