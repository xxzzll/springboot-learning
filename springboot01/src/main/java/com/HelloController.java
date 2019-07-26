/**
 * FileName: HelloController
 * Author:   xixi
 * Date:     19-7-6 下午11:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  <br>
 * 〈放置在扫描包范围外是否是否能够注册到spring容器中的控制器类〉
 * 答案：否，扫描不到带有@SpringBootApplication标注类所在包以其所有子包之外的组件到spring容器
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
