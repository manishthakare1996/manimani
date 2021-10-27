package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import OtherMethod.Method;
import POMclass.HomePage;
import POMclass.LoginPage;

public class VarifyLoginPage {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\REASONING\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.LogIN();
		
		Method Wait = new Method();
		Wait.ImplicitWait(driver);
		
		HomePage Page = new HomePage(driver);
		Page.SearchMobile();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
