package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTagname 
{
	static
    {
      System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
    }

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 String tagname = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getTagName();
		 if(tagname.equals("a"))
		 {
			 System.out.println("Tagname for Forgotten password is "+tagname);
		 }
		 else
		 {
			 System.out.println("Tagname for Forgotten password is  not "+tagname);
		 }
	}

}
