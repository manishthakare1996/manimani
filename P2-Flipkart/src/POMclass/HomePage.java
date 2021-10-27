package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

		@FindBy (xpath = "//input [ @class='_3704LK']" )
		private WebElement Search;
		
		@FindBy (xpath = "//button [@type='submit']")
		private WebElement Click ; 
		
		
		
		
		public HomePage(WebDriver driver1)
		{
		PageFactory.initElements(driver1, this);
		}
		
		public void SearchMobile()
		{
			Search.sendKeys("redmi note 10 pro");
			
			Click.click();
			
			
			
		}
		
		
		
		

}
