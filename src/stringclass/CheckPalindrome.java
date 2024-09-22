package stringclass;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		String original = "mom";
		String reverse = ""; // malayalam 
		
		for(int i = original.length()-1; i>=0; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		
		System.out.println("original string : "+original);
		System.out.println("reversed string : "+reverse);
		
		if(original.equals(reverse))
		{
			System.out.println("Given String is a Palindrome");
		}
		else
		{
			System.out.println("Its Not a Palindrome");
		}
		
	}
}
