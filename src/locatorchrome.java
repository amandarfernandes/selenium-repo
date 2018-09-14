import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("#username")).sendKeys("testuser");
		driver.findElement(By.xpath("//*[@name='pw']")).sendKeys("password");
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	}

}
