package selectionstatement;

public class FindLargest {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 30;
		int num3 = 70;
		
		if(num1>num2 & num1>num3) 
		{
			System.out.println("num1 is greatest");
		}
		else if(num2>num3 & num2>num1)  
		{
			System.out.println("num2 is greatest");
		}
		else if(num3>num1 & num3>num2) 
		{
			System.out.println("num3 is greatest");
		} 

	}

}
