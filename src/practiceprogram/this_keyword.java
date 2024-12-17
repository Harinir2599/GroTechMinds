package practiceprogram;
public class this_keyword {
	private int a = 10;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
class example{
	public static void main(String[] args) {
		this_keyword t =new this_keyword();
		t.setA(15);
		System.out.println(t.getA());
	}
	
}
