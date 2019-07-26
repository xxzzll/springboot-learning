/**
 * FileName: HelloWorldQuickController
 * Author:   xixi
 * Date:     19-7-7 上午1:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.huawei.springboot02quick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *  <br>
 * 〈〉
 *
 * @author xixi
 * @create 19-7-7
 * @since 1.0.0
 */
//@Controller
//@ResponseBody
@RestController
public class HelloWorldQuickController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick!";
    }

    // RESTFull API方式的请求，没有页面跳转，处理后立即返回给浏览器，如果是对象的话转成json字符串
}
