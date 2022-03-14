package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

@Controller
public class ScopeController {
    @RequestMapping("/testModelAndView")
    public ModelAndView testmodelAndView(){
        ModelAndView mav=new ModelAndView();
        //处理模型数据，即向请求域request共享数据
        mav.addObject("testRequestScope","hello,mav");
        //设置试图名称
        mav.setViewName("success");
        return mav;
    }
    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("testScope", "hello,ModelMap");
        return "success";
    }
    @RequestMapping("/testSession")
    public String testSessioin(HttpSession session){
        session.setAttribute("testSessionScope","hello,session");
        return "success";
    }
    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session){
        ServletContext application=session.getServletContext();
        application.setAttribute("testApplication","hello.app");
        return "success";
    }
}
