package basicprogram;

import java.util.Arrays;

public class String_functions {
	public static void main(String[] args) {
		String a = "I Love MySelf";
		
		  char r; System.out.println(a.length()); 
		  System.out.println(a.toUpperCase());
		  System.out.println(a.toLowerCase()); 
		  System.out.println(a.trim()); 
		  String reverse = ""; 
		  for (int i =a.length()-1;i>=0;i--) { 
			  r = a.charAt(i); 
			  reverse = reverse+r;
		  
		  } 
		  System.out.println(reverse);
		 if(a.equals(reverse)) {
			System.out.println("it is a palindrome");
		 }
		 else {
			 System.out.println("it is not a palindrome");
		 }
		
	}
	

}
