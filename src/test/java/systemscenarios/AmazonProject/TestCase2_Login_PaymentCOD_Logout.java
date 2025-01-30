/*
 Login to amazon->search a product->add it to wish list->
 add it to cart->Make a payment using COD->logout			
 
 Not Working
 */
package systemscenarios.AmazonProject;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase2_Login_PaymentCOD_Logout extends LaunchQuit
{
	@Test
	public void login_payment_logout() throws InterruptedException
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
	Thread.sleep(2000);
	productpage.add_crt();
	
	Thread.sleep(2000);
	PaymentPage paymentpage=new PaymentPage(driver);
	paymentpage.crt();
	Thread.sleep(2000);
	paymentpage.buy();
	
	Thread.sleep(4000);
	/*AddressPage addresspage=new AddressPage(driver);
	addresspage.ad_address();
	Thread.sleep(2000);
	addresspage.fulnam();
	Thread.sleep(2000);
	addresspage.mobnum();
	Thread.sleep(2000);
	addresspage.zip();
	Thread.sleep(2000);
	addresspage.flat();
	Thread.sleep(2000);
	addresspage.ara();
	Thread.sleep(2000);
	addresspage.lndmrk();
	Thread.sleep(2000);
	addresspage.cty();
	Thread.sleep(2000);
	addresspage.ste();
	Thread.sleep(6000);
	addresspage.use_add();
	Thread.sleep(2000);
	*/
	paymentpage.cod();
	Thread.sleep(2000);
	//paymentpage.pay();
	//Thread.sleep(5000);
	//paymentpage.ordr();
	//Thread.sleep(5000);
	/*
	homepage.acc_list(driver);	
	Thread.sleep(2000);
	homepage.signout(driver);
	*/
	
	
	
	}
}
