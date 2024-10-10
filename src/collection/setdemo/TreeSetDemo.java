package collection.setdemo;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<String> sObj = new TreeSet<String>();
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
		
		ArrayList<String> alSet = new ArrayList<String>(sObj);
		System.out.println(alSet);
		System.out.println(alSet.get(0));

	}

}
