package seleniumautomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyboard {
  WebDriver driver;
  
  
  @Test 
     public  void  keyboardaction() {

     driver = new ChromeDriver();
     driver.get("https://www.mphasis.com/home.html");
     driver.manage().window().maximize();
     Actions act = new Actions(driver);
    // act.click(driver.findElement(By.xpath("//a[contains(text(),'Our Approach')]"))).perform();
    // act.contextClick(driver.findElement(By.xpath("//a[contains(text(),'Our Approach')]"))).perform();
    // act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Industries')]"))).perform();
     //act.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).perform();
      
    // act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).keyUp(Keys.CONTROL).perform();
     
   Set<String> winids=  driver.getWindowHandles();
   
   Iterator<String> itr = winids.iterator();
   String win1 = itr.next();
   String win2 = itr.next();
   String win3 = itr.next();
   driver.switchTo().window(win2);
   driver.switchTo().window(win3);
   
  
  
  
  
  }
     


}
