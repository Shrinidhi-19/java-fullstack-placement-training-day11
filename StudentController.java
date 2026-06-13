package com.example.dbdemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/record")
public class StudentController {
    private final StudentService stu_ser;
    public StudentController(StudentService stu_ser){
        this.stu_ser = stu_ser;
    }
    @GetMapping("/stu")
    public List<Student> getStu_all(){
        return stu_ser.getStudentAll();
    }
    @GetMapping("/cors")
    public List<Course> getcus_all(){
        return stu_ser.getCourseAll();
    }
    @PostMapping("/stu")
    public Student sadd(@RequestBody Student st){
        return stu_ser.addStudent(st);
    }
    @PostMapping("/cors")
    public Course cadd(@RequestBody Course co){
        return stu_ser.addCourse(co);
    }
}
