/**
 * FileName: EmployeeController
 * Author:   xixi
 * Date:     19-7-23 下午12:19
 * Description: 员工控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.huawei.springboot.controller;

import com.cn.huawei.springboot.dao.EmployeeDao;
import com.cn.huawei.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 *  <br>
 * 〈员工控制器〉
 *
 * @author xixi
 * @create 19-7-23
 * @since 1.0.0
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/emps")
    public String list(Model model){

        Collection<Employee> employees = employeeDao.getAll();
        // 将员工集合放入请求域中
        model.addAttribute("emps", employees);

        // themreaf模板引擎渲染 classpath:/templates/xxx..html
        return "/emp/list";
    }
}
