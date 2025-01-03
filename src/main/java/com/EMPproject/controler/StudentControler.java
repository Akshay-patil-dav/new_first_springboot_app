package com.EMPproject.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EMPproject.Student;
import com.EMPproject.Services.StudentServices;
import com.EMPproject.integration.StudentIntrigation;

@RestController
public class StudentControler {
    
    // List<Student> studentts = new ArrayList<>();
    StudentServices studentServices = new StudentIntrigation();


    @GetMapping("student")
    public List<Student> getallStudent(){
        return studentServices.getAllStudents();
        
    }

    @PostMapping("student")
    public String CreateStudent(@RequestBody Student student){
        studentServices.CreateallStudent(student);
        return "Create Student Sucessfully";
    }

    @DeleteMapping("student/{id}")
    public String DeleteStudent(@PathVariable int id){
        
       if( studentServices.DeleteStudent(id))
            return "Delete Student Sucessfully";
        return "Not found";
        
    }
}

