package basicprogram;

import java.util.HashMap;
import java.util.Map;

public class map_program57 {
	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<String,Integer>();
		m.put("Harini",25);
		m.put("Preethi",27);
		m.put("Nagarajan",30);
		m.put("Hamsa",26);
		System.out.println(m);
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		m1.putAll(m);
		System.out.println(m1);
		if(m1.equals(m)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		m1.remove("Harini");
		System.out.println(m1);
		m1.replace("Preethi", 28);
		System.out.println(m1);
		m1.putIfAbsent("Harini", 25);
		System.out.println(m1);
	    System.out.println(m1.containsKey("Hamsa"));
	    System.out.println(m1.containsValue("25"));
		for(String s:m1.keySet()) {
			System.out.println(s);
		}
		for(int i:m1.values()) {
			System.out.println(i);
		}
		for(Map.Entry<String, Integer> e :m1.entrySet()) {
			System.out.println(e);
			
		}
	}

}
