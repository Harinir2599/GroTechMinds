package practiceprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tryitout {
	public static void main(String[] args) {
		int arr[] = {2,3,5,6,8};
		
		  
		  int rev[] = new int[arr.length]; 
		  for(int i=arr.length-1;i>=0;i--) { 
			  rev[i] =rev[i]+arr[i]; 
			  System.out.println(rev[i]);
		  
		  } 
System.out.println(Arrays.toString(rev));
		 
	}

}
