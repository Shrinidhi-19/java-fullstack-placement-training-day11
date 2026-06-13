package com.example.dbdemo;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    private final StudentRepository srepo;
    private final CourseRepository crepo;
    public StudentService(StudentRepository srepo, CourseRepository crepo){
        this.srepo = srepo;
        this.crepo = crepo;
    }
    public List<Student> getStudentAll(){
        return srepo.findAll();
    }
    public List<Course> getCourseAll(){
        return crepo.findAll();
    }
    public Student addStudent(Student s){
        return srepo.save(s);
    }
    public Course addCourse(Course c){
        return crepo.save(c);
    }
}
