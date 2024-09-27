package constructorsdemo;

public class EmployeeC {
	
	String empName;
	int empId;
	String empDept;
	int empAge;
	boolean isEmpActive;
	long empSal;
	char empGender;
	
	// Can a constructor be overloaded? === YES
	
	public EmployeeC(String eName,int empId)
	{
		this.empName = eName;
		this.empId  = empId;
		System.out.println("========= Details of Employee ==========");
		System.out.println(eName+ " "+empId);
	}
	
	public EmployeeC(String eName,int empId,String empDept,int empAge,boolean isEmpActive,long empSal,char empGender)
	{
		this.empName = eName;
		this.empId  = empId;
		this.empDept = empDept;
		this.empAge = empAge;
		this.isEmpActive = isEmpActive;
		this.empSal = empSal;
		this.empGender = empGender;
		System.out.println("========= Details of Employee ==========");
		System.out.println(eName+ " "+empId+" "+empDept+" "+empAge+" "+isEmpActive+" "+empSal+" "+empGender);
	}
	
	public static void main(String[] args) 
	{
		EmployeeC e1 = new EmployeeC("shantosh", 201,"QA", 35, true, 1566, 'M');
		EmployeeC e2 = new EmployeeC("shruthi", 202,"Dev", 33, true, 1567, 'F');
		
		EmployeeC e3 = new EmployeeC("pallavi", 204);
	}
	

}
