package com.EMPproject.Services;

import java.util.List;

import com.EMPproject.Student;

public interface StudentServices {
    
    List<Student> getAllStudents();
    String CreateallStudent(Student students);
    boolean DeleteStudent(int id);
}
