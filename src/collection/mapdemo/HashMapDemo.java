package collection.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> errorCode = new HashMap<>();
		// put(key,value) - to add the objects to the collection
		errorCode.put(301, "Moved Permanently");
		errorCode.put(200, "OK");
		errorCode.put(404, "Page Not Found");
		errorCode.put(102, "Processing");
		errorCode.put(100, "Continue");
		errorCode.put(500, "Internal Server Error");
		errorCode.put(404, "Page Not Found");
		errorCode.put(404, "Page Not Found");
		
		// get(key) - used to retrieve the object value based on the key
		System.out.println(errorCode.get(404));
		
		// size() - get you the current object size in the collection
		System.out.println("size of the current objects : "+errorCode.size());
		
		// printing all the values
		System.out.println(errorCode);

	}

}
