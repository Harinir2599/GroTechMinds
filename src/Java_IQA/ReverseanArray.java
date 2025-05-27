package Java_IQA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseanArray {
	static Integer num;
	public static void main(String[] args) {
	
		
		int a[] = {1,2,3,4,5};
		int rev[] = new int[a.length];
		/*
		 * for(int i = a.length-1;i>=0;i--) { rev[i] = rev[i]+a[i];
		 * System.out.println(rev[i]);
		 * 
		 * }
		 */
		for(int i = a.length-1,j=0;i>=0;i--,j++) {
			
				rev[j]=a[i];
			
			
		}
		System.out.println(Arrays.toString(rev));
		
	}

}
