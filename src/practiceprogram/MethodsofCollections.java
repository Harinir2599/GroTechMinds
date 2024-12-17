package practiceprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MethodsofCollections {
	public static void main(String[] args) {
		List<String> c = new ArrayList<String>();
		c.add("Queen");
		c.add("King");
		c.add("Police");
		c.add("Thief");
		c.add("Thief");
		Collections.sort(c);//sorting
		System.out.println("the sorted Al->"+c);
		Collections.shuffle(c);//shuffle
		System.out.println("the shuffled AL->"+c);
		Collections.rotate(c, 2);
		System.out.println("The rotated AL->"+c);
		Collections.swap(c, 0, 2);
		System.out.println("The swapped AL->"+c);
		 List<String> c1 = new ArrayList<>(Collections.nCopies(c.size(), " "));
		Collections.copy(c1, c); // copying elements from one list to another
		System.out.println("Source list->"+c);
		System.out.println("Destination list->"+c1);
		Set<String> s = new HashSet<String>(c); //removes the duplicate 
		System.out.println(s);
		List<Integer> num = new ArrayList<Integer>();//binarysearch
		num.add(25);
		num.add(23);
		num.add(18);
		num.add(15);
		num.add(9);
		System.out.println(num);
		
		int checknum = 25; //check whether the number is present in Al
		for(int i = 0;i<num.size();i++) {
			if(num.contains(checknum)) {
				System.out.println("The number is present");
				break;
			}
			else {
				System.out.println("The number is absent");
				
			}
		}
		int index = Collections.binarySearch(num, 25); // to find the index of number
		System.out.println("The index of the given number is "+index);
		
		
		
	}

}
