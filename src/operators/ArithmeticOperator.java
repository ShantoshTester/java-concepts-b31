package operators;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		// this should be the preferred way of storing the result
		int sum = num1 + num2;
		System.out.println("sum of given numbers : "+sum);
		
		System.out.println("sum of given numbers : "+(num1 + num2));
		System.out.println("sub of given numbers : "+(num1 - num2));
		System.out.println("mul of given numbers : "+(num1 * num2));
		System.out.println("div of given numbers : "+(num1 / num2));
		System.out.println("mod of given numbers : "+(num1 % num2));
		
		String str = "Result";
		int num3 = 10;
		System.out.println(str+num3);

	}

}
