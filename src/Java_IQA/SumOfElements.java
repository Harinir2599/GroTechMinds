package Java_IQA;

import java.util.Scanner;

public class SumOfElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int input =sc.nextInt();
		System.out.println("enter the numbers");
		int arr[]=new int[input];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//int a[] = {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("The sum is"+sum);
	}

}
