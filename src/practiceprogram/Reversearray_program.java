package practiceprogram;

import java.util.Arrays;

public class Reversearray_program {
public static void main(String[] args) {
	int a[] = {1,2,3,4,5};
	int rev[] = new int[a.length];
	for(int i =a.length-1;i>=0;i--) {
		rev[i] = rev[i]+a[i];
		System.out.println(rev[i]);
	}
	
}
}
