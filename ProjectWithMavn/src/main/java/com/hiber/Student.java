package com.hiber;

public class Student {

	int studentId;
	String studentName;
	String country;
	
	public Student() {
		super();
	}

	public Student(String studentName, String country) {
		super();
		this.studentName = studentName;
		this.country = country;
		
	}

	public int getstudentId() {
		return studentId;
	}

	public void setCityId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}