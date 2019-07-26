/**
 * FileName: MyHandlerInterceptor
 * Author:   xixi
 * Date:     19-7-22 下午12:05
 * Description: 自定义拦截器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.huawei.springboot.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  <br>
 * 〈自定义拦截器〉
 * 目的：检查登录请求
 * @author xixi
 * @create 19-7-22
 * @since 1.0.0
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoginHandlerInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object loginUser = request.getSession().getAttribute("loginUser");
        if(StringUtils.isEmpty(loginUser)){
            logger.info("拦截的请求URI：" + request.getRequestURI());
            // 没有登录,重定向的登录页面
            request.setAttribute("msg", "没有权限访问");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        }else{
            return true;
        }
    }
}
