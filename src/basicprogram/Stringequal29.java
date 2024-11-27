package basicprogram;

import java.util.Arrays;

public class Stringequal29 {
	public static void main(String[] args) {
		String s1 = "kv no2 bangalore";
		String s2 = "karnataka";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		System.out.println(Arrays.equals(c1, c2));
	}

}
