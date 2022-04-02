package packageB;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassB {

	@Tag("Sanity")
	@Test	
	public void testB() {

		System.out.println("test B");
	}

}
