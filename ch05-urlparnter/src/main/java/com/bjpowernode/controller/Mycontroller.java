package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

//加入controller注解,创建处理器对象
@Controller
public class Mycontroller {
    /**
     * String 用于视图的跳转
     * 可以自己添加Httprequest，给对象赋值
     */

    //@requestmapper绑定请求地址
//    value是唯一的，不可重复，加/使用
    @RequestMapping(value = "/return.do", method = RequestMethod.POST)
    public String dosome(HttpServletRequest request,String name, Integer age) {
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);
        return "show";


    }

}

