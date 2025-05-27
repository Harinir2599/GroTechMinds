package Java_IQA;

public class String_concept {
	public static void main(String[] args) {
		String a ="ABC";
		String b = new String("ABC");
		String c="ABC";
		if(a==b) {
			System.out.println("a=b");
		}
		else if(a.equals(b)) {
			System.out.println("a.equals(b)");
		}
		else if(a==c) {
			System.out.println("a==c");
		}
	}

}
