package practiceprogram;

import java.util.HashMap;
import java.util.Map;

public class Map_program {
	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<String,Integer>();
		m.put("Harini",25);
		m.put("Ravi",25);
		m.put("Bhavani",25);
		m.put("Hamsa",25);
		for(Map.Entry<String, Integer> e:m.entrySet()) {
			System.out.println(e);
			
		}
		
	}
	
	

}
