package basicprogram;

import java.util.Scanner;

public class User_methodoverriding {
	public void login(String username,String pass) {
		if(username.length() >= 7 && pass.length() >= 7) {
			System.out.println("User is logged in");
		}
		else {
			System.out.println("User is not logged in");
		}
		
	}

public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the username");
		String username=sc1.next();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the password");
		String pass=sc1.next();
		User_methodoverriding u = new User_methodoverriding();
		u.login(username, pass);
		
		
	
}	
	}
 class Admin extends User_methodoverriding {
	@Override
		public void login(String username,String pass) {
		super.login(username,pass);
			if(username.length() >= 8 && pass.length() >= 8) {
				System.out.println("Admin is logged in");
			}
			else {
				System.out.println("Admin is not logged in");
			}
			
		}

public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the username");
		String username=sc1.next();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the password");
		String pass=sc1.next();
		Admin admin = new Admin();
		admin.login(username,pass);
		
		
		
}	
	}
 class Teacher extends User_methodoverriding {
			public void login(String username,String pass) {
				if(username.length() >= 9 && pass.length() >= 9) {
					System.out.println("Teacher is logged in");
				}
				else {
					System.out.println("Teacher is not logged in");
				}
				
				
			}
			public static void main(String[] args) {
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter the username");
				String username=sc1.next();
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter the password");
				String pass=sc1.next();
				Teacher t = new Teacher();
				t.login(username,pass);
				
				
				
		}	
			}

 class Student extends User_methodoverriding {
				public void login(String username,String pass) {
					if(username.length() >= 10 && pass.length() >= 10) {
						System.out.println("Student is logged in");
					}
					else {
						System.out.println("Student is not logged in");
					}
						
				}


public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the username");
		String username=sc1.next();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the password");
		String pass=sc1.next();
		Student s = new Student();
		s.login(username, pass);
		
		
		
		
	}



}


