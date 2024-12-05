package basicprogram;

public class StringBuffer_42 {
public static void main(String[] args) {
	StringBuffer name = new StringBuffer("Hello World");
	name.append(" How are You");
	System.out.println(name);
	name.insert(7, "Java");
	System.out.println(name);
	name.delete(2,6);
	System.out.println(name);
	name.reverse();
	System.out.println(name);
}
}
