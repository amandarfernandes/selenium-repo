/**
 * 
 */
package TestNGBasics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Amanda Fernandes
 *
 */
public class test3 {
	@Test
	public void LoginTest() {
		System.out.println("Login Test");
	}
	
	@Test
	public void LogoutTest() {
		System.out.println("Logout Test");
	}
	
	
	@Test
	public void SignupTest() {
		System.out.println("SignUp Test");
	}
	
	
	@Test(dataProvider="getData")
	public void MyOwnLoginTest(String userName, String userPasswd) {
		System.out.println("MyOwn Login Test ");
		System.out.println(userName);
		System.out.println(userPasswd);
	}
	
	@Test
	public void MyOwnLogoutTest() {
		System.out.println("MyOwn Logout Test");
	}
	
	
	@Test
	public void MyOwnSignupTest() {
		System.out.println("MyOwn SignUp Test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before  Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After  Suite");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data= new Object[3][2];
		
		data[0][0]="firstUser";
		data[0][1]="firstPasswd";
	
		data[1][0]="secondUser";
		data[1][1]="secondPasswd";
		
		data[2][0]="thirdUser";
		data[2][1]="thirdPasswd";
	
		return data;
	}
	
}
