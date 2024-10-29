package basicprogram;

public class assignment2 {
	static void train()
	{
		System.out.println("Train");
	}
	static void bus()
	{
		System.out.println("bus");
	}
	static void lorry()
	{
		System.out.println("lorry");
	}
	void bike()
	{
		System.out.println("bike");
	}
	void cycle()
	{
		System.out.println("cycle");
	}
	
	public static void main(String[] args) {
		train();
		bus();
		lorry();
		assignment2 a = new assignment2();
		a.bike();
		a.cycle();
	}

}
