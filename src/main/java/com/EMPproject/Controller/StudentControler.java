package com.EMPproject.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.EMPproject.Student;
import com.EMPproject.Service.Studentservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class StudentControler {


    @Autowired
    Studentservices studentservices ;
    
    @GetMapping("stu")
    public List<Student> getMethodName() {
        return studentservices.Readdata();
    }

    @PostMapping("stu")
    public String postMethodName(@RequestBody Student student) {
         studentservices.AddNewdata(student);
        return "Add";
    }
    

    @DeleteMapping("stu/{id}")
    public Boolean Deleteval(@PathVariable Long id){
        studentservices.DeleteData(id);
        return true;
    }
    

}
