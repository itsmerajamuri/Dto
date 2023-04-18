package com.dto;

public class StudentDto {
	
	
	private String studentname;
	private String studentcity;
//	private Address address;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	
	
//	@Override
//	public String toString() {
//		return "StudentDto [studentname=" + studentname + ", studentcity=" + studentcity + ", address=" + address + "]";
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	public StudentDto() {
		super();
	}
	@Override
	public String toString() {
		return "StudentDto [studentname=" + studentname + ", studentcity=" + studentcity + "]";
	}
	
	
	
	

}
