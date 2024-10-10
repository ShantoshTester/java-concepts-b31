package collection.mapdemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapD {

	public static void main(String[] args) {
		
		Map<Integer, String> errorCode = new LinkedHashMap<>();
		// put(key,value) - to add the objects to the collection
		errorCode.put(301, "Moved Permanently");
		errorCode.put(200, "OK");
		errorCode.put(404, "Page Not Found");
		errorCode.put(102, "Processing");
		errorCode.put(100, "Continue");
		errorCode.put(500, "Internal Server Error");
		errorCode.put(404, "Page Not Found");
		errorCode.put(404, "Page Not Found");
		
		
		// printing all the values
		System.out.println(errorCode);

	}

}
