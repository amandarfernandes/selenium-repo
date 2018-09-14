import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "/Users/amandafernandes/geckodriver");
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("http://www.yahoo.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}