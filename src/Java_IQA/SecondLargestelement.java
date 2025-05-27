package Java_IQA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestelement {
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5};
		List<Integer> l = new ArrayList<Integer>();
		for(int num : a) {
			l.add(num);
			
		}
		Collections.reverse(l);
		System.out.println("The reversed list is"+l);
		System.out.println("The second largest number is"+l.get(1));
		
	}

}
