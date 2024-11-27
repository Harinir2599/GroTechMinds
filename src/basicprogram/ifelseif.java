package basicprogram;

public class ifelseif {
	public static void main(String[] args) {
		int age = 20;
		int weight = 50;

		if (age >= 18 && weight >= 55) {
			System.out.println("You are eligible to donate blood");
		} else if (age < 18 && weight >= 55) {
            System.out.println("You are not eligible to donate blood since age is < 18");
		} else if (age >= 18 && weight < 55) {
			System.out.println("You are not eligible to donate blood since weight is < 55");
		} else {
			System.out.println("You are not eligible to donate blood");
		}
	}
}
