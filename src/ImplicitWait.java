import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver d = new ChromeDriver();
		
		//implicit wait 
				d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		d.get("https://alaskatrips.poweredbygps.com/");
		d.findElement(By.id("tab-hotel-tab-hp")).click();
		d.findElement(By.name("destination")).sendKeys("NYC");
		d.findElement(By.name("destination")).sendKeys(Keys.TAB);
		d.findElement(By.name("startDate")).click();
		d.findElement(By.name("startDate")).sendKeys(Keys.ENTER);
		
		int count = d.findElements(By.cssSelector("div#resultsContainer>section>article")).size();
		System.out.println(count);
		d.findElements(By.cssSelector("div#resultsContainer>section>article")).get(count-1).click();
		
	}

}
