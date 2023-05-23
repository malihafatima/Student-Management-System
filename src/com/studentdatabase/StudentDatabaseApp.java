package com.studentdatabase;
import java.util.Scanner;
public class StudentDatabaseApp {

	public static void main(String [] arg){
		/*Student S1=new Student();
		S1.enroll();
		S1.payTution();
		S1.viewBalance();*/
		
		System.out.println("Enter no of students to enroll");
		Scanner S4=new Scanner(System.in);
		int noofStudents = S4.nextInt();
		Student[] students= new Student[noofStudents];
		
		for(int n=0;n<noofStudents;n++) {
			students[n]= new Student();
			students[n].enroll();
			students[n].viewBalance();
			students[n].payTution();
			
		}
		for(int n=0;n<noofStudents;n++) {
			System.out.println(students[n].toString());
		}
		
		
	}
}
