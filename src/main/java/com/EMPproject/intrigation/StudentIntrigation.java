package com.EMPproject.intrigation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EMPproject.Student;
import com.EMPproject.Repository.StudentRepo;
import com.EMPproject.Service.Studentservices;


@Service
public class StudentIntrigation implements Studentservices {

    @Autowired
    private StudentRepo studentRepo ;

    @Override
    public String AddNewdata(Student student) {

        studentRepo.save(student);

        return "add sucessfull";
    }

    @Override
    public List<Student> Readdata() {

        return studentRepo.findAll();
    }

    @Override
    public Boolean DeleteData(Long id) {

        studentRepo.deleteById(id);
        return true;
    }
    
}
