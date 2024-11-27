package basicprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayprogram3 
{
public static void main(String[] args) 
{
	int rollno[]=new int[3];
	int rollno1[]=new int[3];
	Scanner s1=new Scanner(System.in);
	System.out.println("Please enter the value of rollno and rollno1");
			for(int i=0;i<=2;i++)
			{
			rollno[i]	=s1.nextInt();
			rollno1[i]	=	s1.nextInt();
			}
					
System.out.println(Arrays.toString(rollno));
System.out.println(Arrays.toString(rollno1));

	boolean answer=	Arrays.equals(rollno, rollno1);
	if(answer==true)
	{
		System.out.println("The 2 arrays are equals");
	}
	else
	{
		System.out.println("The 2 arrays are NOT equals");

	}
}
}
