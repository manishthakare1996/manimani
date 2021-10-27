package OtherMethod;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Method {
	static WebDriver driver;
	public void ImplicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void ScreenShot(WebDriver driver) throws IOException
	{
		//system date & Time
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-hh-mm-ss");
		Date date = new Date();
		System.out.println(sdf.format(date));
		
			
		// For ScreenShot
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File ("G:\\New folder\\Test123"+(sdf.format(date) )+".jpg"  );
		FileHandler.copy(source, dest);
	}
	
	public void ExplicitWait(WebDriver driver) 
	{
		WebDriverWait wait = new WebDriverWait(driver , 20);
		WebElement Creat = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	}
	
}
