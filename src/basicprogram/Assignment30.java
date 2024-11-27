package basicprogram;

import java.util.Arrays;

public class Assignment30 {
	public static void main(String[] args) {
		String s =" Hello!123@jAvA_ ";
		int count_alpha=0;
		int count_digit=0;
		int count_space=0;
		char c1[]=s.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i =0;i<s.length();i++) {
			boolean b1 = Character.isAlphabetic(c1[i]);
			boolean b2 = Character.isDigit(c1[i]);
			boolean b3 = Character.isSpaceChar(c1[i]);
			if(b1 == true) {
				count_alpha++;
			}
			if(b2 == true) {
				count_digit++;
			}
			if(b3 == true) {
				count_space++;
			}
		}
		int special_char  =0;
		special_char = s.length()-(count_alpha+count_digit+count_space);
		System.out.println("The no of alphabets in the given string is->"+count_alpha);
		System.out.println("The no of numeric in the given string is->"+count_digit);
		System.out.println("The no of spaces in the given string is->"+count_space);
		System.out.println("The no of special character in the given string is->"+special_char);
	}
	
	

}
