package basicprogram;

abstract class Abstract_demo {
	
		abstract void login();
	}
class google extends Abstract_demo {
	
@Override
void login() {
			System.out.println("Login page successfully");
		}
		
public static void main(String[] args) {
	google g = new google();
	g.login();
			
		}
	}
	



