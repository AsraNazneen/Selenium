package AlertExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handleframes {
 
	WebDriver driver;
	
	@Test
	public  void frames() throws Exception
	{  
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe page')]")).getText());
		Thread.sleep(5000);
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		  
		
	capturescreenshot.screenshot(driver, "handleframes");
	}}
