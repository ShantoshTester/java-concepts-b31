package collection.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> sObj = new LinkedHashSet<String>();
		sObj.add("apple");
		sObj.add("orange");
		sObj.add("bannana");
		sObj.add("apple");
		sObj.add("grapes");
		sObj.add("mango");
		sObj.add("pineapple");
		sObj.add("apple");
		sObj.add("apple");
		
		System.out.println(sObj);

	}

}
