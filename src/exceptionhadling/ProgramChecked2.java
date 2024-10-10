package exceptionhadling;

public class ProgramChecked2 {

	public static void main(String[] args) {
		
		System.out.println("0 Executed");
		System.out.println("1 Executed");
		System.out.println("2 Executed");
		System.out.println("3 Executed");
		System.out.println("4 Executed");
		
		try 
		{
			Thread.sleep(4000);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally Block Executed");
		}
		
		System.out.println("5 Executed");
		System.out.println("6 Executed");
		System.out.println("7 Executed");
		System.out.println("8 Executed");
		System.out.println("9 Executed");

	}

}
