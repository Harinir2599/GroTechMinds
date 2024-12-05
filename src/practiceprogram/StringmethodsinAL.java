package practiceprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringmethodsinAL {
public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("Harini");
		name.add("Krishna");
		name.add("Bhuvana");
		name.add("Srihari");
		name.add("Akkshayaa");
		name.add("Seetharaman");
		name.add("Arun");
		List<String> uppername = new ArrayList<String>(); // to print it in a single line
		for(String word:name) {
			 uppername.add(word.toUpperCase());
			
		}
		
		System.out.println(uppername);
	}

}
