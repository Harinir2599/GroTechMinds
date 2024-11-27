package practiceprogram;
import java.util.Iterator;
import java.util.Stack;
public class Stack_problem {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
	Iterator i =s.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	s.pop();
	System.out.println(s);
	s.peek();
	System.out.println(s);
	}

}
