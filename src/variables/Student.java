package variables;

public class Student {
	
	// global variables are object level variables
	String name;
	int id;
	char gender;
	boolean isActive;
	
	public static void main(String[] args) {
		
		// creating an object of Student class
		Student s1 = new Student();
		s1.name = "nancy";
		s1.id = 101;
		s1.gender = 'F';
		s1.isActive = true;
		System.out.println("***** Details of Student S1 *****");
		System.out.println(s1.name);
		System.out.println(s1.id);
		System.out.println(s1.gender);
		System.out.println(s1.isActive);
		System.out.println("===================================");
		
		Student s2 = new Student();
		s2.name = "priya";
		s2.id = 102;
		s2.gender = 'F';
		s2.isActive = true;
		System.out.println("***** Details of Student S2 *****");
		System.out.println(s2.name);
		System.out.println(s2.id);
		System.out.println(s2.gender);
		System.out.println(s2.isActive);
		System.out.println("===================================");
		
		Student s3 = new Student();
		s3.name = "shantosh";
		s3.id = 103;
		s3.gender = 'M';
		s3.isActive = false;
		System.out.println("***** Details of Student S3 *****");
		System.out.println(s3.name);
		System.out.println(s3.id);
		System.out.println(s3.gender);
		System.out.println(s3.isActive);
		System.out.println("===================================");
		
		
		
	}

}
