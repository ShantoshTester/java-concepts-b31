package stringclass;

public class StringSplit {

	public static void main(String[] args) {
		
		String language = "I know English Hindi Kannada Telugu Marati Tamil Malayalam Odia";
		
		String[] strArr = language.split(" ");
		
		for(String str : strArr)
		{
			System.out.print(str+" ");
		}

	}

}
