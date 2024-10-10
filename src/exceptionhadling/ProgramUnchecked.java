package exceptionhadling;

public class ProgramUnchecked {

	public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		int num1 = 10;
		int num2 = 0;
		
		try
		{
			int res = num1/num2;
			System.out.println(res);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Program Ended");

	}

}
