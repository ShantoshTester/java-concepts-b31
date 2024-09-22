package stringclass;

public class StringMethods3 {

	public static void main(String[] args) {
		
		String str = "Java Programming";
		String user = "Hello Priya";
		
		// substring(begin index) - this method extracts the portion from a given string
		// substring(begin index, last index) - this method also extracts the portion from a given string 
		                    // here the begin index is inclusive and the last index is exclusive
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(0));
		System.out.println(str.substring(0, 4));
		
		// contains - this method checks if the content is present in the given string - gives the result in boolean
		System.out.println("string contains the portion : "+str.contains("Programming"));
		System.out.println("welcome text is present : "+user.contains("Welcome"));
		
		String actual = "ICICI0020";
		String expected = "icici0020";
		
		// equals method - this method is used to check if both strings exactly equal
		System.out.println("checking the string if they are equal : "+actual.equals(expected));
		
		// equalIgnoreCase
		System.out.println(actual.equalsIgnoreCase(expected));

	}

}
