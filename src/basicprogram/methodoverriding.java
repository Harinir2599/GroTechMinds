package basicprogram;

class methodoverriding {
	void login() { //should be always non static
		
		System.out.println("Login with mobile no");
		
	}

}
class childclass extends methodoverriding{
	void login() {
		super.login(); // only because of this super keyword both the o/p is printed
		System.out.println("Login with emailid");
	}
	public static void main(String[] args) {
		childclass a1 = new childclass();
		a1.login();
		
		
	}
}
