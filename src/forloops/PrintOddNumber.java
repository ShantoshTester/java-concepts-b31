package forloops;

public class PrintOddNumber {

	public static void main(String[] args) {
		// Print Odd numbers between 25 to 1

		for (int i = 25; i >= 1; i--) 
		{
			if (i % 2 == 1) 
			{
				System.out.println(i);
			}
		}

	}

}
