package oops.interfacedemo;

public interface WebDriver {
	
	public void launchBrowser();
	
	public void maximiseBrowser();
	
	public void navigateTo(String url);
	
	public void sendKeys(String text);
	
	public void click();
	
	public void select();
	
	public void getPageTitle();
	
	public void close();

}
