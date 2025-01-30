package systemscenarios.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage 
{
	WebDriver driver;
	
	//Step 1
	@FindBy(id="nav-cart-text-container")
	WebElement cart;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedtobuy;
	
	@FindBy(xpath="(//span[.='Cash on Delivery/Pay on Delivery'])[3]")
	WebElement cash;
	
	@FindBy(xpath="(//span[@class='a-button-text'])[1]")
	WebElement payment_method_button;
	
	@FindBy(id="placeOrder")
	WebElement place_order;
	
	//Step 2
	public void crt()
	{
		cart.click();
	}
	public void buy()
	{
		proceedtobuy.click();
	}
	
	public void cod()
	{
		//Select s1=new Select(cash);
		//s1.selectByVisibleText("KARNATAKA");
		
		cash.click();
	}
	
	public void pay()
	{
		payment_method_button.click();
	}
	
	public void ordr()
	{
		place_order.click();
	}
	
	//Step 3
	
	public PaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
