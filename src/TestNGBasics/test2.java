/**
 * 
 */
package TestNGBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author amandafernandes
 *
 */
public class test2 {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before each Method in test2 class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After each Method in test2 class");
	}
	
	@Test (groups= {"smoke"})
	public void MobileLoginTest() { 
		System.out.println("Mobile Login Test");
	}
	
	@Test
	public void MobileLogoutTest() {
		System.out.println("Mobile Logout Test");
	}
	
	@Test (enabled=false)
	public void MobileCarLoanTest() {
		System.out.println("Mobile Car Loan Test");
	}
	
	@Test (dependsOnMethods= {"MobileLogoutTest"})
	public void MobileSignupTest() {
		System.out.println("Mobile SignUp Test");
	}
	
	@Test (groups= {"smoke"})
	public void WebLoginTest() {
		System.out.println("Web Login Test");
	}
	
	@Test 
	public void WebLogoutTest() {
		System.out.println("Web Logout Test");
	}
	
	@Test (dependsOnMethods= {"WebLoginTest"})
	public void WebCarLoanTest() {
		System.out.println("Web Car Loan Test");
	}	
	@Test (groups= {"smoke"}, timeOut=5000)
	public void WebSignupTest() {
		System.out.println("Web SignUp Test");
	}
	
	@Test (dependsOnMethods= {"WebLoginTest","WebLogoutTest"})
	public void APILoginTest() {
		System.out.println("API Login Test");
	}
	
	@Test 
	public void APILogoutTest() {
		System.out.println("API Logout Test");
	}
	
	@Test
	public void APISignupTest() {
		System.out.println("API SignUp Test");
	}
}