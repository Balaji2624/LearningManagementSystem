package com.Technosignia.Learingmanagementsystem.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.Learingmanagementsystem.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
 
}
