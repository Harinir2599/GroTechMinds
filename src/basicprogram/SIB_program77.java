package basicprogram;

public class SIB_program77 {
	static {
		System.out.println("Static block1");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	public static void main(String[] args) {
		System.out.println("main");
		SIB_program77 s = new SIB_program77();
		SIB_program77 s1 = new SIB_program77();
		
	}

}
