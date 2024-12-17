package practiceprogram;

public class Encapsulation {
	private int a = 23;
	private String s ="Harini";
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
class Encap{
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setA(25);
		System.out.println(e.getA());
		e.setS("Harish");
		System.out.println(e.getS());
		
	}
	
}
