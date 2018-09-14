import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver d = new ChromeDriver();
		d.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		d.findElement(By.cssSelector("input[value='Confirmation Alert']")).click();
		System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().accept();
		d.close();
	}

}
