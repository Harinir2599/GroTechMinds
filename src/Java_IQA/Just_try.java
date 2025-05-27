package Java_IQA;

import java.util.Arrays;

public class Just_try {
public static void main(String[] args) {
	int alpha =0;
	String s = "Harini@2599";
	char c1[] = s.toCharArray();
	System.out.println(Arrays.toString(c1));
	for(int i =0;i<s.length();i++) {
		boolean b1 = Character.isAlphabetic(c1[i]);
		if(b1==true) {
			alpha++;
		}
		
	}
	System.out.println(alpha);
	String name = "Harini";
	String rev = "";
	for (int i = name.length()-1;i>=0;i--) {
		char c=name.charAt(i);
		rev = rev+c;
	}
	System.out.println(rev);
}
}
