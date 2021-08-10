package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//加入controller注解,创建处理器对象
@Controller
@RequestMapping("test")
public class Mycontroller {

//@requestmapper绑定请求地址
//    value是唯一的，不可重复，加/使用
   @RequestMapping(value = "/some.do")
    public ModelAndView dosome(){
        ModelAndView ma = new ModelAndView();
        //添加数据，相当于
        //        request.setAttribute
        ma.addObject("msg","欢迎使用springmvc开发");
        ma.addObject("fun","你好有趣");
//自动跳转 forward
        ma.setViewName("show");

        return ma;
    }

    @RequestMapping(value = "/any.do")
    public ModelAndView doany(){
        ModelAndView ma = new ModelAndView();
        //添加数据，相当于
        //        request.setAttribute
        ma.addObject("msg","欢迎使用springmvc开发");
        ma.addObject("fun","你好有趣");
//自动跳转 forward
        ma.setViewName("show");

        return ma;
    }
}
