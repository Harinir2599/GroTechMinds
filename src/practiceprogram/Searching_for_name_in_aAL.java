package practiceprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Searching_for_name_in_aAL {
	public static void main(String[] args) {
		String find = "Srihari";
		List<String> names = new ArrayList<String>();
		names.add("Harini");
		names.add("Krishna");
		names.add("Bhuvana");
		names.add("Srihari");
		names.add("Akkshayaa");
		names.add("Seetharaman");
		names.add("Arun");
		System.out.println(names);
		if(names.contains(find)) {
			System.out.println("The name is present in the list");
		}
		else {
			System.out.println("The name is not present in the list");
		}
	}
	
}
