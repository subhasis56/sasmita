package webbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openurl {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E://eclips genuin//selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.close();
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		driver.manage().window().maximize();

	}

}
