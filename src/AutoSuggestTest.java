import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver driver = new ChromeDriver();
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		driver.get("https://www.travelocity.com");
		
		WebElement dest = driver.findElement(By.cssSelector("input#hotel-destination-hp-hotel"));
		dest.sendKeys("Avalon");
		//Thread.sleep(2000L);
		//driver.findElement(By.cssSelector("ul#typeaheadDataPlain")).sendKeys(Keys.DOWN);
		/*
		dest.sendKeys(Keys.DOWN);
		dest.sendKeys(Keys.DOWN);
		dest.sendKeys(Keys.DOWN);
		dest.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER));
		System.out.println(dest.getAttribute("value"));
		//System.out.println(dest.getText());
		
		JavascriptExecutor jd = (JavascriptExecutor)driver;
		String val = (String) jd.executeScript("return document.getElementById(\"hotel-destination-hp-hotel\").value;");
		System.out.println(val);
		*/
		Thread.sleep(3000L);
		WebElement autoOptions = driver.findElement(By.id("typeaheadDataPlain"));
		wait.until(ExpectedConditions.visibilityOf(autoOptions));
		
		List<WebElement> items = autoOptions.findElements(By.tagName("li"));
		for (WebElement item : items) {
			System.out.println(item.getText());
			if (item.getText().contains("Avalon Fishing Pier")) {
				System.out.println("Found it!");
				item.click();
				break;
			}
		}
		
		System.out.println(dest.getAttribute("value"));
		Thread.sleep(3000L);
		driver.close();
	}
}
