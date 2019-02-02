package Objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register 
{
	WebDriver driver;
	public register(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="input-firstname")
	public WebElement fname;
	

	@FindBy(id="input-lastname")
	public WebElement lname;
	

	@FindBy(id="input-email")
	public WebElement email;
	

	@FindBy(id="input-telephone")
	public WebElement no;
	
	@FindBy(id="input-password")
	public WebElement pwd;
	
	@FindBy(id="input-confirm")
	public WebElement cpwd;
	
	@FindBy(name="agree")
	public WebElement agree;
	

	@FindBy(className="btn-primary")
	public WebElement button;
	
	@FindBy(className="fa-user")
	public WebElement myacc;
	
	@FindBy(linkText="Logout")
	public WebElement logout;
	
	
public void register(String Fname, String Lname,String Email,String No,String Pwd,String Cpwd) throws InterruptedException {
		
		fname.sendKeys(Fname);
		lname.sendKeys(Lname);
		email.sendKeys(Email);
		no.sendKeys(No);
		pwd.sendKeys(Pwd);
		cpwd.sendKeys(Cpwd);
		agree.click();
		button.click();
		
		myacc.click();
		Thread.sleep(2000);
		logout.click();
	}
	
	
	
}
