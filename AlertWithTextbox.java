package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextbox
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
       Alert a = driver.switchTo().alert();
       a.sendKeys("Srikanth");
       a.accept();
       boolean text = driver.findElement(By.xpath("//p[@id='demo1']")).isDisplayed();
       if(text==true)
       {
    	   System.out.println("Hello Srikanth How are you today is Displayed");
       }
       else
       {
    	   System.out.println("Hello Srikanth How are you today is not Displayed");
       }
       driver.close();
	}

}
