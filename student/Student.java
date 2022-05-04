package org.student;

import org.department.Department;

public class Student extends Department {

	public static void studentName()
	{
		System.out.println("Student Name is ANAND");
		
	}
	
	public static void studentDept()
	{
		System.out.println("Student department is EEE");
		
	}
	
	public static void studentId()
	{
		System.out.println("Student Id is 12335");
	}
	
	public static void main(String[] args) {
		
		Student stud = new Student();
		
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentId();
		stud.studentDept();
	
		
		
	}
}
