package collection.setdemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> sObj = new HashSet<String>();
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
