package basicprogram;

import java.util.Arrays;

public class Arrayprogarm4 {
public static void main(String[] args) {
	int count_alpha=0;
	int count_digit=0;
	int count_space=0;
	int count_alpha1=0;
	int count_digit1=0;
	int count_space1=0;
	String s1 = "kv no 2 bangalore";
	String s2 = "karnataka";
	char c1[] = s1.toCharArray();	
	char c2[] = s2.toCharArray();
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
	for(int i =0;i<c1.length;i++) {
		boolean b1 = Character.isAlphabetic(c1[i]);
		if (b1==true) {
			count_alpha++;
		}
		boolean b2 = Character.isDigit(c1[i]);
		if(b2==true) {
			count_digit++;
		}
		boolean b3 = Character.isSpaceChar(c1[i]);
		if(b3==true) {
			count_space++;
		}
		
	}
	System.out.println("The no of alphabets in string 1 is->"+count_alpha);
	System.out.println("The no of alphabets in string 1 is->"+count_digit);
	System.out.println("The no of alphabets in string 1 is->"+count_space);
	
	for(int i =0;i<c2.length;i++) {
		boolean bs1 = Character.isAlphabetic(c2[i]);
		if (bs1==true) {
			count_alpha1++;
		}
		boolean bs2 = Character.isDigit(c2[i]);
		if(bs2==true) {
			count_digit1++;
		}
		boolean bs3 = Character.isSpaceChar(c2[i]);
		if(bs3==true) {
			count_space1++;
		}
		
	}
	System.out.println("The no of alphabets in string 2 is->"+count_alpha1);
	System.out.println("The no of alphabets in string 2 is->"+count_digit1);
	System.out.println("The no of alphabets in string 2 is->"+count_space1);
	}	
}

