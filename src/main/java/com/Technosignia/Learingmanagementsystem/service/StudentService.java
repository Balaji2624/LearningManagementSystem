package com.Technosignia.Learingmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.Learingmanagementsystem.dao.StudentRepository;
import com.Technosignia.Learingmanagementsystem.entity.Student;

@Service
public class StudentService {
	@Autowired
     StudentRepository studentRepository;
	
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
	}
	public void deleteStudent(Student student) {
		studentRepository.delete(student);
	}
	public Student updateStudent(Student correctStudent, Long id) {
		Student student = studentRepository.findById(id).get();
		
		if(student.getName() != null) {
			student.setName(correctStudent.getName());
		}
		if(student.getAddress() != null) {
			student.setAddress(correctStudent.getAddress());
		}			
		return studentRepository.save(student);
	}
}
