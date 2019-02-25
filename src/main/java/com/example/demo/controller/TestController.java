package com.example.demo.controller;

import com.example.demo.ApiResponse;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
@RestController
@RequestMapping(value="test")
public class TestController {

    @GetMapping(value="StudentMan")
    public List<Student> getStudentList()
    {
        Student stu1= new Student("孙永锐1",1,"男");
        Student stu2= new Student("孙永锐2",2,"女");
        List<Student> list1 = new ArrayList<>();
        list1.add(stu1);
        list1.add(stu2);

        return list1;
    }
    @GetMapping(value="testsucess")
    public ApiResponse<List<Student>> test()
    {
        Student stu1= new Student("孙永锐1",1,"男");
        Student stu2= new Student("孙永锐2",2,"女");
        List<Student> list1 = new ArrayList<>();
        list1.add(stu1);
        list1.add(stu2);
        return ApiResponse.success(list1);
    }
}
