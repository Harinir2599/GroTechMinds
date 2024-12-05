package basicprogram;

import java.util.ArrayList;
import java.util.List;

public class List_properties40 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("harini");
		l.add("Bhavani");
		l.add("Ravi");
		System.out.println(l);
		
		List l2 = new ArrayList();
		l2.addAll(l);
		l2.add("hamsa");
		l2.add("preethi");
		l2.add("nagarajan");
		System.out.println(l2);
	}

}
