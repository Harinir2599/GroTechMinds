package basicprogram;

public class Assignment34 {
	public static void main(String[] args) {
		String s1 = "myJava";
		System.out.println(s1.matches("[a-zA-Z]{6}"));
		System.out.println(s1.matches("m.*"));
		System.out.println(s1.matches(".*y"));
		
	}

}
