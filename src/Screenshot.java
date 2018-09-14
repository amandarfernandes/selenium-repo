import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.os.WindowsUtils;

/*
 * @author Amanda Fernandes
 * 
 */
public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.google.com");
		File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/amandafernandes/selenium-screens/sc1.png"));
	
		//WindowsUtils.killByName(name);;
	}

}
