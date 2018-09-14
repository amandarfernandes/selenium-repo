import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class QAClickPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/amandafernandes/chromeDriver");
		WebDriver d = new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		d.manage().window().maximize();
		
		d.get("http://www.qaclickacademy.com/practice.php");
		
		//get total number of links on page
		System.out.println("Total Links on page: "+d.findElements(By.tagName("a")).size());
		
		//get number of links on footer
		WebElement footer = d.findElement(By.id("gf-BIG"));
		System.out.println("Links on footer: "+footer.findElements(By.tagName("a")).size());

		//get number of links in first column of footer
		WebElement col = footer.findElement(By.cssSelector("table.gf-t>tbody>tr>td:nth-child(1)>ul"));
		List <WebElement> links = col.findElements(By.tagName("a"));
		System.out.println("Links in 1st column of  footer: "+links.size());
		
		
		//click on each link and check that pages open
		links.remove(0);
		for (WebElement link:links) {
			link.sendKeys(Keys.chord(Keys.COMMAND,Keys.ENTER));
		}
		
		//System.out.println(d.getWindowHandles().size());
		String parent = d.getWindowHandle();
		ArrayList<String> windows = new ArrayList<String>(d.getWindowHandles()); 
		
		for(String handle: windows ) {
			if (!handle.equals(parent)) {
				d.switchTo().window(handle);
				System.out.println(d.getTitle());
			}
		}
		
		d.quit();
	}

}
