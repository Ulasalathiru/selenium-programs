package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/flights");
	    driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).sendKeys("Bangalore");
	    driver.findElement(By.xpath("//div[text()='Suggestions']/../li/p")).click();
	    driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).sendKeys("Goa");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[text()='Suggestions']/../li/p")).click();
	    driver.findElement(By.xpath("//button[text()='Search flights']")).click();
	     List<WebElement> flights = driver.findElements(By.xpath("//img[@class]"));
	     List<WebElement> departure = driver.findElements(By.xpath("//div[contains(@class,'ms-grid-column-1 ms-grid-row-1')]"));
	     for (int i = 0; i <flights.size(); i++) 
	     {
			String F = flights.get(i).getAttribute("alt");
			String T = departure.get(i).getText();
			 System.out.println(F+"       "+T);
		}
	    driver.close();
	}
} 
