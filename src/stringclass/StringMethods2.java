package stringclass;

public class StringMethods2 {

	public static void main(String[] args) {
		
		String customer = "Rajesh";
		
		// charAt(index) - this method returns you the character present at the given index
		
		char charAt = customer.charAt(0);
		System.out.println(charAt);
		
		// replace(oldchar, newchar) - this method used to replace the old char with the new char
		System.out.println(customer.replace('R', 'r'));
		
		// replaceAll(regex, replacement) - this method will replace certain amount of characters with different characters
		String ifscCode = "ICICI0020";
		System.out.println(ifscCode.replaceAll("ICICI", ""));
		System.out.println(customer.replaceAll("Raj", "Magh"));
		
		// concat(str) - this method will add one string to another string just like +
		System.out.println(customer.concat(ifscCode));
		
		

	}

}
