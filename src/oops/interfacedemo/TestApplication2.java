package oops.interfacedemo;

public class TestApplication2 {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.launchBrowser();
		driver.maximiseBrowser();
		driver.navigateTo("https://www.google.com/");
		driver.sendKeys("Selenium By Shantosh");
		driver.click();
		driver.select();
		driver.getPageTitle();
		driver.close();
		System.out.println("************************************");
		
		driver = new FirefoxDriver();
		driver.launchBrowser();
		driver.maximiseBrowser();
		driver.navigateTo("https://www.gmail.com/");
		driver.sendKeys("shantosh25@hotmail.com");
		driver.click();
		driver.getPageTitle();
		driver.close();
		System.out.println("************************************");

	}

}
