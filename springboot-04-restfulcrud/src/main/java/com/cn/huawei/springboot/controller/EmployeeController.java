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

import com.cn.huawei.springboot.dao.DepartmentDao;
import com.cn.huawei.springboot.dao.EmployeeDao;
import com.cn.huawei.springboot.entities.Department;
import com.cn.huawei.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private DepartmentDao departmentDao;

    @GetMapping("/emps")
    public String list(Model model){

        Collection<Employee> employees = employeeDao.getAll();
        // 将员工集合放入请求域中
        model.addAttribute("emps", employees);

        // themreaf模板引擎渲染 classpath:/templates/xxx..html
        return "/emp/list";
    }

    // 跳转到新增员工页面
    @GetMapping("/emp")
    public String goAdd(Model model){
        // 获取员工部门数据
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departs", departments);
        return "/emp/add";
    }

    // 保存
    @PostMapping("/emp")
    public String saveEmployee(Employee employee){
        employeeDao.save(employee);

        return "redirect:/emps";
    }

    // 去修改页面
    @GetMapping("/emp/{id}")
    public String goUpdate(@PathVariable("id") Integer id, Model model){
        // 获取修改的员工数据
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp", employee);
        // 获取员工部门数据
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departs", departments);

        return "/emp/add";
    }

    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);

        return "redirect:/emps";
    }

    // 删除员工数据
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);

        return "redirect:/emps";
    }
}
