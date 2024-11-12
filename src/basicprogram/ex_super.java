package basicprogram;

public class ex_super {
	ex_super(){
		System.out.println("constructor 2");
	}

}
class child extends ex_super{
	child(){
		super();
		System.out.println("constructor 1");
	}
	public static void main(String[] args) {
		new child();
		
	}
}