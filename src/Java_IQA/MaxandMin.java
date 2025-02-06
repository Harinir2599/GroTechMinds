package Java_IQA;

import java.util.Scanner;

public class MaxandMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num =sc.nextInt();
		System.out.println("Enter the number one by one");
		int arr[]=new int[num];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int min = arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=min) {
				min = arr[i];
			}
		}
		System.out.println("the minimum number is"+min);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=max) {
				max=arr[i];
			}
			
		}
		System.out.println("the maximum number is"+max);
		
	}

}
