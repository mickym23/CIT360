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
	
	JUnit j = new JUnit();
	
	@Test
	public void testAssertArrayEquals() {
		int[] expResult = {1, 2, 3, 4};
		int[] actResult = j.arrayOut();
		assertArrayEquals("Test Failed. Integer Arrays are not equal.\n", expResult, actResult);
	}

	@Test
	public void testAssertEquals() {
		int actResult = j.subtract(20, 15);
		int expResult = 5;
		assertEquals("Test Failed. Strings are not equal.\n", expResult, actResult);
	}

	@Test
	public void testAssertFalse() {
		boolean result = j.isFalse();
		assertFalse("Test Failed. Not equal to Boolean False.\n", result);
	}

	@Test
	public void testAssertNotNull() {
		int result = j.notNull();
		assertNotNull("Test Failed. Equal to NULL.\n", result);
	}

	@Test
	public void testAssertNotSame() {
		int actual = j.subtract(5, 3);
		int unexpected = 3;
		assertNotSame("Test Failed. Same values.\n", unexpected, actual);
	}

	@Test
	public void testAssertNull() {
		String out = j.isNull();
		assertNull("Test Failed. Not Equal to NULL.\n", out);
	}

	@Test
	public void testAssertSame() {
		int num1 = j.num1;
		int num2 = j.num2;
		assertSame("Test Failed. Values are not equal.\n", num1, num2);
	}

	@Test
    public void testAssertThatEqual() {
        assertThat("Test Failed. Not equal Values.\n","out", is(j.isEqual()));
    }

	@Test
	public void testAssertTrue() {
		boolean bool = j.isTrue();
		assertTrue("Test Failed. Not equal to Boolean True.\n", bool);
	} 
}