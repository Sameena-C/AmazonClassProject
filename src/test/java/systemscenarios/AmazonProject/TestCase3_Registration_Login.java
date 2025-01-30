/*
 Registration of the amazon application 
 and login using the same credentials			

Not Working
 */
package systemscenarios.AmazonProject;

import org.testng.annotations.Test;

public class TestCase3_Registration_Login extends LaunchQuit
{
	@Test
	public void register_login() throws InterruptedException
	{
	HomePage homepage=new HomePage(driver);
	/*
	homepage.acc_list(driver);
	Thread.sleep(2000);
	homepage.strt();
	*/
	Thread.sleep(2000);
	/*
	RegistrationPage regpage=new RegistrationPage(driver);
	/*regpage.mobile();
	Thread.sleep(2000);
	regpage.cont();
	Thread.sleep(2000);
	//regpage.pro_crte_acc();
	//regpage.crte_acc();
	Thread.sleep(2000);
	*/
	/*
	regpage.cust_name();
	Thread.sleep(2000);
	regpage.mobile1();
	Thread.sleep(2000);
	regpage.cust_pwd();
	Thread.sleep(2000);
	regpage.vrfy_mob();
	Thread.sleep(10000);
	//regpage.puzzle();
	Thread.sleep(40000);
	*/
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
	
	}
}
