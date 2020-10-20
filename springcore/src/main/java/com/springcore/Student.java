package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	public String getStudentName() {
		return studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public Student(String studentName, String studentAddress, int studentId) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentId = studentId;
	}

	public Student() {
		super();
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
}
