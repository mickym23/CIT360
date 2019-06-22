package cedras.junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

/* This Test Case is JUnit that runs under the Test-Driven Development
 * process. This test was to show the uniqueness and use of each of the 
 * methods asked for in the criteria. A failure message was also attached
 * along with each method to let the person running the test know what occurred.
 * 
 * These are fairly simple programs set-up, but it can be very useful once creating
 * a larger project or application to keep a focus and results driven development
 * perspective in mind when continuing to code.
 */

public class MainJUnit {
	
	@Test
	public void testAssertArrayEquals() {
		int[] expResult = {1,
						   2,
						   3};
		int[] actResult = {1,
				 		   2,
				 		   3};
		
		assertArrayEquals("Test Failed. Integer Arrays are not equal.\n", expResult, actResult);
	}

	@Test
	public void testAssertEquals() {
		String expResult = "Brigham Young University";
		String actResult = "Brigham Young University";
		assertEquals("Test Failed. Strings are not equal.\n", expResult, actResult);
	}

	@Test
	public void testAssertFalse() {
		boolean isSandbox = !(true);
		assertFalse("Test Failed Not equal to Boolean False.\n", isSandbox);
	}

	@Test
	public void testAssertNotNull() {
		String notZero = "YES!";
		assertNotNull("Test Failed. Equal to NULL.\n", notZero);
	}

	@Test
	public void testAssertNotSame() {
		String unexpected = "Unexpected";
		String actual = "Actual";
		assertNotSame("Test Failed. Same values.\n", unexpected, actual);
	}

	@Test
	public void testAssertNull() {
		Object object = new Object();
		object = null;
		assertNull("Test Failed. Not Equal to NULL.\n", object);
	}

	@Test
	public void testAssertSame() {
		String num1 = "Strings!";
		String num2 = "Strings!";
		assertSame("Test Failed. Values are not equal.\n", num1, num2);
	}

	@Test
    public void testAssertThatEqual() {
        assertThat("Test Failed. Not equal Values.\n","Apollo", is("Apollo"));
    }

	@Test
	public void testAssertTrue() {
		boolean bool = true;
		assertTrue("Test Failed. Not equal to Boolean True.\n", bool);
	} 
}