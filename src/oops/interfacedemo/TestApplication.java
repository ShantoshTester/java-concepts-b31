package oops.interfacedemo;

public class TestApplication {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.chromeMenu();
		driver.launchBrowser();
		driver.maximiseBrowser();
		driver.navigateTo("https://www.google.com/");
		driver.sendKeys("Selenium By Shantosh");
		driver.click();
		driver.select();
		driver.getPageTitle();
		driver.close();
		System.out.println("************************************");
		
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.fireFoxMenu();
		driver1.launchBrowser();
		driver1.maximiseBrowser();
		driver1.navigateTo("https://www.gmail.com/");
		driver1.sendKeys("shantosh25@hotmail.com");
		driver1.click();
		driver1.getPageTitle();
		driver1.close();
		System.out.println("************************************");
		
		
		WebDriver driver2 = new ChromeDriver();
		driver2.launchBrowser();
		driver2.maximiseBrowser();
		driver2.navigateTo("https://www.google.com/");
		driver2.sendKeys("Selenium By Shantosh");
		driver2.click();
		driver2.select();
		driver2.getPageTitle();
		driver2.close();
		System.out.println("************************************");

	}

}









