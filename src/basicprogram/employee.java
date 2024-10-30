package basicprogram;

public class employee {
	
	

	employee(String name,int id ,String company,String Designation,int salary){
		System.out.println("Employee name is " +name);
		System.out.println("Employee id is " +id);
		System.out.println("Employee company is " +company);
		System.out.println("Employee designation is " +Designation);
		System.out.println("Employee salary is " +salary);
		
	}
	public static void main(String[] args) {
		String name = "Harini";
		int id = 2;
		String company = "TCS";
		String Designation = "Functional Tester";
		int salary = 30000;
		employee a = new employee(name,id,company,Designation,salary);
		
		
	}
}
