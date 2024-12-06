package basicprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collections_sorting39 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("Java");
		c.add("Python");
		c.add("Perl");
		c.add("Jenkins");
		System.out.println(c);
	
		List<String> s = new ArrayList<String>(c);
		Collections.sort(s);
		System.out.println("The sorted List->"+s);
	}

}
