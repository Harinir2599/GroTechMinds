package basicprogram;

public class Throwthrows52 {
public static void checkage(int age) throws ArithmeticException {
	if(age <18) {
		throw new ArithmeticException("Access denied");
		
		
	}
	else {
		System.out.println("Access granted");
	}
	
}
public static void main(String[] args) {
	checkage(5);


	
}
}
