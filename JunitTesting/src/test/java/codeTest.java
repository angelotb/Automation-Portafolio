import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class codeTest {
	@Test
	public void testSayHello() {
		code code = new code();
		assertEquals("Hello world!", code.sayHello());
		
	}

}
