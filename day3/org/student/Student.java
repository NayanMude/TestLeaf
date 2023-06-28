package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("The Student's name is: Robin Singh");
	}
	public void studentDept() {
		System.out.println("The student is from the Electronics and Communication Department.");
	}
	public void studentId() {
		System.out.println("The student ID is: EC13027");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}

}
