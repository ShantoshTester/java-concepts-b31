package arraysdemo;

public class CharArray {

	public static void main(String[] args) {
		
		char vowels[] = {'a','e','i','o','u'};
		
		System.out.println("size of char array : "+vowels.length);
		
		for(char ch:vowels)
		{
			System.out.print(ch+" ");
		}
		
		System.out.println();
		System.out.println("**********************");
		
		String str[] = {"apple","orange","bananna","grapes","mango"};
		
		System.out.println("size of string array : "+str.length);
		
		for(String fruits:str)
		{
			System.out.print(fruits+" ");
		}

	}

}
