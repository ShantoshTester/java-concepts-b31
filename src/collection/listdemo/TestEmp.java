package collection.listdemo;

import java.util.ArrayList;
import java.util.List;

public class TestEmp {

	public static void main(String[] args) {

		EmployeeC e1 = new EmployeeC("john", 1001, "QA");
		EmployeeC e2 = new EmployeeC("Jacob", 1002, "DevOps");
		EmployeeC e3 = new EmployeeC("Daniel", 1003, "HR");
		EmployeeC e4 = new EmployeeC("Shantosh", 1004, "Trainer");
		EmployeeC e5 = new EmployeeC("Mark", 1005, "Manager");
		
		List<EmployeeC> empAl = new ArrayList<EmployeeC>();
		empAl.add(e1);
		empAl.add(e2);
		empAl.add(e3);
		empAl.add(e4);
		empAl.add(e5);
		
		for (EmployeeC empDet : empAl) {
			System.out.println(empDet.empName+" : "+empDet.empId+" : "+empDet.empDept);
		}

	}

}
