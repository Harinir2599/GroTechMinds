package basicprogram;

import java.util.Vector;

public class Vectorclass {
	public static void main(String[] args) {
		 Vector<String> vector = new Vector<>();
		 vector.addElement("Apple");
		 vector.addElement("Banana");
		 vector.addElement("Kiwi");
		 vector.addElement("Muskmelon");
		 System.out.println(vector);
		 String first = vector.firstElement();
		 System.out.println(first);
		 String last=vector.lastElement();
		 System.out.println(last);
		 vector.removeElement("Kiwi");
		 System.out.println(vector);
		 vector.removeElementAt(1);
		 System.out.println(vector);
		 int capacity=vector.capacity();
		 System.out.println(capacity);
		 vector.removeAllElements();
		 System.out.println(vector);
	}

}
