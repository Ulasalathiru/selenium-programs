package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlScript {

	 static {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 }
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String htmlcode=driver.getPageSource();
			System.out.println(htmlcode);
	driver.close();
}
}
