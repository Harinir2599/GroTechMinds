package practiceprogram;

import java.util.Date;

public class String_date_functions {
	public static void main(String[] args) {
		String str = "GroTechMinds";
		System.out.println(str.substring(4, 8));
		String str1 = "Hello";
		str1.concat("World");
		
		Date d1 =new Date();
		System.out.println(d1.getTime());//this will print the time in epoch
		
		Date d2 =new Date(d1.getTime());
		System.out.println(d2);//this will convert to our time
		String input = d2.toString();
	    // this print the nov
		String month = input.substring(4, 7);
		System.out.println(month);
		String date = input.substring(8,10);
		System.out.println(date);
		String year = input.substring(input.length()-4);
		System.out.println(year);
		String total = date.concat(month).concat(year);
		System.out.println(total);//this will print the whole date month and year
		
	 
	System.out.println(d2.before(d1));
	}

}
