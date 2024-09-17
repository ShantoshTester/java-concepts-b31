package forloops;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		// Program to print only even numbers between 50 to 100
		
		for(int i=50; i<=100; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}		
		}
	}

}
