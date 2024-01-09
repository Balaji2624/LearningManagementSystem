package com.Technosignia.Learingmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.Learingmanagementsystem.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
