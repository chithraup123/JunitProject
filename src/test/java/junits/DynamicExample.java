package junits;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicExample {
	@TestFactory
	public List<DynamicTest> Method1() {

		return Arrays.asList(

				DynamicTest.dynamicTest("Positive Test", () -> assertTrue(StringFunctions.isPalindrome("madam"))),

				DynamicTest.dynamicTest("Negative Test", () -> assertFalse(StringFunctions.isPalindrome("nikunj")))

		);

	}

}
