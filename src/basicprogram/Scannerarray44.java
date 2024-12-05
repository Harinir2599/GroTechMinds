package basicprogram;

import java.util.Scanner;

public class Scannerarray44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size= sc.nextInt();
		System.out.println("enter the numbers");
		int[] array = new int[size];
		for(int i=0;i<array.length;i++) {
			array[i]= sc.nextInt();
		}
		System.out.println("The array you entered is:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
	}

}
}