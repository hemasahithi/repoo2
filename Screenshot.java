package seleniumscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//create afile at thedestination and store the screenshot there
		//  ./ to take current project folder structure
	
		File destFile = new File("./Screenshots/redbus.png");
		FileUtils.copyFile(srcFile, destFile);
		
		

	}

}
