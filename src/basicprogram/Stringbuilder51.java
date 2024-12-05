package basicprogram;

public class Stringbuilder51 {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Good Day ");
		System.out.println("Original String:"+s);
		s.append("Today");
		System.out.println("Appended String:"+s);
		s.insert(0, "Have a ");
		System.out.println("inserted string:"+s);
		s.replace(7, 11, "nice");
		System.out.println("replaced string:"+s);
		s.substring(3, 11);
		System.out.println("substring:"+s);
		s.delete(16, 21);
		System.out.println("deleted string:"+s);
		s.reverse();
		System.out.println("reversed string:"+s);
		System.out.println(s.capacity());
		System.out.println(s.charAt(7));
		System.out.println("Lenght of the string"+s.length());
		
	}

}
