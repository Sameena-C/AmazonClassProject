package systemscenarios.AmazonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage 
{
	//WebDriver driver;
	//Step 1
	@FindBy(id="ap_email_login")
	WebElement mobile_number;
	
	@FindBy(id="ap_phone_number")
	WebElement mobile_number1;
	
	@FindBy(id="continue") 
	WebElement continue_button;
	
	@FindBy(partialLinkText="Proceed to create an account")
	WebElement proceedcreateaccount;
	
	@FindBy(xpath="//input[@id='createAccount']")
	WebElement create_account;
	
	@FindBy(id="ap_customer_name")
	WebElement customer_name;
	
	@FindBy(id="ap_password")
	WebElement customer_password;
	
	@FindBy(id="auth-continue")
	WebElement verify_mob;
	
	@FindBy(xpath="//button[.='Start Puzzle']")
	WebElement start_puzzle;
	
	//Step 2
	
	public void mobile()
	{
		mobile_number.sendKeys("9886098860" + Keys.ENTER);
	}
	public void mobile1()
	{
		mobile_number1.sendKeys("9845098450" + Keys.ENTER);
	}
	public void cont()
	{
		continue_button.click();
	}
	
	public void pro_crte_acc()
	{
		proceedcreateaccount.click();
	}
	
	public void crte_acc()
	{
		create_account.click();
	}
	
	public void cust_name()
	{
		customer_name.sendKeys("Customer1");
	}
	
	public void cust_pwd()
	{
		customer_password.sendKeys("Customer@123");
	}
	
	public void vrfy_mob()
	{
		verify_mob.click();
	}
	
	public void puzzle()
	{
		start_puzzle.click();
	}
	
	//Step 3
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
