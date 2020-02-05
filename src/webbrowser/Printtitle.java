package webbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printtitle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E://eclips genuin//selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//String title=driver.getTitle();
		//System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		

	}

}
