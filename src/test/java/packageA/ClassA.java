package packageA;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassA {
	
	@Tag("Sanity")
	@Test
	public void testA() {
		
		System.out.println("test A");
	}

}
