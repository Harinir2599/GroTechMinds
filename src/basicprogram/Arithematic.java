package basicprogram;

import java.util.Scanner;

public class Arithematic {
	static void add()
	{
		int a=5;
		int b=5;
		int c=a+b;
		System.out.println(c);
	}
	static void sub()
	{
		int a=15;
		int b=5;
		int c=a-b;
		System.out.println(c);
	}
	static void mul()
	{
		int a=5;
		int b=5;
		int c=a*b;
		System.out.println(c);
	}
	static void div()
	{
		int a=15;
		int b=5;
		int c=a/b;
		System.out.println(c);
	}
	static void mod()
	{
		int a=15;
		int b=4;
		int c=a%b;
		System.out.println(c);
	}


public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the nameh");
	String name = sc.next();
	System.out.println("The entered name  is"+name);
	
		add();
		sub();
		mul();
		div();
		mod();
		System.out.println("Hello World");
		
		
}
}
	
	


 