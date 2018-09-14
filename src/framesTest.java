import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://jqueryui.com/droppable/");
		d.switchTo().frame(d.findElement(By.cssSelector("iframe.demo-frame")));
		System.out.println(d.findElements(By.cssSelector("div#draggable")).size());
		System.out.println(d.findElements(By.cssSelector("div#droppable")).size());
		Actions a = new Actions(d);
		WebElement source = d.findElement(By.cssSelector("div#draggable"));
		WebElement dest = d.findElement(By.cssSelector("div#droppable"));
		//a.moveToElement(d.findElement(By.cssSelector("div#draggable"))).click();
		System.out.println(source.getAttribute("id"));
		a.dragAndDrop(source, dest).build().perform();
		System.out.println(dest.getAttribute("id"));
		System.out.println(d.findElements(By.tagName("iframe")).size());
		d.switchTo().defaultContent();
		System.out.println(d.findElements(By.tagName("iframe")).size());
	}

}
