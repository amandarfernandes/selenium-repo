import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("amandarfernandes");
		driver.findElement(By.cssSelector("input#password")).sendKeys("amanda23");
		driver.findElement(By.cssSelector("input[name='proceed']")).click();
	}

}
