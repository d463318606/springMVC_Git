package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    //前面绿色的图标表示此controller已经被扫描到并且交给了ioc容器来管理
    //"/"-->/WEB-INF/templates/index.html

    @RequestMapping("/")//让请求匹配到请求映射
    public String index() {
    //返回试图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
