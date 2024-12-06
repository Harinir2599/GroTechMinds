package basicprogram;

import java.util.Stack;

public class Stack_program {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("Bottle");
		s.push("Bluetooth");
		s.push("Mobilephone");
		System.out.println(s);
		String find = "Mobilephone";
		if(find.equals(s.peek())){
			System.out.println("The String is present"+s);
			
		}
		else {
			System.out.println("The String is not found");
		}
		
		s.pop();
		System.out.println(s);
		
		
	}

}
