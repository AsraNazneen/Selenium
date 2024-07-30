package AlertExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthentication {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
 String pageMessage = driver.findElement(By.cssSelector("p")).getText();
 System.out.println(pageMessage);
   driver.close();
	}

}
