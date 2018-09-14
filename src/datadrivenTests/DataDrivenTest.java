package datadrivenTests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DataDrivenTest extends TestBase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = Login();
		System.out.println(driver.findElements(By.cssSelector("input[type='text']")).size());
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys(Keys.ENTER);
		
	}

}
