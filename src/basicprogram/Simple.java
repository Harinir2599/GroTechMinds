package basicprogram;


class Simple {
	    private int privateVar = 1;
	    protected int protectedVar = 2;
	    public int publicVar = 3;

	    public void display() {
	        System.out.println("Private Variable: " + privateVar);
	        System.out.println("Protected Variable: " + protectedVar);
	        System.out.println("Public Variable: " + publicVar);
	    }
	}

class Access {
	    public static void main(String[] args) {
	        Simple obj = new Simple();
	        obj.display();
	        System.out.println("Public Variable from main: " + obj.publicVar);

	       
	    }
	}


