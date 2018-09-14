import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class captchaTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver d = new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.manage().window().maximize();
		
		d.get("https://socialblade.com/register/");
		System.out.println(d.getTitle());
		
		int f = getCaptchaFrame(d, By.cssSelector("#recaptcha-anchor"));
		if (f >= 0) {
			//System.out.println(f);
			d.switchTo().frame(f);
			d.findElement(By.cssSelector("#recaptcha-anchor")).click();
			//d.findElement(By.cssSelector("#recaptcha-verify-button")).click();
		}

	}

	public static int getCaptchaFrame(WebDriver d, By by) {
		int f;
		
		List<WebElement> frames = d.findElements(By.tagName("iframe"));
		int frameCount = frames.size();
		//System.out.println(frameCount);
		
		for(f= 0; f<frameCount;f++) {
			d.switchTo().frame(f);
			//System.out.println(f);
			if (d.findElements(by).size() > 0) {
				break;
			}
		}
		
		d.switchTo().defaultContent();
		if (f == frameCount)
			return -1;
		else
			return f;
		
	}
}
