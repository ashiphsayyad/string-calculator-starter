package IncubyteTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class StringCalculatorTest {
	

	private StringCalculator stringCalculator;
	
	@BeforeTest
	public void init() {
		stringCalculator = new StringCalculator();
	}
	
	public void empty_string_should_return_0() throws Exception {
        assertEquals(stringCalculator.add(""),0);   
    }
	
}
