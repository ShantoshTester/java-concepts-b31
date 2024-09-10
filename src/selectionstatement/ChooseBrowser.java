package selectionstatement;

public class ChooseBrowser {

	public static void main(String[] args) {
		
		String browser = "ie";
		
		if(browser=="chrome")
		{
			System.out.println("Test the application in Chrome browser");
		}
		else if(browser=="firefox")
		{
			System.out.println("Test the application in Firefox browser");
		}
		else if(browser=="edge")
		{
			System.out.println("Test the application in Edge browser");
		}
		else
		{
			System.out.println("Unsupported Browser");
		}

	}

}
