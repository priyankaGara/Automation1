package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WebGeneric;

public class DashboardPage {
	
	private WebDriver driver;
	@FindBy(id="welcome")
	private WebElement welcome;

	@FindBy(xpath="//li/a[.='Logout']")
	private WebElement logout;

	public DashboardPage(WebDriver Driver)
	{  
		this.driver=driver;
		
		PageFactory.initElements(Driver,this);
	} 
	public void clickWelcome(){
		welcome.click();
		//WebGeneric.waitForVisiblityAndClick(driver, time, logout);
		
	}
	public void clickLogout(long time){
		WebGeneric.waitForVisiblityAndClick(driver,time,logout);
	}

}

	
	
	
