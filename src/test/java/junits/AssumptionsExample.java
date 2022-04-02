package junits;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AssumptionsExample {

	@BeforeAll
	public static void setUp() {
		System.setProperty("ENV", "DEV");
	}
	
	@Test
	public void test1() {
		assumeTrue("DEV".equals(System.getProperty("ENV")));
	}
}
