package SeleniumDemo;


public class GeoBrowserCommands extends Master {
	public void verifyBrowserCommands()
	{
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getPageSource());
	}
	

	public static void main(String[] args) {
		GeoBrowserCommands browser=new GeoBrowserCommands();
		browser.initialiseBrowser();
		browser.verifyBrowserCommands();
		//browser.verifyNavigationCommands();
		
	}

}
