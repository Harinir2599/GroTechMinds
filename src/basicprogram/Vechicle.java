package basicprogram;

public class Vechicle {
	Vechicle(){
		System.out.println("Vechicle");
	}

}
class Car extends Vechicle{
	Car(){
		super(); //super calling statement
		System.out.println("Car");
	}
	public static void main(String[] args) {
		new Car();
		
	}
}