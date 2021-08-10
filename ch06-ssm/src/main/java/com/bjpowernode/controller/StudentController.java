package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

//    注册学生
    @RequestMapping(value = "/addStudent.do")
    public ModelAndView addStudent(Student student){
        int num = studentService.addStudent(student);
        String tip = "注册失败";
        ModelAndView ma = new ModelAndView();
        if(num > 0){
            tip = "学生{" + student.getName() +"}注册成功";
        }
        ma.addObject("tips",tip);
        ma.setViewName("result");
        return ma;


    }
    @RequestMapping("/querystu.do")
    @ResponseBody
    public List<Student> querystudent(){
        List<Student> L = new ArrayList<>();
        L = studentService.findStudent();
        return L;
    }
}
