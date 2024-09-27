package methods;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.calSum(10, 90);
		cal.calSub(110, 10);
		cal.calMul(10, 10);
		cal.calDiv(1000, 10);
		cal.calSum(40, 50, 10);
		cal.calSum(10, 1.5);
		
		System.out.println("*****************************");
		
		Calci calci = new Calci();
		int res = calci.calAddition(10, 40);
		System.out.println(res);
		System.out.println("sum of given numbers : "+calci.calAddition(10, 10));

	}

}
