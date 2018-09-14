import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormRadiobuttonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver d = new ChromeDriver();
		d.get("http://www.echoecho.com/htmlforms10.htm");
		
		int count = d.findElements(By.cssSelector("input[name='group1']")).size();
		
		for (int i = 0; i < count;i++) {
			String s = d.findElements(By.cssSelector("input[name='group1']")).get(i).getAttribute("value");
			System.out.println(s);
			
			if (s.equals("Cheese")) {
				d.findElements(By.cssSelector("input[name='group1']")).get(i).click();
			}
		}
	}

}
