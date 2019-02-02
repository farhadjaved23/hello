package Objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout 
{
	WebDriver driver;
	public logout(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="fa-user")
	public WebElement myacc;
	
	@FindBy(linkText="Logout")
	public WebElement logout;
	
	public void Logout() throws InterruptedException 
	{
		myacc.click();
		Thread.sleep(2000);
		logout.click();
	}
	
	
}
