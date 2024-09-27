package methods;

public class Calculator {
	
	// In a class if there are more than one method with same name but different arguments is called as 
	// Method Overloading
	
	public void calSum(int n1, double n2) {
		double res = n1 + n2;
		System.out.println("sum of given numbers : " + res);
	}
	
	public void calSum(int n1, int n2, int n3) {
		int res = n1 + n2 + n3;
		System.out.println("sum of given numbers : " + res);
	}

	public void calSum(int num1, int num2) {
		int res = num1 + num2;
		System.out.println("sum of given numbers : " + res);
	}

	public void calSub(int num1, int num2) {
		int res = num1 - num2;
		System.out.println("dif of given numbers : " + res);
	}

	public void calMul(int num1, int num2) {
		int res = num1 * num2;
		System.out.println("mul of given numbers : " + res);
	}

	public void calDiv(int num1, int num2) {
		int res = num1 / num2;
		System.out.println("div of given numbers : " + res);
	}

}
