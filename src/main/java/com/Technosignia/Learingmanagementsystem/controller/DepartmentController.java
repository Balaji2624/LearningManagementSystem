package com.Technosignia.Learingmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.Learingmanagementsystem.entity.Department;
import com.Technosignia.Learingmanagementsystem.service.DepartmentService;

@RestController
public class DepartmentController {
     @Autowired
     DepartmentService service;
     @PostMapping("/save")
     private Department save(Department dept)
     {
    	 return service.addDepartment(dept);
     }
}
