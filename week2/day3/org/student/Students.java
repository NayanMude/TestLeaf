package org.student;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("The Student ID is: "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("The student's name is "+name+" the Student ID is: "+id);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("The mail-id of the student is: "+email+" and the mobile number is: +91-"+phoneNumber);
	}
	public static void main(String[] args) {
		Students st = new Students();
		
		st.getStudentInfo(1560);
		st.getStudentInfo(1560, "Robin Singh");
		st.getStudentInfo("robin.singh@gmail.com", 8765689505l);
	}

}
