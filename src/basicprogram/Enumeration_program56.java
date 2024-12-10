package basicprogram;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_program56 {
public static void main(String[] args) {
	Vector<String> v = new Vector<>();
	v.addElement("Tiger");
	v.addElement("Cow");
	v.addElement("Lion");
	v.addElement("Ox");
	v.addElement("Peacock");
	System.out.println(v);
	Enumeration<String> e = v.elements();

	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
}
}
