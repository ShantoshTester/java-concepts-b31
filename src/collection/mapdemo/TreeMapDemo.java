package collection.mapdemo;


import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> errorCode = new TreeMap<>();
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
		
		System.out.println("******** getting only the keys using keyset method ***********");
		for (Integer codes : errorCode.keySet()) {
			System.out.println(codes);
		}
		
		System.out.println("***** getting key and value using entryset method *************");
		
		for(Entry<Integer, String> entry:errorCode.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

	}

}
