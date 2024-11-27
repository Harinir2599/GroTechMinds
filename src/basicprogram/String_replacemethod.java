package basicprogram;

public class String_replacemethod {
	public static void main(String[] args) {
		String s1 ="kv no 2";
		String s2 = "Harini Ravi";
		System.out.println(s1.replaceAll("[0-9]", " "));
		System.out.println(s2.replaceAll("[A-Z]", ""));
		
	}

}
