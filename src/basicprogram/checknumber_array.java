package basicprogram;

public class checknumber_array {
	public static void main(String[] args) {
		int a1[] = {35,67,89,34,90};
		int num = 34;
		for (int i =0;i<a1.length;i++) {
			if(num==a1[i]) {
				System.out.println("The number 34 is present");
				System.out.println("The index is "+i);
			}
		}
		
	}

}
