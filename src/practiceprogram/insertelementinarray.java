package practiceprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertelementinarray {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		List l = new ArrayList();
		for(int add:a) {
			l.add(add);//converting array to list
		}
		System.out.println(l);
		l.add(15);
		l.add(20);
		System.out.println(l);//inserting
		
		
	}

}
