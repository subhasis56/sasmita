package webbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openfirefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","E://eclips genuin//selenium//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.close();
		
		
		

	}

}
