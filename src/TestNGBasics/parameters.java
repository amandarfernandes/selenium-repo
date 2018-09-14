/**
 * 
 */
package TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author amandafernandes
 *
 */
public class parameters {

	@Parameters({"URL"})
	@Test
	public void paramTest(String url) {
		System.out.println("Web Login Test: http://"+url);
	}
	
	@Test
	public void failTest() {
		System.out.println("Fail Test");
		Assert.assertTrue(false);
	}

}
