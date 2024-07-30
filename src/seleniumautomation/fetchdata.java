package seleniumautomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class fetchdata {
	
	@Test
	  
	public void testingworld() throws Exception
	{
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://thetestingworld.com/testings/");
	driver.findElement(By.name("fld_username")).sendKeys("Asra");
	driver.findElement(By.cssSelector("[value='home']")).click();
	 Select  a = new Select(driver.findElement(By.name("sex")));
	 
	 a.selectByVisibleText("Female");
	 System.out.println(driver.findElement(By.name("terms")).isSelected());
	 
	 driver.findElement(By.name("terms")).click();
	 System.out.println(driver.findElement(By.name("terms")).isSelected());
	 Thread.sleep(5000);
	driver.findElement(By.className("displayPopup")).click();
	
	driver.findElement(By.className("close")).click();
	driver.navigate().to("https://www.facebook.com/");
Point xyz=	 driver.findElement(By.name("login")).getLocation();
System.out.println(xyz);
	 driver.close();
	}
}

