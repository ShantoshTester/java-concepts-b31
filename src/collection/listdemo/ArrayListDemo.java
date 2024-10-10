package collection.listdemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		// add() method from collection is used to add the objects into the collection
		al.add(10);
		al.add("Java");
		al.add("Selenium");
		al.add("H2K");
		al.add(10);
		al.add(20.33);
		al.add(false);
		al.add('a');
		al.add("sql injection virus");
		
		// size() method used to get the current size of the collection objects
		System.out.println("current size objects in the collection : "+al.size());
		
		al.add(10);
		al.add("Java");
		al.add("Selenium");
		al.add("H2K");
		al.add(10);
		al.add(20.33);
		al.add(false);
		
		System.out.println("current size objects in the collection : "+al.size());
		
		// get(index) method will retrieve the object based on index
		System.out.println(al.get(0));
		System.out.println(al.get(10));
		
		// remove() method will remove the object from the collection
		al.remove(13);
		
		System.out.println("current size objects in the collection : "+al.size());
		
		// print all the objects
		System.out.println(al);
		
		System.out.println("*************************************");
		
		for (Object object : al) {
			System.out.println(object);
			
		}

	}

}
