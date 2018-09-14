import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/amandafernandes/chromedriver");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tripadvisor.com/CheapFlightsHome");
		
		d.findElement(By.cssSelector("div#rt_ui_picker>span:nth-child(1)")).click();
		Thread.sleep(1000L);
		
		//get month
		boolean gotMonth=false;
		WebElement mnth=null;
		
		while (!gotMonth) {
			List<WebElement> months = d.findElements(By.cssSelector(".rsdc-month"));
			//System.out.println(months.size());
			for(WebElement month : months) {
				//System.out.println(month.getText());
				if (month.getText().contains("Jan")) {
					mnth=month;
					gotMonth = true;
					break;
				} 
			}
			if (mnth == null) {
				d.findElement(By.cssSelector(".rsdc-next")).click();
				d.findElement(By.cssSelector(".rsdc-next")).click();	
			}
			
		}	
		
		//System.out.println(mnth.getText());
		
		//get day
		List<WebElement> days = mnth.findElements(By.className("rsdc-day"));
		
		//System.out.println(days.size()+"\n");
		
		
		for (WebElement day: days) {
			//System.out.println(day.getText());
			if (day.getText().equals("12")) {
				day.click();
				break;
			}
		}
	
		d.findElement(By.id("cos_ui_picker")).click();
		//d.close(); 
	}

}
