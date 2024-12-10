package basicprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collection_program55 {
	public static void main(String[] args) {
		List<String> c = new ArrayList<String>();
		c.add("Harini");
		c.add("Krishna");
		c.add("Bhuvana");
		c.add("Srihari");
		c.add("Bhavani");
		c.add("Ravi");
		System.out.println("List:"+c);
		Collections.sort(c);
		System.out.println("Sorted list:"+c);
		Collections.reverse(c);
		System.out.println("Reversed list:"+c);
		Collections.swap(c, 0, 3);
		System.out.println("Swapped list:"+c);
		Collections.shuffle(c);
		System.out.println("Shuffled list:"+c);
		Collections.rotate(c, 2);
		System.out.println("Rotated list:"+c);
		Collections.replaceAll(c, "Srihari", "Tejas");
		System.out.println("Replaced List:"+c);
		List<Integer> i = new ArrayList<Integer>();
		i.add(10);
		i.add(110);
		i.add(23);
		i.add(25);
		i.add(18);
		System.out.println(i);
		int min = Collections.min(i);
		System.out.println("The min num in list:"+min);
		int max = Collections.max(i);
		System.out.println("The max num in list:"+max);
		
		
		
		
	}

}
