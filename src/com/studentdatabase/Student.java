package com.studentdatabase;
import java.util.Scanner;
public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tutionBalance=0;
	private static int costofCourse=600;
	private static int id=1001;
	
	////Constructor:Prompt user to enter students name and year
	public Student() {
		Scanner S1 = new Scanner(System.in);
		System.out.println("First Name:  ");
		this.firstName = S1.nextLine();
		
		System.out.println("Last Name:  ");
		this.lastName = S1.nextLine();
		
		System.out.println("1-Fresher \n2-Experienced \n3-Junior \n4-Senior \nEnter class level:");
		this.gradeYear=S1.nextInt();
		setStudentID();
	//	System.out.println("First Name  :  "+firstName+ "\nLast Name  :   "+lastName+  "\nGrade Year  :  " +gradeYear+  "\nStudent ID  : " +studentID );

	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gradeYear=" + gradeYear
				+ ", studentID=" + studentID + ", courses=" + courses + ", tutionBalance=" + tutionBalance + "]";
	}
	//generate an id
	private void setStudentID(){
		id++;
		this.studentID=gradeYear+""+id;                        
	}
	public void enroll(){ 
		do {
			System.out.println("Enter course to enroll(Q for Quit)");
			Scanner S2= new Scanner(System.in);
			String course =S2.nextLine();
			if(!course.equals("Q")) {
				courses=courses+"\n"+course;
				tutionBalance= tutionBalance+costofCourse;
			}
			else{
				System.out.println("Break");
				break;
			}
		}
		while(1!='Q');
		
	}
	public void viewBalance() {
		System.out.println("Your balance is "+tutionBalance);
	}
public void payTution() {
	viewBalance();
	System.out.println("Enter your Payment");
	Scanner S3=new Scanner(System.in);
	int payment=S3.nextInt();
	tutionBalance= tutionBalance-payment;
	System.out.println("Thank You for your Payment "+payment);
	
}
}
