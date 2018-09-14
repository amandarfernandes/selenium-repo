package datadrivenTests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver Login() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/amandafernandes/eclipse-workspace/Introduction/src/datadrivenTests/datadriven.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.size());
		
		WebDriver d;
		
		switch (prop.getProperty("browser")) {
		
		case "firefox":
			System.setProperty("webdriver.gecko.driver","/Users/amandafernandes/geckodriver");
			d = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver","/Users/amandafernandes/chromedriver");
			d = new ChromeDriver();
			break;
		default: 
			System.setProperty("webdriver.chrome.driver","/Users/amandafernandes/chromedriver");
			d = new ChromeDriver();
			break;
		}
		
		String url = prop.getProperty("url");
		d.get(url);
		
		return d;
		
	}

}
