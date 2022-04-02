package junits;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class JunitParamsExample {

	@ParameterizedTest
	@ValueSource(strings = { "racecar", "madam", "abcdcba", "hello" })
	public void test1(String str) {
		assertTrue(StringFunctions.isPalindrome(str));
	}

	@ParameterizedTest
	@ValueSource(ints = { 5, 6, 7, 8 })
	public void test2(int num) {
		assertTrue(num % 2 == 0);
	}

	@ParameterizedTest
	@EnumSource(Month.class)
	public void test3(Month month) {
		assertTrue(month == Month.JANUARY);
		// int monthVal = month.getValue();
	}

	@ParameterizedTest
	@EnumSource(value = Month.class, names = { "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER" })
	public void test4(Month month) {
		assertEquals(30, month.length(false));
	}

	// Below two methods are for data provider in Junit
	@ParameterizedTest
	@MethodSource("DPMethod")
	public void test5(String str) {
		assertTrue(StringFunctions.isPalindrome(str));
	}

	//method which provide the data to the test
	public static Stream<String> DPMethod() {
		return Stream.of("DAD", "racecar", "ABCBA");
	}
}
