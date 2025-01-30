package systemscenarios.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//Step 1
	//@FindBy(id="ap_email_login") 
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue") 
	WebElement continue_button;
	
	@FindBy(id="ap_password") 
	WebElement password;
	
	@FindBy(id="signInSubmit") 
	WebElement signin_button;
	
	//Step 2
	public void un()
	{
		username.sendKeys("6361346632");
	}
	
	public void cont()
	{
		continue_button.click();
	}
	
	public void pwd()
	{
		password.sendKeys("SC123456");
	}
	
	public void signin()
	{
		signin_button.click();
	}
	
	//Step 3
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}
