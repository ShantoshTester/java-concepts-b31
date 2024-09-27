package stringclass;

public class StringMethods {

	public static void main(String[] args) {
		
		String str = " Hello World ";
		String password = "Pass@123";
		
		// length() - this method returns you the number of characters present in the given string
		int size = password.length();
		System.out.println("length of the given string : "+size);
		System.out.println(str.length());
		
		// trim() - this method removes trailing and preceding space from a given string
		System.out.println(str);
		System.out.println(str.trim());
		
		String name = "SHANTOSH";
		// toLowerCase() - this method converts the given string to lower case
		System.out.println(name.toLowerCase());
		System.out.println(str.toLowerCase());
		
		// toUpperCase() - this method converts the lower characters to upper characters from a given string
		System.out.println(password.toUpperCase());
		

	}

}
