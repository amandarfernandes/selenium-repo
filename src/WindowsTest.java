//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver d = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "/Users/amandafernandes/geckodriver");
		//WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.manage().window().maximize();
		
		d.get("https://accounts.google.com/");
		System.out.println(d.getTitle());
		String parentId = d.getWindowHandle();
		String childId="";
		
		d.findElement(By.linkText("Learn more")).sendKeys(Keys.chord(Keys.COMMAND,Keys.ENTER));
		//d.findElement(By.linkText("Help")).click();
		//d.findElement(By.xpath("/html/body/div[1]/div[1]/footer/ul/li[1]")).click();
		//d.findElement(By.linkText("Help")).sendKeys(Keys.ENTER);
		System.out.println(d.getTitle());
		//System.out.println(d.getWindowHandles().size());
		System.out.println("ParentId "+parentId);
		for(String handle: d.getWindowHandles()) {
			//System.out.println(handle);
			if (!handle.equals(parentId)) {
				childId = handle;
			}
		}
		System.out.println("ChildId "+childId);
		
		d.switchTo().window(childId);
		//Set<String> windowIds = d.getWindowHandles();
		//Iterator<String> it = windowIds.iterator();
		//it.next();
		//String childId = it.next();
		
		//ArrayList<String> tabs = new ArrayList<String>(d.getWindowHandles()); 
		//d.switchTo().window(tabs.get(1));
		//d.findElement(By.xpath("//form[@id='search-form']/input[1]")).sendKeys("Create Account");
		System.out.println(d.getTitle());
		
		d.switchTo().window(parentId);
		System.out.println(d.getTitle());
		Thread.sleep(3000L);
		d.quit();
	}

}
