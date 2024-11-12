package basicprogram;

 class Single_inheritance16 {
	public static void add (int a,int b) {
		int sum = a+b;
		System.out.println("Sum:" +sum);		
	}
	public static void sub(int a , int b) {
		int sub = a -b ;
		System.out.println("Subtraction:" +sub);
	}

}
 class Child_class extends Single_inheritance16{
	public static void div(int a , int b) {
		int div = a /b;
		System.out.println("Division:" +div);
		
		
	}
	public static void mod(int a , int b) {
		int mod = a /b;
		System.out.println("Modulus:" +mod);
		
		
	}
	public static void main(String[] args) {
		add (5,10);
		sub(25,23);
		div(30,6);
		mod(44,9);
	}
}
