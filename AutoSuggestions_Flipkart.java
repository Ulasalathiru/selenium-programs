
package qsp;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestions_Flipkart
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(1000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//ul/li/div/a/div[2]"));
		int count=allSugg.size();
		System.out.println(count);
		for (WebElement webElement : allSugg)
		{
			String text=webElement.getText();
			System.out.println(text);
		}
		allSugg.get(count-1).click();
		driver.close();
	}
}
