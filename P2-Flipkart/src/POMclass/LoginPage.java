package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy (xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement Username;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement Passward;
	
	//@FindBy (xpath = "(//button[@type='submit'])[2]")
	@FindBy (xpath = "//div[@class='_1D1L_j']//span[text()='Login']")
	private WebElement LogIn;
	
	
		public LoginPage(WebDriver driver1)
		{
		PageFactory.initElements(driver1, this);
		}
	
		public void LogIN() 
		{
		Username.sendKeys("thakare.manish1996@gmail.com");
		Passward.sendKeys("manish@123");
		LogIn.click();
		}
	}
