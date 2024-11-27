package basicprogram;

public class Assignment33 {
	public static void main(String[] args) {
		String input ="Hello! 123Bye 789";
		System.out.println(input.replaceAll("[0-9]", ""));
		System.out.println(input.replaceAll("[A-Z]", ""));
		System.out.println(input.replaceAll("[a-z]", ""));
		System.out.println(input.replace("e", "y"));
	}

}
