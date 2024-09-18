package b;

import a.A;

public class C extends A {
	
	public static void main(String[] args) {
		
		A objA = new A();
		System.out.println(objA.c);
		
		C objC = new C();
		System.out.println(objC.c);
		System.out.println(objC.d);
	}

}
