/**
 * FileName: LoginController
 * Author:   xixi
 * Date:     19-7-21 下午11:04
 * Description: 登录控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.huawei.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 *  <br>
 * 〈登录控制器〉
 *
 * @author xixi
 * @create 19-7-21
 * @since 1.0.0
 */
@Controller
public class LoginController {

//    @DeleteMapping
//    @PutMapping
//    @GetMapping

//    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            // 为防止表单重复提交，添加重定向操作到主页面
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }else{
            // 登录失败
            map.put("msg", "用户名或密码有误");
            return "login";
        }
    }
}
