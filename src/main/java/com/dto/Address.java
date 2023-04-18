package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String city;
//	@OneToOne(mappedBy ="address")
//	@JsonIgnore
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
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
//	@Override
//	public String toString() {
//		return "Address [id=" + id + ", city=" + city + ", student=" + student + "]";
//	}
	
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + "]";
	}

	
}
