//In a given string find out the no of alphabets,number,whitespace and special character
package basicprogram;

import java.util.Arrays;

public class Arrayproblem {
	public static void main(String[] args) {
		int count_aplhabet=0;
		int count_digit=0;
		int count_space=0;
		String input ="Harini@ 2599";
		
		char[] c = input.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<c.length;i++) {
			boolean b1 = Character.isAlphabetic(c[i]);
			if(b1==true) {
				count_aplhabet++;
			}
			boolean b2=Character.isDigit(c[i]);
			if(b2==true) {
				count_digit++;
			}
			@SuppressWarnings("deprecation")
			boolean b3 = Character.isSpace(c[i]);
			if(b3==true) {
				count_space++;
			}
		}
		System.out.println("The count of alphabets->"+count_aplhabet);
		System.out.println("The count of digit->"+count_digit);
		System.out.println("The count of space->"+count_space);
		int specialchar =0;
		int t =c.length;
		specialchar = t-(count_aplhabet+count_digit+count_space);
		System.out.println("The count of specialcharacter->"+specialchar);
	}
}
