package seleniumautomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webdriverC {
	
	
	 
		
		public void launch_browser() throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	 driver.get("https://www.ebay.com/");
	  List <WebElement> linklist = driver.findElements(By.tagName("a"));
	  
	  System.out.println(linklist.size());
	 
	  for(int i=0;i<linklist.size();i++) 
			  {
		  String  text = linklist.get(i).getText();
		  
		  System.out.println(text);
		  
	  } }
	  
	 public static void main(String args[]) throws InterruptedException  {
		 
		 webdriverC  d = new webdriverC();
		 d.launch_browser();
		 
		 
 } } 
