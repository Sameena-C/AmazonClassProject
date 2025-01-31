/*
 Launch and Quit logic of Amazon 
 */

package systemscenarios.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit 
{
	WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		//driver=new EdgeDriver();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
