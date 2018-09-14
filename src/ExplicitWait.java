import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver d = new ChromeDriver();
		
		//implicit wait 
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		d.get("https://alaskatrips.poweredbygps.com/");
		d.findElement(By.id("tab-hotel-tab-hp")).click();
		d.findElement(By.name("destination")).sendKeys("NYC");
		d.findElement(By.name("destination")).sendKeys(Keys.TAB);
		d.findElement(By.name("startDate")).click();
		d.findElement(By.name("startDate")).sendKeys(Keys.ENTER);

		WebDriverWait wd = new WebDriverWait(d,15);
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#resultsContainer")));
		int count = d.findElements(By.cssSelector("div#resultsContainer>section>article")).size();
		System.out.println(count);
		
	}

}
