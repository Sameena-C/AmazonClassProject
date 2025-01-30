package systemscenarios.AmazonProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product1Page 
{
	WebDriver driver;
	
	//Step 1
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement wishlist_button;
	
	@FindBy(linkText="View Your List")
	WebElement view_wishlist;
	
	@FindBy(name="submit.deleteItem")
	WebElement remove_wishlist;
	
	@FindBy(id="continue-shopping")
	WebElement continueshopping_button;
	
	@FindBy(name="submit.add-to-cart")
	WebElement add_to_cart_button;
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement cart;
	
	@FindBy(xpath="//span[@class='a-icon a-icon-small-add']")
	WebElement increment3;
	
	@FindBy(xpath="//span[@class='a-size-small sc-action-delete']")
	WebElement remove_product;
	
	//Step 2
	public void wishlist(WebDriver driver) throws InterruptedException
	{
		
		Set<String> pcid=driver.getWindowHandles();
		Iterator<String> pc=pcid.iterator();
		String parentid=pc.next();
		String child1=pc.next();
		driver.switchTo().window(child1);
		wishlist_button.click();
		Thread.sleep(3000);
	}
	public void view_wshlst()
	{
		view_wishlist.click();
	}
	
	public void rmve_wshlst()
	{
		remove_wishlist.click();
	}
	
	public void cont_shop()
	{
		continueshopping_button.click();
	}
	public void add_crt()
	{
		add_to_cart_button.click();
	}
	public void crt()
	{
		cart.click();
	}
	
	public void inc()
	{
		//for(int i=1; i<=3; i++)
		{
		increment3.click();
		}
	}
	
	public void rmve()
	{
		//for(int i=1; i<=3; i++)
		{
		remove_product.click();
		}
	}
	//Step 3
	
	public Product1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
