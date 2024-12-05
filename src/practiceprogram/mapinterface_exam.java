package practiceprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class mapinterface_exam {
public static void main(String[] args) {
	Map<String,Integer> m = new HashMap<String,Integer>();
	m.put("Harini", 25);
	m.put("hamsa", 26);
	m.put("Nagarajan", 30);
	System.out.println(m);
	for(String s : m.keySet())
	{
		System.out.println(s);
	}
	for(Integer i : m.values())
	{
		System.out.println(i);
	}
	for(Map.Entry<String, Integer> e : m.entrySet())
	{
		System.out.println(e);
	}
	
	List<String> l = new ArrayList<String>();
	l.add("harini");
	l.add("hamsa");
	l.add("nagarajan");
	l.add("preethi");
	ListIterator<String> i = l.listIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		
	}
	while(i.hasPrevious()) {
		System.out.println(i.previous());
		
	}
	
	Iterator<String> il = l.iterator();
	while(il.hasNext()) {
		System.out.println(il.next());
		
	}
	List<String> l1 = new ArrayList<String>();
	l.add("harini");
	l.add("hamsa");
	l.add("nagarajan");
	l.add("preethi");
	String name = "Harini";
	if(l.contains(name)) {
		System.out.println("The name is present");
	}
}
}
