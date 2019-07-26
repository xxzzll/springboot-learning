/**
 * FileName: HelloController
 * Author:   xixi
 * Date:     19-7-6 下午9:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.huawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  <br>
 * 〈〉
 *
 * @author xixi
 * @create 19-7-6
 * @since 1.0.0
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        return "Hello World!";
    }
}
