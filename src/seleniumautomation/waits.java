package seleniumautomation;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class waits {
 WebDriver driver;
	@Test(enabled =false)
	public void launchbrowser() {
		  driver = new ChromeDriver();
		 driver.get("https://thetestingworld.com/testings/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		 Select con = new Select(driver.findElement(By.name("country")));
		 con.selectByVisibleText("United States");
		  Select st = new Select(driver.findElement(By.name("state")));
		 WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
		 
		 wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.name("state")), "California"));
		  st.selectByVisibleText("Florida");
		  
		  Select city = new Select(driver.findElement(By.name("city")));
		   
		  wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.name("city")), "Bellview"));
		  city.selectByVisibleText("Azalea Park");
		  
		  driver.close();
	}
	 @Test(enabled=false)
	public void Actions() throws InterruptedException
	
	{  driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		   Actions act = new Actions(driver);
		    act.sendKeys("Asra").perform();
		    Thread.sleep(2000);
		    //act.sendKeys(Keys.TAB).perform();
		    //act.sendKeys("1234password").perform();
		   // act.sendKeys(Keys.ENTER).perform();
		   act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
		   
		   act.sendKeys(Keys.PAGE_DOWN).perform();
	}
}
