package systemscenarios.AmazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage 
{
	WebDriver driver;
	
	//Step 1
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	//@FindBy(xpath="//input[@id='add-to-cart-button']")
	@FindBy(xpath="(//button[.='Add to cart'])[1]")
	WebElement add_button;
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement click_on_product;	
	
	//Step 2
	public void srch()
	{
		search.sendKeys("pencil" + Keys.ENTER);
	}
	
	public void click_product()
	{
		click_on_product.click();
	}
	
	public void add()
	{
		add_button.click();
	}
	
	//Step 3
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	
}
