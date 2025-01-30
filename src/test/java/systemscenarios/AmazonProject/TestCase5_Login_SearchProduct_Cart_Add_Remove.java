/*
 Login to amazon->search a product->add it to cart->increment its count by 3->
 remove the product which are present in cart->logout			
 
 Working
 */
package systemscenarios.AmazonProject;

import org.testng.annotations.Test;

public class TestCase5_Login_SearchProduct_Cart_Add_Remove extends LaunchQuit
{

	@Test
	public void login_add_remove() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.acc_list(driver);
		Thread.sleep(2000);
		homepage.signin(driver);
		
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
		searchpage.add();
		
		Thread.sleep(2000);
		Product1Page productpage=new Product1Page(driver);
		productpage.crt();
		Thread.sleep(2000);
		productpage.inc();
		Thread.sleep(2000);
		productpage.inc();
		Thread.sleep(2000);
		productpage.inc();
		Thread.sleep(2000);
		productpage.rmve();
		Thread.sleep(2000);
		
		homepage.acc_list(driver);
		Thread.sleep(2000);
		homepage.signout(driver);
	}
}
