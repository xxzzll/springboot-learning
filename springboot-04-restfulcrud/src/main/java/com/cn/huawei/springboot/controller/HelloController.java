/**
 * FileName: HelloController
 * Author:   xixi
 * Date:     19-7-8 下午9:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.huawei.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 *  <br>
 * 〈〉
 *
 * @author xixi
 * @create 19-7-8
 * @since 1.0.0
 */
@Controller
public class HelloController {

    // 设法访问首页
//    @RequestMapping({"/", "index.html"})
//    public String index(){
//        return "index";
//    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello!";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        // 从这个路径下查找HTML:classpath:/templates/
        map.put("hello", "这是首次使用Thymeleaf默认引擎！");
        return "success";
    }
}
