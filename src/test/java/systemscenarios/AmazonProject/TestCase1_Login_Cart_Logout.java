/*
 Login to amazon->search a product->add it to wish list->add it to cart->logout			

Working 
 */

package systemscenarios.AmazonProject;

import org.testng.annotations.Test;

public class TestCase1_Login_Cart_Logout extends LaunchQuit
{
	@Test
	public void login_cart_logout() throws InterruptedException
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
	productpage.cont_shop();
	Thread.sleep(5000);
	productpage.add_crt();
	
	
	Thread.sleep(2000);
	homepage.acc_list(driver);
	Thread.sleep(2000);
	homepage.signout(driver);
	
	}
	
}
