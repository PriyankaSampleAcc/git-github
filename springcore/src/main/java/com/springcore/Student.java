package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAddress=" + studentAddress + ", studentId=" + studentId
				+ "]";
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
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

}
