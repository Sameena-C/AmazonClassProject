package systemscenarios.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	
	//Step 1
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist_hoverover_home;
	
	@FindBy(linkText="Start here.")
	WebElement start;
	
	@FindBy(xpath="//span[.='Sign in']")
	WebElement signin_home;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signout_home;
	
	//Step 2
	public void acc_list(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist_hoverover_home).perform();
	}

	public void strt()
	{
		start.click();
	}
	public void signin(WebDriver driver)
	{
		signin_home.click();
	}
	
	public void signout(WebDriver driver)
	{
		signout_home.click();
	}
	
	//Step 3
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
