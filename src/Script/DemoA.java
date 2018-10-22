package Script;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import generic.WebGeneric;
import page.DashboardPage;
import page.LoginPage;


public class DemoA extends BaseTest{
	/*@Test
	public void testA(){
		String un=Utility.getXLData(DATA_PATH,"DemoA",1,0);
		String pw=Utility.getXLData(DATA_PATH, "DemoA", 1,1);
		
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();*/
	@Test(priority=1,groups={"smoke"})
	public void testA() throws AWTException
	{
		//take the input data from excel file
		String un=Utility.getXLData(DATA_PATH,"DemoA",1,0);
		String pw=Utility.getXLData(DATA_PATH, "DemoA", 1,1);
		String homePageURL=Utility.getXLData(DATA_PATH,"DemoA",1,2);
		String loginPageURL=Utility.getXLData(DATA_PATH,"DemoA",1,3);

		//enter valid username, password click login
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
		/*Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);*/
		
		//verify that dashboard page is displayed
		WebGeneric.verifyURL(driver,lngETO,homePageURL);

		
		//click welcome->logout
		DashboardPage d=new DashboardPage(driver);
		d.clickWelcome();
		d.clickLogout(lngETO);
		//verify thatLogin page is Displayed
		
		WebGeneric.verifyURL(driver,lngETO,loginPageURL);
	
	
		
	}
	
	}

