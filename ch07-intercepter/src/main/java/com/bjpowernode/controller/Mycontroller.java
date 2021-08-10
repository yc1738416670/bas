package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//加入controller注解,创建处理器对象
@Controller
public class Mycontroller {

    //@requestmapper绑定请求地址
//    value是唯一的，不可重复，加/使用
    @RequestMapping(value = "/receive.do", method = RequestMethod.POST)
    public ModelAndView dosome(String rname ,Integer rage) {
        ModelAndView ma = new ModelAndView();
        //添加数据，相当于
        //        request.setAttribute
        ma.addObject("msg",  rname);
        ma.addObject("fun", rage);
//自动跳转 forward
        ma.setViewName("show");
        return ma;


    }
    @RequestMapping(value = "/receiveobject.do", method = RequestMethod.POST)
    public ModelAndView dosome(Student student) {
        ModelAndView ma = new ModelAndView();
        //添加数据，相当于
        //        request.setAttribute
        ma.addObject("msg",  student.getName());
        ma.addObject("fun", student.getAge());
//自动跳转 forward
        ma.setViewName("show");
        return ma;


    }
}

