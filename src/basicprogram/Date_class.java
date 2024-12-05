package basicprogram;

import java.util.Date;

public class Date_class {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		String str = d2.toString();
		String sub_str=str.substring(0,10);
		System.out.println(sub_str);
		
		
	}

}
