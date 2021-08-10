package com.bjpowernode.service;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
//引用方式的自动注入@Resourse,@Autowried
    @Resource
    private StudentDao studentDao;
    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertstudent(student);
        return nums;

    }

    @Override
    public List<Student> findStudent() {
        List<Student> L = new ArrayList<>();

        L = studentDao.selectStudents();

        return L;


    }
}
