package basicprogram;

import java.util.ArrayList;
import java.util.List;

public class Sumofallelements_62 {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	l.add(12);
	l.add(56);
	l.add(67);
	l.add(49);
	l.add(35);
	int sum = 0;
	for(int i :l) {
		sum = sum+i;
	}
	System.out.println("The sum of numbers in list:"+sum);
	
}
}
