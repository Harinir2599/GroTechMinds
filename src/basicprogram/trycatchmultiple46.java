package basicprogram;

import java.util.Scanner;

public class trycatchmultiple46 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
    try {

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int result = 100 / number;
        System.out.println("Result " + result);
    } 
    catch (ArithmeticException e) {
        System.out.println("Division by zero is not allowed.");
    }

	catch (Exception e) {
        
        System.out.println("Invalid input. Please enter a valid integer.");
}
    finally {
    	System.out.println("Harini");
    }
}
}
