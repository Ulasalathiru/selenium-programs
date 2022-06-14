package jsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EqualOrNot 
{
	static
    {
      System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
    }
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement emailTbx=driver.findElement(By.name("username"));
		int height1 = emailTbx.getSize().getHeight();
		int width1 = emailTbx.getSize().getWidth();
		WebElement pwdTbx=driver.findElement(By.name("pwd"));
		int height2 = pwdTbx.getSize().getHeight();
		int width2 = pwdTbx.getSize().getWidth();
		System.out.println("Height of Username tbx= "+height1+" Pixels");
		System.out.println("Width of Username tbx= "+width1+" Pixels");
		System.out.println("Height of Password tbx= "+height2+" Pixels"); 
		System.out.println("Width of Password tbx= "+width2+" Pixels");
		if(height1==height2&&width1==width2)
		{
			System.out.println("Both Height and Width of Username and Password TextBox are Equal");
		}
		else
		{
			System.out.println("Both Height and Width of Username and Password TextBox are not Equal");
		}
	}
}
