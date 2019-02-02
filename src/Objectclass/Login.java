package Objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="email")
	public WebElement Emailid;
	
	@FindBy(name="password")
	public WebElement pass;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	public WebElement submit;
	
	
	public void Log(String email, String PWD) {
		
		Emailid.sendKeys(email);
		pass.sendKeys(PWD);
		submit.click();
	}
}
