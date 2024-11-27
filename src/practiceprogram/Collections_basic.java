package practiceprogram;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections_basic {
    public static void main(String[] args) {
    	                                                                                                                                               
		
		  Map<String, Integer> m1 = new HashMap<String, Integer>();
		  m1.put("Harini",25); 
		  m1.put("ShreePreethi", 27); 
		  m1.put("Hamsa", 26);
		  m1.put("Nagarajan",30); 
		  m1.put("Krishna", 32);
		  System.out.println(m1);
		  
		  Map<String, Integer> m2 = new HashMap<String, Integer>();
		  m2.putAll(m1);
		  m2.put("Ravi", 62);
		  m2.put("Bhavani", 54);      
		  m2.remove("Krishna");
		  System.out.println(m2);
		  System.out.println(m2.keySet());
		  System.out.println(m2.values());
		  
		  for(String s1 : m2.keySet()) {
			  System.out.println(s1);
		  }
		  for (Integer i1 : m2.values()) {
			  System.out.println(i1);
		  }
		  for(Map.Entry<String, Integer> e1 : m2.entrySet()) {
			  System.out.println(e1);
			  
		  }
		  Set<Map.Entry<String, Integer>> se1 = m2.entrySet();
		  Iterator<Map.Entry<String, Integer>> i = se1.iterator();	
		  while(i.hasNext()) {
			  System.out.println(i.next());
		  }
    	    }
}
