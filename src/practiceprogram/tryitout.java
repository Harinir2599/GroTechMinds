package practiceprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class tryitout {
	public static void main(String[] args) {
		int arr[] = {2,3,5,6,8};
		
		  
		  int rev[] = new int[arr.length]; 
		  for(int i=arr.length-1;i>=0;i--) { 
			  rev[i] =rev[i]+arr[i]; 
			  System.out.print(rev[i]);
			  
		  
		  } 
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the size");
		  int size = sc.nextInt();
		  System.out.println("enter the elements");
		  int[] arr1= new int[size];
		  for(int i=0;i<size;i++) {
			  arr1[i]=sc.nextInt();
		  }
		  for(int i=0;i<size;i++) {
			 System.out.println(arr1[i]);
		  }
		  
		 
        
		 
	}

}
