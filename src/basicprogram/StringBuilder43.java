package basicprogram;

public class StringBuilder43 {
public static void main(String[] args) {
	StringBuilder name = new StringBuilder("Hello World");
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
