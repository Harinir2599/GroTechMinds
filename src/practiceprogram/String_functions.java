package practiceprogram;

public class String_functions {
public static void main(String[] args) {
	String s1 = "Harini";
	String s2 = "Hamsa";
	System.out.println(s1 == s2);
	System.out.println(s1.indexOf("n"));
	System.out.println(s1.substring(2));
	System.out.println(s1.substring(2,5));
	
	System.out.println(s1.charAt(3));
	System.out.println(s1.concat("Ravi"));
	
	System.out.println(s1.contains("ri"));
	
	String email = "hariniravi25.hr@gmail.com";
	
	String s = "Harini";
	String rev = "";
	for(int i =s.length()-1;i>=0;i--) {
		char r = s.charAt(i);
		rev=rev+r;
		
	}
	
	System.out.println(rev);
	if(s.equals(rev)) {
		
	}
	

	
	}
}
