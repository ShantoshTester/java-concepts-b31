package forloops;

public class PrintFactorial {

	public static void main(String[] args) {
		// Program to print factorial of a given number
		// 5 = 1 * 2 * 3 * 4 * 5 = 120
		
		int fact = 1;
		
		for(int i=1; i<=5; i++)
		{
			fact = fact * i;
		}
		System.out.println("factorial of number 5 : "+fact);

	}

}
