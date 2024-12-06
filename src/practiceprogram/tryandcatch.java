package practiceprogram;

import java.util.Scanner;

public class tryandcatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		System.out.println("enter the string size of the array");
		int size1 = sc.nextInt();
		System.out.println("enter the numbers in array");
		int[] array = new int[size];
		
		String[] names = new String[size1];
		System.out.println("enter the names in array");
		for(int i =0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		for(int i =0;i<names.length;i++) {
			names[i]=sc.next();
		}
		for(int i =0;i<array.length;i++) {
			System.out.println("The array is"+array[i]);
		}
		
		for(int i =0;i<names.length;i++) {
			System.out.println("The array name is"+names[i]);
		}
		
	}

}
