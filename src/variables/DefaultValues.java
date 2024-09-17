package variables;

public class DefaultValues {
	
	// these are global variables
	byte b;
	short s;
	int i;
	long l;
	double d;
	float f;
	char c;
	boolean flag;
	String str;

	public static void main(String[] args) {
		
		DefaultValues defaultValues = new DefaultValues();
		System.out.println("Default Value of byte = "+defaultValues.b);
		System.out.println("Default Value of short = "+defaultValues.s);
		System.out.println("Default Value of int = "+defaultValues.i);
		System.out.println("Default Value of long = "+defaultValues.l);
		System.out.println("Default Value of double = "+defaultValues.d);
		System.out.println("Default Value of float = "+defaultValues.f);
		System.out.println("Default Value of char = "+defaultValues.c);
		System.out.println("Default Value of boolean = "+defaultValues.flag);
		System.out.println("Default Value of String = "+defaultValues.str);

	}

}
