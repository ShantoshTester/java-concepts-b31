package constructorsdemo;

public class Employee {
	
	String empName;
	int empId;
	String empDept;
	int empAge;
	boolean isEmpActive;
	long empSal;
	char empGender;
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.empName = "Sarah";
		e1.empId = 1001;
		e1.empDept = "HR";
		e1.empAge = 30;
		e1.isEmpActive = true;
		e1.empSal = 5559;
		e1.empGender = 'F';
		System.out.println("************ Details of Employee E1 **************");
		System.out.println(e1.empName+ " " + e1.empId+ " "+e1.empDept+" "+e1.empSal
				+ " " + e1.empAge+ " "+e1.isEmpActive+" "+e1.empGender);
		System.out.println();
		
		Employee e2 = new Employee();
		e2.empName = "Mara";
		e2.empDept = "Sales";
		e2.empAge = 38;
		e2.isEmpActive = true;
		e2.empSal = 9251;
		e2.empGender = 'M';
		System.out.println("************ Details of Employee E2 **************");
		System.out.println(e2.empName+ " " + e2.empId+ " "+e2.empDept+" "+e2.empSal
				+ " " + e2.empAge+ " "+e2.isEmpActive+" "+e2.empGender);
		System.out.println();
	}
	

}
