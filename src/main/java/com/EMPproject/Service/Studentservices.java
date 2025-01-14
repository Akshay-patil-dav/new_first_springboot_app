package com.EMPproject.Service;

import java.util.List;

import com.EMPproject.Student;

public interface Studentservices {

    String AddNewdata(Student student);
    List<Student> Readdata();
    Boolean DeleteData(Long id);
} 
