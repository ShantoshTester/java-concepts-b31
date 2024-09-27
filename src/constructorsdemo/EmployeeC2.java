package constructorsdemo;

public class EmployeeC2 {
	
	String empName;
	int empId;
	String empDept;
	int empAge;
	boolean isEmpActive;
	long empSal;
	char empGender;
	

	public EmployeeC2(String empName, boolean isEmpActive) {
		this.empName = empName;
		this.isEmpActive = isEmpActive;
	}

	public EmployeeC2(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}

	public EmployeeC2(String empName, int empId, String empDept, int empAge, boolean isEmpActive, long empSal,
			char empGender) {
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
		this.empAge = empAge;
		this.isEmpActive = isEmpActive;
		this.empSal = empSal;
		this.empGender = empGender;
	}

	public static void main(String[] args) 
	{
		EmployeeC2 e1 = new EmployeeC2("shantosh", 201,"QA", 35, true, 1566, 'M');
	}
	

}
