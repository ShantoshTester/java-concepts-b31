package collection.listdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {

	public static void main(String[] args) {
		
		// Generic in collection is used to prevent type safety for an object
		List<String> al = new ArrayList<String>();
	
		al.add("Java");
		al.add("Java");
		al.add("Selenium");
		al.add("H2K");
		al.add("Java");
		al.add("Functional Testing");
		al.add("Java");
		al.add("Java");
		
		System.out.println("*************************************");
		
		for (Object object : al) {
			System.out.println(object);
			
		}

	}

}
