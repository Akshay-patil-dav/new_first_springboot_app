package com.EMPproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EMPproject.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student , Long> {

}
