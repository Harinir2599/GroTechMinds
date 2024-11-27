//
package basicprogram;

import java.util.Arrays;

public class ArrayProgarm_salary {
public static void main(String[] args) {
		int Salary[] = {25000,50000,40000,70000,35000};
		System.out.println(Arrays.toString(Salary));
		int sum = 0;
		for(int i=0;i<Salary.length;i++) {
			sum = sum + Salary[i];
			
		}
		System.out.println("The total salary of the employee are->"+sum);
		int avg = 0;
		avg = sum/(Salary.length);
		System.out.println("The average salary is ->"+avg);
	}
}
