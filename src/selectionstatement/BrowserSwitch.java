package selectionstatement;

public class BrowserSwitch {

	public static void main(String[] args) {
		
		String browser = "edge";
		
		switch(browser)
		{
		case "chrome":
			System.out.println("used chrome browser for execution");
			break;
			
		case "firefox":
			System.out.println("used firefox browser for execution");
			break;
			
		case "edge":
			System.out.println("used edge browser for execution");
			break;
			
			default:
				System.out.println("please provide valid browser");
		}

	}

}
