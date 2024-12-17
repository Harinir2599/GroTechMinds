package practiceprogram;

public class Swap_program {
public static void main(String[] args) {
	int a = 10;
	int b = 15;
//	int temp = 0;
//	temp = b;
//	b =a;
//	a=temp;
//	System.out.println(a);
//	System.out.println(b);
	a = b+a;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
	
}
}
