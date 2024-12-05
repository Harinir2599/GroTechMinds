package basicprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverselist48 {
public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("Manish");
		a.add("Kumar");
		a.add("Tiwari");
		Collections.reverse(a); // reversed the list
		System.out.println(a);
		List<String> reversed = new ArrayList<String>();
		for(String name : a) { 
			StringBuffer rev = new StringBuffer(name); // reversed each name within the list
			rev.reverse();
			reversed.add(rev.toString());
			
		}
	System.out.println(reversed);
	}

	}
	

