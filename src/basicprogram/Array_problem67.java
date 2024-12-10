package basicprogram;

public class Array_problem67 {
	public static void main(String[] args) {
		int num[] = {15,6,8,9,10};
		int sum=0;
		for(int i=0;i<num.length;i++){
			sum = sum+num[i];
			
		}
		System.out.println("Sum of the array:"+sum);
		int avg =0;
		avg = sum/num.length;
		System.out.println("Average of the sum:"+avg);
	}

}
