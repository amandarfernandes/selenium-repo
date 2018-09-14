package TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author amanda fernandes
 *
 */
public class AssertionBasics {
	SoftAssert softAssert = new SoftAssert();
	@Test
    public void assertEquals(){
        Assert.assertEquals("This assertion will pass","This assertion will pass");
        System.out.println("This line is executed because assertEquals "
                + "passed since both the strings are same");
        try
        {
        	Assert.assertEquals("assertion","This assertion will fail");
        } catch (Throwable e) {
        System.out.println("This line will be executed because "
                + "assertEquals fails both the strings are different."
                + "and i am in the catch block");
        System.out.println(e);
        }
    }
    @Test
    public void assertNotEquals(){
        Assert.assertNotEquals("This assertion will pass","Since the "
                + "expected and actual result do not match");
        System.out.println("This line is executed because assertNotEquals"
                + " assertion pass for the given situation");
    }
    @Test
    public void assertTrue(){
        Assert.assertTrue(3<5);
        System.out.println("This line will be executed as assertTrue will"
                + " pass because the 3<5(which will return true)");
    }
    @Test
    public void assertFalse(){
        Assert.assertFalse(3>5);
        System.out.println("This line is executed because assertFalse"
                + "assertion passes as the given condition will return false");
    }
    @Test
    public void assertNull(){
        Assert.assertNull(null);
        System.out.println("Since we we set null in the condition, the assertion "
                + "assertNull will pass");
    }
    @Test
    public void assertNotNull(){
        Assert.assertNotNull("This assertion will pass because this "
                + "string don't returns a null value");
        System.out.println("This line is executed because assertNotNull have have passed");
    }
	
    @Test
    public void softAssertion(){
         
        softAssert.assertNull("assertion");
        System.out.println("We are using Soft assertion in this method,"
                + " so this line of code will also be executed even if "
                + "the assetion fails.Wherever we want to execute full "
                + "testcase/method, we should use SoftAssertion");
        softAssert.assertAll();
    }
}
