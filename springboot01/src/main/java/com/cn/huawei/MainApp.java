/**
 * FileName: MainApp
 * Author:   xixi
 * Date:     19-7-6 下午9:54
 * Description: 主程序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.huawei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  <br>
 * 〈Spring Boot 主程序〉
 *@SpringBootApplication 来标注一个主程序类，说明一个Spring Boot 应用
 * @author xixi
 * @create 19-7-6
 * @since 1.0.0
 */
@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        // 让Spring Boot 主程序启动起来
        SpringApplication.run(MainApp.class, args);
    }
}
