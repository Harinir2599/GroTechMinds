package basicprogram;

import java.util.Arrays;

public class ArrayString {
	public static void main(String[] args) {
		String s1 ="HAMSA";
		String s2 ="HAMSA";
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		System.out.println(Arrays.equals(c1, c2));
		
	}

}
