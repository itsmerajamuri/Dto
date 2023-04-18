package com.dto;


public class AddressDto {
	
	private int id;
	private String city;
//	private Student student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public AddressDto() {
		super();
	}
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
//	@Override
//	public String toString() {
//		return "AddressDto [id=" + id + ", city=" + city + ", student=" + student + "]";
//	}
	@Override
	public String toString() {
		return "AddressDto [id=" + id + ", city=" + city + "]";
	}
	
//	
	
	
	
	

}
