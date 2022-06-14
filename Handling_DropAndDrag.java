package jsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Handling_DropAndDrag
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws  InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement Source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement Target = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		a.dragAndDrop(Source, Target).perform();
	}
}
