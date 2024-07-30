package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestscenarioFB {
	WebDriver driver;
	
	@BeforeMethod
	public void launch_browser() {
		
		driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	}
	
	/*@AfterMethod
 public void close_browser() throws InterruptedException  {
 
	 Thread.sleep(4000);
	 driver.close();*/
	 
	

 
/* @Test
public void login_functionality() {
	
driver.findElement(By.id("email")).sendKeys("asra@gmail.com");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pass123");
driver.findElement(By.name("Login")).click(); */


 @Test
 public void signup_funtionality() throws Exception {
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("[aria-label='First name']")).sendKeys("Asra");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nazneen");
	driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("asra@gmail.com");
	driver.findElement(By.cssSelector("[aria-label='Re-enter email']")).sendKeys("asra@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("pass123");
	
	 WebElement M   =  driver.findElement(By.name("birthday_month"));
	 
	 Select Month = new Select(M);
	 Month.selectByVisibleText("May");
	 
	 WebElement  D = driver.findElement(By.name("birthday_day"));
	
 Select Day = new Select(D);
 Day.selectByVisibleText("31");
 
 WebElement y = driver.findElement(By.name("birthday_year"));
 Select Year = new Select(y);
 
	Year.selectByVisibleText("2019");
	
	driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();

driver.findElement(By.name("websubmit")).click();

}
}


