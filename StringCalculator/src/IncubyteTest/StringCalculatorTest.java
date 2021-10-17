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
	
	public void emptystringshouldreturnZero() throws Exception 
	{
        assertEquals(stringCalculator.add(""),0);   
    }
	
	 public void ReturnSingleValue() throws Exception 
	 {
	       assertEquals(stringCalculator.add("1"),1);
	 }
	 
	 public void DelimitedInTwoNoCommaReturnSum()throws Exception
	 {
		   	assertEquals(stringCalculator.add("2,3"),5);
	 }
	 
	 public void twoNumbersNewLineDelimitedReturnSum()throws Exception 
	 {
		   	assertEquals(stringCalculator.add("1\n2"),3);
	 }
	 
	 public void DelimitedthreeNumbersBothWayReturnSum() throws Exception
	 {
		   	assertEquals(stringCalculator.add("2,5,1"),8);
	 }
	 
	 @Test(expectedExceptions=Exception.class )
	   public void  negativeInputReturnsException() throws Exception {
	   	stringCalculator.add("-1");
	   }
	
	 public void ignoreInputGreaterThanThosand() throws Exception 
	 {
		 assertEquals(stringCalculator.add("30,30,1234"),60);
	 }
}
