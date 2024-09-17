package forloops;

public class SumOfNumbers {

	public static void main(String[] args) {
		// Print the sum of first 5 numbers = 1+2+3+4+5 = 15
		
		int res = 0;
		
		for(int i=1; i<=5; i++)
		{
			res = res + i;
		}
		System.out.println("sum of 5 numbers : "+res);

	}

}
