package basicprogram;

public class finally_program72 {
public static void main(String[] args) {
	try {
		int num = 0;
		int a = 10/num;
		System.out.println(a);
	}
		
		catch(ArithmeticException e) {
			System.out.println("Enter the number except 0");
		}
	finally {
		System.out.println("Try with someother number");
	}
	
}
}

