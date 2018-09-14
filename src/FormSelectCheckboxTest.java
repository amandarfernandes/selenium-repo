import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class FormSelectCheckboxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver d = new ChromeDriver();
		//d.get("https://www.travelocity.com");
		//button[id*='flight']
		//d.findElement(By.cssSelector("button[id*='flight']")).click();
		//Select adults = new Select(d.findElement(By.id("flight-adults-hp-flight")));
		//adults.selectByValue("4");
		//Select kids = new Select(d.findElement(By.id("flight-children-hp-flight")));
		//kids.selectByValue("3");
		d.get("https://spicejet.com/");
		Select curr = new Select(d.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		curr.selectByValue("USD");
		WebElement f = d.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		f.click();
		System.out.println(f.isSelected());
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		d.findElement(By.cssSelector("a[value='GOI']")).click();
		d.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		
		
		
	}

}
