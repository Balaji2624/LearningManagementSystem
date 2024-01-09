package com.Technosignia.Learingmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.Learingmanagementsystem.dao.DepartmentRepository;
import com.Technosignia.Learingmanagementsystem.entity.Department;

@Service
public class DepartmentService {
     @Autowired
     DepartmentRepository repository;
     public Department addDepartment(Department dept)
     {
    	 return repository.save(dept);
     }
}
