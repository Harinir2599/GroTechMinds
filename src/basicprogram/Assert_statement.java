package basicprogram;

import java.util.Scanner;

public class Assert_statement {
    public static void agecheck(int age) {
        try {
            assert (age >= 0 && age <= 65) : "Age must be between 0 and 65";
            System.out.println("Age is valid");
        } catch (AssertionError e) {
            System.out.println("AssertionError: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        agecheck(age);
    }
}
