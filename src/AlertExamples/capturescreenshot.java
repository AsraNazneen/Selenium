package AlertExamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class capturescreenshot {

	
	public static void screenshot(WebDriver driver,String name) throws Exception 
	
	{
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  
	  File f = ts.getScreenshotAs(OutputType.FILE );
	  
	  File fd = new File("./Screenshotresults/"+name+".png");
		
	FileUtils.copyFile(f,fd)	;
}


}