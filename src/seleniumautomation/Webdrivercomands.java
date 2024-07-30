package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webdrivercomands {
 
	
WebDriver driver;
@Test
public void launch_browser() throws InterruptedException {
		
		driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.google.com/");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().back();
		 driver.navigate().refresh();
		 driver.findElement( By.id("email")).sendKeys("Asra");
		 Thread.sleep(5000);
		 driver.findElement(By.id("email")).clear();
		 
		 
	
} }
