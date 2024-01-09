package com.Technosignia.Learingmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.Learingmanagementsystem.entity.Student;
import com.Technosignia.Learingmanagementsystem.service.StudentService;

@RestController
public class StudentController {
	@Autowired
     StudentService studentService;
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	@GetMapping("/find/{id}")
	private Student findStudentById(@PathVariable Long id)
	{
		return studentService.getStudentById(id);
	}
	@GetMapping("/findAll")
	private List<Student> findAllStudent()
	{
		return studentService.getAllStudent();
	}
	@DeleteMapping("/delete")
	private String deleteStudent(Student student)
	{
		studentService.deleteStudent(student);
		return "Student Deleted Successfully";
	}
	@PutMapping("/update/{id}")
	private Student updateStudent(@RequestBody Student student,@PathVariable Long id)
	{
		return studentService.updateStudent(student,id);
	}
}
