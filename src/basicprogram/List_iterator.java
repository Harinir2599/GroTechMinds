package basicprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_iterator {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Dog");
		l.add("Cat");
		l.add("Lion");
		l.add("Tiger");
		l.add("Cow");
		System.out.println(l);
		Iterator<String> i = l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		ListIterator li = l.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
			
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
