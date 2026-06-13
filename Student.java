package com.example.dbdemo;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stu_id;
    private String stu_name;
    private Long cus_id;
    public Student(){}
    public Student(String stu_name){
        this.stu_name = stu_name;
    }
    public String getStu_name(){
        return stu_name;
    }
    public Long getStu_id() {
        return stu_id;
    }
    public Long getCus_id() {
        return cus_id;
    }
}
