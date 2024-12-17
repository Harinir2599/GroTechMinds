package practiceprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Rotatearray_program {
public static void main(String[] args) {
	int a[] = {1,2,3,4,5};
	List<Integer> l = new ArrayList<Integer>();
	for(int arr :a) {
		l.add(arr);
	}
	System.out.println(l);
	Collections.reverse(l);
	System.out.println(l);
	Collections.rotate(l, 2);
	System.out.println(l);
	int num =Collections.frequency(l, 2);
	System.out.println(num);
	
}
}
