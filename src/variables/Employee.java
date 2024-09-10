package variables;

public class Employee {
	
	// global variable with static keyword is known as static variable
	String empName;
	int empId;
	char empGen;
	static String empCompany = "IBM";
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.empName = "daniel";
		e1.empId = 100;
		e1.empGen = 'M';
		System.out.println("****** Details oF Employee E1 ******");
		System.out.println(e1.empName);
		System.out.println(e1.empId);
		System.out.println(e1.empGen);
		System.out.println(Employee.empCompany);
		System.out.println("====================================");
		
	}

}
