package com.EMPproject.integration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.EMPproject.Student;
import com.EMPproject.Services.StudentServices;

public class StudentIntrigation implements StudentServices {

    
    List<Student> student = new ArrayList<>();

    @Override
    public List<Student> getAllStudents() {
        // Tret
         return student;
    }

    @Override
    public String CreateallStudent(Student studentent) {
        // TODO Auto-generated method stub
        student.add(studentent);
        return "Created Scucessfully";
    }

    @Override
    public boolean DeleteStudent(int id) {
        // TODO Auto-generated method stub
        student.remove(id);
        return true;
    }
    
}
