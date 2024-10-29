package basicprogram;

public class assignment4 {
	public static void main(String[] args) {
		int mark = 83;
		
		if(mark >= 90)
		{
			System.out.println("Student has acquired A+ grade");
		}
		else if(mark >= 80 && mark <= 90)
		{
			System.out.println("Student has acquired A grade");	
		}
		else if(mark >= 70 && mark <= 80)
		{
			System.out.println("Student has acquired B grade");
		}
		else if(mark >= 60 && mark <= 70)
		{
			System.out.println("Student has acquired C grade");
		}
		else if(mark >= 50 && mark <= 60)
		{
			System.out.println("Student has acquired D grade");
		}
		else
			System.out.println("FAIL");
		
	}

}
