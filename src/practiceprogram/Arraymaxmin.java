package practiceprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Arraymaxmin {
public static void main(String[] args) {
	Date d1 = new Date();
	Date d2 = new Date(d1.getTime());
	System.out.println(d2);
	String s = d2.toString();
	System.out.println(d2);
	String r="";
	r=s.replace(":", "");
	System.out.println(r);
	int a[] = {2,3,4,5,6};
	int min = a[0];
	int max = a[0];
	for(int i =1;i<a.length;i++) {
		if(a[i]>max) {
			max = a[i];
		}
	}
	System.out.println(max);
	}
		
	
}

