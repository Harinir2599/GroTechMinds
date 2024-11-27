package basicprogram;

public class ex_variables {
	//global variables
	public  static int a=5;
	public  static double b=5.5; 
	
	// constructor
	  ex_variables(int r){
		  final double pi = 3.14;//final variable
		  double area;//local variable
		  area = pi*r*r;
		  System.out.println("Area=" +area);
			  
		  }
	  ex_variables(int a,double b){
		  
		  
		  double sum;
		  sum = a+b;
		  System.out.println("Sum=" +sum);
		  
		  
	  }
	  public static void main(String[] args) {
		  ex_variables a1 = new ex_variables(10);
		  ex_variables a2 = new ex_variables(ex_variables.a,ex_variables.b);
		 
		  
	  }
		
	}


