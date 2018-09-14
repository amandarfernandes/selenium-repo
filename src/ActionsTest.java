import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.;
public class ActionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.com");
		Actions a = new Actions(d);
		a.moveToElement(d.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		
		WebElement search = d.findElement(By.cssSelector("#twotabsearchtextbox"));
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("alexa").doubleClick().build().perform();
		
	}

}
