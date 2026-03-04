package com.test.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Student;
import com.test.repository.StudentRepository;
import com.test.service.StudentService;

@RestController
public class StudenttController {

    private final StudentRepository studentRepository;
	
	protected Logger logger = Logger.getLogger(StudenttController.class.getName());
	
	@Autowired
	private StudentService service;

    StudenttController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student std)
	{
		return service.addStudent(std);
	}
	
	@PostMapping("/update/{id}")
	public Student updateStudent(@PathVariable int id, Student std)
	{
		std.setId(id);
		
		return service.updateStudent(std);
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id, Student std)
	{
		return service.getStudentbyId(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Student> deleteStudentById(@PathVariable int id)
	{
		return service.deleteStudentById(id);
	}
	
	@GetMapping("/list")
	public List<Student> getAllStudents()
	
	{
		return service.listAllStudents();
	}
}
