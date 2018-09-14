import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertTest {

	public static void main(String[] args) {
		//allows chrome to accept insecure /invalid SSL certificates
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		//dc.acceptInsecureCerts();
		
		//alternative
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions co = new ChromeOptions();
		co.merge(dc);
		
		
		System.setProperty("webdriver.chrome.driver", "/User/amandafernandes/chromedriver");
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://buy.com");
	}

}
