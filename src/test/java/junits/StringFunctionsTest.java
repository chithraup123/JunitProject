package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {

	@CustomAnnotation
	public void test1() {
	
		assertTrue(StringFunctions.isPalindrome("racecar"));
	}
	
	@Tag("Regression")
	@DisplayName("Negtive Test")
	@Test
	public void test2() {
	
		assertFalse(StringFunctions.isPalindrome("ABCD"));
	}
}
