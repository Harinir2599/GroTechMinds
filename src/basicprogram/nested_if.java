package basicprogram;

public class nested_if {
	
		public static void main(String[] args) {
		int num = 25;

		if (num % 2 == 0) { // Check if the number is even
		System.out.print("Even ");
		if (num % 6 == 0) { // Check if the even number is divisible by 6
		System.out.println("and divisible by 6");
		} else {
		System.out.println("and not divisible by 6");
		}
		} else { // If the number is odd
		System.out.print("Odd ");
		if (num % 3 == 0) { // Check if the odd number is divisible by 3
		System.out.println("and divisible by 3");
		} else {
		System.out.println("and not divisible by 3");
		}
		}
		}
		}

