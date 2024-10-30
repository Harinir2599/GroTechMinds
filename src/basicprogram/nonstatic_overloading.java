package basicprogram;

public class nonstatic_overloading {
	void nonstatic_overloading() {
		System.out.println("Perform multiplication,division and modulus");
	}
	int nonstatic_overloading(int a,int b,int c) {
		int mul = 0;
		mul = a * b * c;
		return mul;
	}
	double nonstatic_overloading(double a ,int b) {
		double div = 0;
		div = a / b;
		return div;
	}
	int nonstatic_overloading(int a,int b) {
		int mod = 0;
		mod = a%b;
		return mod;
		
	}
	public static void main(String[] args) {
		nonstatic_overloading s =new nonstatic_overloading();
		s.nonstatic_overloading();
		int mul=s.nonstatic_overloading(25, 18, 23);
		double div=s.nonstatic_overloading(54.5,5);
		int mod=s.nonstatic_overloading(13, 7);
		System.out.println("The answer is "+mul);
		System.out.println("The answer is "+div);
		System.out.println("The answer is "+mod);
		
	}

}
