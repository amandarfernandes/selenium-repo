import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TableItemsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		//Thread.sleep(2000);
		WebElement sl = driver.findElement(By.xpath("//div[@id='innings_1']/div[1]"));
		List<WebElement> scoreCards = sl.findElements(By.className("cb-scrd-itms")); 
		int count = scoreCards.size();
		int total = 0;

		for (int i = 0; i < count-2;i++) {
			String runs = scoreCards.get(i).findElement(By.cssSelector("div:nth-child(3)")).getText();
			//System.out.println("Runs " + runs);
			total = total + Integer.parseInt(runs);
		}
		
		int extras = Integer.parseInt(sl.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		total = total+extras;
		System.out.println("Calculated Total: "+total);
		System.out.println(sl.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		driver.close();
	}

}
