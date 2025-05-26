package com.main;
import com.school.School;
import com.student.Student;

public class Main {
	public static void main(String[] args) {
		School school=School.getSchoolObject("svhs", "GDK", "Learn something new everyday");
		Student student=Student.getStudentObject("vinay","A+",school, 97.0);
		if(school==null&&student==null) {
			System.out.println("enter valid details");
		}
		else {
			System.out.println(school);
			System.out.println(student);

		}
	}

}
