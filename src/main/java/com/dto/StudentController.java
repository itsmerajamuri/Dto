package com.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService  service;
	
	@GetMapping("/student")
	public List<StudentDto> getAllStudents(){
		return service.getAllStudents();
	}
	
	@PostMapping("/student")
	public StudentDto saveStudent(@RequestBody StudentDto dto) {
		return service.saveStudent(dto);
	}

}
