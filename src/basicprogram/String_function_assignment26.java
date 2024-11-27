package basicprogram;
import java.util.Arrays;
public class String_function_assignment26 {
	public static void main(String[] args) {
		String s1 ="Welcome India";//To find the index of the character
		char c1[] = s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		for (int i=0;i<s1.length();i++) {
			if(c1[i]=='c') {
				System.out.println("The index of c ->"+i);
			}
		}
		String str = "Programming"; //To find the character of the specified index
		char c2[]=str.toCharArray();
		System.out.println(Arrays.toString(c2));
		for(int i=0;i<str.length();i++) {
			if(i==4) {
				System.out.println("The character at index 4 is->"+c2[i]);
			}
		}
		String str1 ="Hello";//Concatenation of two strings
		String str2 ="World";
		String c = str1.concat(str2);
		System.out.println("The concatinated string is "+c);
		
		String name ="welcome to java programming language";//extract the substring from index 11
		String s = name.substring(11);
		System.out.println("The extraxcted string is "+s);
		
		String p1= "Programming is fun";//extract the substring from 0 to 11
		String p = p1.substring(0, 11);
		System.out.println("The extraxcted string is "+p);
		
	}

	

}
