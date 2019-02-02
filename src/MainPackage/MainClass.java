package MainPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

import javax.print.attribute.standard.SheetCollate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Objectclass.Login;
import Objectclass.logout;
import Objectclass.register;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class MainClass {

	public static void main(String[] args) throws InterruptedException, JXLException, IOException {


		FileInputStream fs = new FileInputStream("C:\\Users\\labit\\Desktop\\far_Selenium\\Third Session\\Test.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet AddressSheet = wb.getSheet("User_Login");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\labit\\Downloads\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--incognito");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-popup-blocking");
		WebDriver web=new ChromeDriver(options);
		//web.get("https://demo.opencart.com/index.php?route=account/login");
		//Thread.sleep(2000);
		
		//for excel read
		//Login loginobj=new Login(web);
		//loginobj.Log(AddressSheet.getCell(0, 1).getContents(),AddressSheet.getCell(1, 1).getContents());
				
		//logout logoutobj=new logout(web);
		//logoutobj.Logout();
				
		//for(int i=0;i<10;i++)
		//{
			//Login loginobj=new Login(web);
			//loginobj.Log("mytc5@gmail.com", "123456789");
			
			//logout logoutobj=new logout(web);
			//logoutobj.Logout();
			//web.get("https://demo.opencart.com/index.php?route=account/login");	
			
		//}
		//Login loginobj=new Login(web);
		//loginobj.Log("mytc5@gmail.com", "123456789");
		
		//logout logoutobj=new logout(web);
		//logoutobj.Logout();
		
		//web.get("https://demo.opencart.com/index.php?route=account/login");
		
		//Login loginobj2=new Login(web);
		//loginobj.Log("dada@gmail.com", "123456789");
		
		//logout logoutobj2=new logout(web);
		//logoutobj.Logout();
		web.get("https://demo.opencart.com/index.php?route=account/register");
		register reg=new register(web);
		reg.register("ali", "shah", "shahji@gmail.com", "0321456789", "123456789", "123456789");
		System.out.print("");
		
		Thread.sleep(1000);
		
		web.get("https://demo.opencart.com/index.php?route=account/login");
		
		String mail="";
		mail=reg.email.toString();
		System.out.println(mail);
		Thread.sleep(2000);
		String pwd="";
		pwd=reg.pwd.toString();
		Thread.sleep(2000);
		Login loginobj=new Login(web);
		loginobj.Log(mail, pwd);
		
		
		
		//web.close();
		//web.quit();
		

	}

}
