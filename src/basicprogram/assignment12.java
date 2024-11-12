package basicprogram;

public class assignment12 {
	//global variables
	public  static int a=5;
	public  static double b=5.5; 
	
	// constructor
	  assignment12(int r){
		  final double pi = 3.14;//final variable
		  double area;//local variable
		  area = pi*r*r;
		  System.out.println("Area=" +area);
			  
		  }
	  assignment12(int a,double b){
		  
		  
		  double sum;
		  sum = a+b;
		  System.out.println("Sum=" +sum);
		  
		  
	  }
	  public static void main(String[] args) {
		  assignment12 a1 = new assignment12(10);
		  assignment12 a2 = new assignment12(assignment12.a,assignment12.b);
		 
		  
	  }
		
	}


