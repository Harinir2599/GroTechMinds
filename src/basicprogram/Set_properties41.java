package basicprogram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_properties41 {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(25);
		s.add(23);
		s.add(18);
		s.add(5);
		s.add(25);
		System.out.println(s);
		System.out.println(s.contains(23));
		System.out.println(s.remove(12));
		Iterator<Integer> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
