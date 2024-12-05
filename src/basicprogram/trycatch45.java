package basicprogram;

public class trycatch45 {
public static void main(String[] args) {
	try {
		int i =100 / 0;
		
	}
	catch(ArithmeticException a) {
		System.out.println("Provide some other number");
		
	}
}
}
