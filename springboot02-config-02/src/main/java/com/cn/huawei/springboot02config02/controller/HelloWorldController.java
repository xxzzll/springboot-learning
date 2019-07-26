/**
 * FileName: HelloWorldController
 * Author:   xixi
 * Date:     19-7-7 下午2:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.huawei.springboot02config02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  <br>
 * 〈〉
 *
 * @author xixi
 * @create 19-7-7
 * @since 1.0.0
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hello world!";
    }
}
