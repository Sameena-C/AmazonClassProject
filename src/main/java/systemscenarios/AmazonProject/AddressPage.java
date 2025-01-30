package systemscenarios.AmazonProject;

import java.lang.Thread.State;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage 
{	
	//Step 1
	@FindBy(partialLinkText="Add a new delivery address")
	WebElement add_address_button;
	
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement full_name;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement mobile_number;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement postal_code ;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement flat_number;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	WebElement area;
	
	@FindBy(id="address-ui-widgets-landmark")
	WebElement landmark;
	
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement city;
	
	@FindBy(linkText="Choose a state")
	WebElement state;
	
	@FindBy(id="checkout-primary-continue-button-id")
	WebElement use_address_button;
	
	//Step 2
	public void ad_address()
	{
		add_address_button.click();
	}
	
	public void fulnam()
	{
		full_name.sendKeys("Sameena C");
	}
	
	public void mobnum()
	{
		mobile_number.sendKeys("6361346632");
	}
	
	public void zip()
	{
		postal_code.sendKeys("560078");
	}
	
	public void flat()
	{
		flat_number.sendKeys("13, IndhiraGandhi circle, Sarakki main road");
	}
	
	public void ara() 
	{
		area.sendKeys("JP Nagar Phase 1");
	}
	
	public void lndmrk()
	{
		landmark.sendKeys("Opp. Karnataka Bank ATM");
	}
	
	public void cty()
	{
		city.sendKeys("Bangalore");
	}
	
	public void ste()
	{
		state.click();
		Select s1=new Select(state);
		s1.selectByVisibleText("KARNATAKA");
	}
	
	public void use_add()
	{
		use_address_button.click();
	}
	//Step 3
	public AddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
