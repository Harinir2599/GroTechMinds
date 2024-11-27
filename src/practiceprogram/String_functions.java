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
	boolean b1 = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
	System.out.println(b1);
	

	
	}
}
