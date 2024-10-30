package basicprogram;

public class Addition_overloading {
	public static void Addition_overloading(int a,double b) {
		double sum = 0;
		sum = a + b;
		System.out.println("The sum is " + sum);
		
	}
	public static void Addition_overloading(int a,int b,int c) {
		float sum = 0;
		sum = a + b +c;
		System.out.println("The sum is " + sum);
		
	}
	public static void Addition_overloading(String a,String b) {
		String sum = "0";
		sum = a + b;
		System.out.println("The sum is " + sum);
		
	}
	public static void main(String[] args) {
		Addition_overloading(10,3.14);
		Addition_overloading(25,23,143);
		Addition_overloading(18,23.5);
		
	}

}
