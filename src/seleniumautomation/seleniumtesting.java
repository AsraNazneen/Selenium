package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

public class seleniumtesting {
	
	@Test
	public void fbtesting() {

	WebDriver	driver = new ChromeDriver();
		 String ExpUrl = "https://www.facebook.com";
	driver.get(ExpUrl);
		 
		String ActUrl = driver.getCurrentUrl(); 
		
		System.out.println(ActUrl);
	
	//Assert.assertEquals(ActUrl, ExpUrl);
	  SoftAssert sa = new SoftAssert();
	sa.assertEquals(ActUrl, ExpUrl);
	String Exptitle = "Facebook - log in or sign up";
	String Acttitle = driver.getTitle();
	System.out.println(Acttitle);
	 Assert.assertEquals(Acttitle, Exptitle);
	 
	 String Expnamefield = "Email or phone number";
	 String Actnamefield = driver.findElement(By.id("email")).getAttribute("placeholder");
	System.out.println(Actnamefield);
	
	Assert.assertEquals(Actnamefield, Expnamefield);
	
	String Explogin = "Log In";
	String Actlogin = driver.findElement(By.name("login")).getText();
	System.out.println(Actlogin);
	Assert.assertEquals(Actlogin, Explogin);
	   
	sa.assertAll();
	
	driver.close();
	}
	}
