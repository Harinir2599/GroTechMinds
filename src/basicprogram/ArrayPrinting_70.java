package basicprogram;

import java.util.Arrays;

public class ArrayPrinting_70 {
	public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Using For Loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Using For-each Loop:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Using Arrays.toString() method:");
        System.out.println(Arrays.toString(numbers));
    }

}
