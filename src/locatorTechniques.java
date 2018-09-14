import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatorTechniques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/Users/amandafernandes/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Forgot account?")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("#identify_email")).sendKeys("amandadcunha@gmail.com");
		//driver.findElement(By.linkText("Cancel")).click();
		driver.navigate().back();
		driver.findElement(By.id("email")).sendKeys("dcunhaa@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		//driver.close();
	}
	

}
