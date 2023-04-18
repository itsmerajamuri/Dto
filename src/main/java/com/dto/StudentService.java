package com.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo repo;
	
	public List<StudentDto> getAllStudents(){
		List<Student> student= repo.findAll();
		 List<StudentDto> studentdto=  student.stream().map((s)->studentToStudentdto(s)).collect(Collectors.toList());
		 return studentdto;
	}
	
	public Student studentdtoToStudent(StudentDto studentdto) {
		Student student=new Student();
		student.setStudentcity(studentdto.getStudentcity());
		student.setStudentname(studentdto.getStudentname());
		return student;
	}
	public StudentDto studentToStudentdto(Student student) {
		StudentDto studentdto=new StudentDto();
		studentdto.setStudentcity(student.getStudentcity());
		studentdto.setStudentname(student.getStudentname());
		return studentdto;
	}
	public StudentDto saveStudent(StudentDto dto) {
		Student student= studentdtoToStudent(dto);
		Student student2= repo.save(student);
		StudentDto dto2=   studentToStudentdto(student2);
		return dto2;
		
	}
}
