package practiceprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	public static void main(String[] args) {
		List<String> animal = new ArrayList<String>();
		animal.add("Dog");
		animal.add("Cat");
		animal.add("Deer");
		animal.add("Peacock");
		animal.add("Manish");
		animal.add("Kumar");
		animal.add("Tiwari");
		Collections.reverse(animal); // reversed the list
		System.out.println(animal);
		List<String> reversedanimal = new ArrayList<String>();
		for(String name : animal) { 
			StringBuffer rev = new StringBuffer(name); // reversed each animal within the list
			rev.reverse();
			reversedanimal.add(rev.toString());
			
		}
System.out.println(reversedanimal);
	}

}
