package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Master {
	public WebDriver driver;
	public void initialiseBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/\"");
		driver.manage().window().maximize();
	}

	public static void main(String[] args) {
		Master master=new Master();
		master.initialiseBrowser();

	}

}
