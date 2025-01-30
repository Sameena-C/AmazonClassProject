/*
 Login to amazon->search a product->
 add it to wish list->remove it from wish list->logout			
 
 Working
 */
package systemscenarios.AmazonProject;

import org.testng.annotations.Test;

public class TestCase4_AddingtoWishlist_Removing extends LaunchQuit
{
	@Test 
	public void addwishlist_remove() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.acc_list(driver);
		Thread.sleep(2000);
		homepage.signin(driver);
		
		Thread.sleep(2000);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.un();
		Thread.sleep(2000);
		loginpage.cont();
		
		Thread.sleep(2000);
		loginpage.pwd();
		Thread.sleep(2000);
		loginpage.signin();
		
		Thread.sleep(2000);
		SearchPage searchpage=new SearchPage(driver);
		searchpage.srch();
		Thread.sleep(2000);
		searchpage.click_product();
		
		Thread.sleep(2000);
		Product1Page productpage=new Product1Page(driver);
		productpage.wishlist(driver);
		Thread.sleep(2000);
		productpage.view_wshlst();
		Thread.sleep(2000);
		productpage.rmve_wshlst();
		
		Thread.sleep(2000);
		homepage.acc_list(driver);
		Thread.sleep(2000);
		homepage.signout(driver);
	}
}
