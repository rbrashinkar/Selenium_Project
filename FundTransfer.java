package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.FundTransferPage;
import pages.LoginPage;
import utility.BaseClass;

public class FundTransfer extends BaseClass{
	private static final long TimeOut = 10;

	@Test
	void FundTransfers()
	{
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/V4/index.php");
		LoginPage login  = new LoginPage(driver);
		login.setUserName("86402");
		login.setPassword("Riyansh@10");
	    login.clickButton();
	    
	    FundTransferPage fp = new FundTransferPage(driver);
	    fp.FundTransfer();
	    fp.setPayersAcc("119678");
	    fp.setPayeeAcc("119677");
	    fp.setAmmount("100");
	    fp.setDesc("payment of grocery");
	    fp.Submit();
	    		
	}

}
