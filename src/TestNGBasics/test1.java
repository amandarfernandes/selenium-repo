/**
 * 
 */
package TestNGBasics;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author amandafernandes
 *
 */
public class test1 {

	@Test
	public void test001() {
		System.out.println("1st Test");
	}
	
	@Test (groups= {"smoke"})
	public void test002() {
		System.out.println("2nd Test Case!");
	}

	@Test
	public void test003() {
		System.out.println("3rd Test Case!");
	}
	
	@BeforeTest
	public void test004() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void postTest() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass 
	public void postClass() {
		System.out.println("After Class");
	}
}
