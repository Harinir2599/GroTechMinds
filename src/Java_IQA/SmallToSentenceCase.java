package Java_IQA;

import java.util.Arrays;

public class SmallToSentenceCase {
    public static void main(String[] args) {
        String input = "i love programming";
        
        char[] c1 = input.toCharArray();
        
        // Convert the first character and any character after a space to uppercase
        for (int i = 0; i < c1.length; i++) {
            if (i == 0 || c1[i - 1] == ' ') { 
                c1[i] = Character.toTitleCase(c1[i]);
            }
        }
        
        // Convert char array back to string
        String result = new String(c1);
        System.out.println(result);  // Output: I Love Programming
    }
}
