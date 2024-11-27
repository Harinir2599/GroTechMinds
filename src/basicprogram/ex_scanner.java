package basicprogram;

import java.util.Scanner;

public class ex_scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name");
		String name = sc.next();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the student id");
		int id = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the student college");
		String college = sc.next();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the student branch");
		String branch = sc3.next();
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter the student phone number");
		long phno = sc4.nextLong();
		
		System.out.println("The student name is " +name);
		System.out.println("The student id is " +id);
		System.out.println("The student college name is " +college);
		System.out.println("The student branch is " +branch);
		System.out.println("The student phone number is " +phno);
	}

}
