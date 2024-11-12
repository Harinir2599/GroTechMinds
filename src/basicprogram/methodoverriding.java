package basicprogram;

class methodoverriding {
	void login() { //should be always non static
		
		System.out.println("Login with mobile no");
		
	}

}
class childclass extends methodoverriding{
	void login() {
		//super.login();
		System.out.println("Login with emailid");
	}
	public static void main(String[] args) {
		childclass a1 = new childclass();
		a1.login();
		
		
	}
}
