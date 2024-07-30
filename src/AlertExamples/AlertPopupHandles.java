package AlertExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandles {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		/*driver.findElement(By.name("login")).sendKeys("Asra");
		driver.findElement(By.name("proceed")).click();
Alert alert = driver.switchTo().alert();
System.out.println(alert.getText());
 Thread.sleep(2000);
String text = alert.getText();
if(text.equals("Please enter your password" )) {
	System.out.println("correct alert message");
}
else 
	System.out.println("incorrect alert message");

	
 alert.accept();
	}*/

	driver.findElement(By.name("passwd")).sendKeys("1234pass");
	driver.findElement(By.name("proceed")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	String text = alert.getText();
	
	if(text.equals("Please enter a valid username")) 
	{
		System.out.println("correct message");
	}
	
	else 
		System.out.println("incorrect message");
	alert.accept();
	
	} }
