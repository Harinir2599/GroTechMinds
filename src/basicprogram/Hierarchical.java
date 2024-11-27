package basicprogram;

public class Hierarchical {
	void login() {
		System.out.println("Login Successful");
	}

}
class Testcase1 extends Hierarchical{
	void Testcase1() {
		
		System.out.println("Successfully Testcase1 is completed");
	}
	public static void main(String[] args) {
		Testcase1 t1 = new Testcase1();
		t1.Testcase1();
		t1.login();
	}
}
class Testcase2 extends Hierarchical{
	void Testcase2() {
		System.out.println("Successfully Testcase2 is completed");
	}
	public static void main(String[] args) {
		Testcase2 t2 = new Testcase2();
		t2.Testcase2();
		t2.login();
	}
}
class Testcase3 extends Hierarchical{
	void Testcase3() {
		System.out.println("Successfully Testcase3 is completed");
	}
	public static void main(String[] args) {
		Testcase3 t3 = new Testcase3();
		t3.Testcase3();
		t3.login();
	}
}

