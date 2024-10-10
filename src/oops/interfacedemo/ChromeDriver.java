package oops.interfacedemo;

public class ChromeDriver implements WebDriver {
	
	public void chromeMenu() {
		System.out.println("Chrome Menu");
	}

	public void launchBrowser() {
		System.out.println("Chrome Browser Launched");
	}

	
	public void maximiseBrowser() {
		System.out.println("Maximised the Browser");
	}

	
	public void navigateTo(String url) {
		System.out.println("Navigated to the URL : "+url);
	}

	
	public void sendKeys(String text) {
		System.out.println("Entered the text : "+text);
	}

	
	public void click() {
		System.out.println("Performed Click Operation");
	}

	
	public void select() {
		System.out.println("Performed Select Operation");	
	}

	
	public void getPageTitle() {
		System.out.println("Performed GetPage Title");
	}


	public void close() {
		System.out.println("Closed the browser");
	}

}
