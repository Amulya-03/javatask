package com.student;

import com.school.School;

public class Student {
	private  String studentName;
	private  String grade;
	private  School school;
	private double averageMarks;
	
	private Student(String studentName, String grade, School school, double averageMarks) {
		this.studentName=studentName;
		this.grade=grade;
		this.school=school;
		this.averageMarks=averageMarks;
	}
	//getters
	public String getstudentName() {
		return studentName;
		
	}
	public String getgrade() {
		return grade;
	}
	public School getschool() {
		return school;
	}
	public double getaverageMarks() {
		return averageMarks;
	}
	
	//setters
	public void setStudentName(String getstudentName) {
		this.studentName=studentName;
	}
	public void setGrade(String grade) {
		this.grade=grade;
		
	}
	public void setSchool(School school) {
		this.school=school;
	}
	public void setAverageMarks() {
		if(averageMarks<0||averageMarks>100) {
			System.out.println("Invalid Marks");
		}
		else {
			this.averageMarks=averageMarks;
		}
		
		
	}
	public String toString() {
		return "Student[studentName="+studentName+", grade= "+grade+", school="+school+", averageMarks="+averageMarks+"]";
	}
	public static Student getStudentObject(String studentName, String grade, School school, double averageMarks) {
		if(averageMarks<0||averageMarks>100||studentName==null) {
			return null;
		}
		return new Student(studentName, grade, school, averageMarks);
		
	}
}
