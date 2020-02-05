package webbrowser;

import org.apache.xpath.operations.Equals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytitle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E://eclips genuin//selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		if(title.equals("Google"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
			
		}
		

	}

}
