package com.example.dbdemo;

import jakarta.persistence.*;

@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cus_id;
    private String cus_name;
    private Long stu_id;
    public Course(){}
    public Course(String cus_name){
        this.cus_name = cus_name;
    }
    public String getCus_name(){
        return cus_name;
    }
    public Long getStu_id() {
        return stu_id;
    }
    public Long getCus_id() {
        return cus_id;
    }
}
