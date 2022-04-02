package junits;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class AnnotationsExample {

	@BeforeAll
	//before all and after all annotations should be declared as static 
	//else runtime error will be thrown
	public static void beforeAll() {
		System.out.println("BeforeAll");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("Before Each");
	}

	@Test
	public void test1() {
		System.out.println("Inside test1");

		String[] array1 = { "One", "Two", "Three" };
		String[] array2 = { "One", "Two", "Three" };
		assertArrayEquals(array1, array2);

	}
	
	// To disable the test
	@Disabled
	@Test
	public void test2() {
		System.out.println("Inside test2");
		assertEquals("abc", "abc");
	}

	// If we want to execute the same test multiple times 
	@RepeatedTest(2)
	@Test
	public void test3() {
		System.out.println("Inside test2");
		assertEquals("abc", "abc");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("After Each");
	}
}
