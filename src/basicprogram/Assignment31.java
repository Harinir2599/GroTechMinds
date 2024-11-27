package basicprogram;

import java.util.Arrays;

public class Assignment31 {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		if(Arrays.equals(c1, c2)) {
			System.out.println("The Strings are anagram");
		}
		else {
			System.out.println("The Strings are not anagram");
		}
		
	}

}
