package testcases;

import org.testng.annotations.Test;

import pages.ChangePwdPage;
import pages.LoginPage;
import utility.BaseClass;

public class ChangePwdTC extends BaseClass{
	@Test
	void ChangePassword()
	{
	driver.get("https://demo.guru99.com/V4/index.php");
	LoginPage login  = new LoginPage(driver);
	login.setUserName("mngr486054");
	login.setPassword("Riyansh@10");
    login.clickButton();
    
    
    ChangePwdPage pc = new ChangePwdPage(driver);
    pc.MiniStmt();
    pc.setAccNo("119678");
    pc.submit();

}
}
