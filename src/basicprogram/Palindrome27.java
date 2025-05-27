
package basicprogram;

public class Palindrome27 {
	public static void main(String[] args) {
		String dr1 = "rotator";
		String r = "";
		for(int i =dr1.length()-1;i>=0;i--) {
			char dr2=dr1.charAt(i);
		    r = r+dr2;
		   
		}
		 System.out.println(r);
		 if(dr1.equals(r)) {
			 System.out.println("The String is Palindrome");
		 }
		 else {
			 System.out.println("The string is not a palindrome");
		 }
		 String s1 ="Java";
		 String s2 = "java";
		 
		 boolean b1 = s1.equals(s2);
		 if(b1==true) {
			 System.out.println ("Both the string are equal");
			 
		 }
		 else {
			 System.out.println("Both the string are not equal");
		 }
		 String t = "   A very Good Morning!     ";
		 System.out.println("The trimmed text is ->"+t.trim());
		 
	}

}
