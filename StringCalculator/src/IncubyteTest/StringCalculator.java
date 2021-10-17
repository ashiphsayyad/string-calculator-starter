package IncubyteTest;

import org.testng.annotations.Test;

@Test
public class StringCalculator 
{

	 public int add(String input)
	 {
		 String[] numbers = input.split(",");
	    	
		 if(isEmpty(input)) {
	        	return 0;
	        }
		 
		 if(input.length() == 1) {
	        	return stringToInt(input);
	        }
		 else
	       return getSum(numbers[0],numbers[1]);
	    }
	
	 	private boolean isEmpty(String input) {
	    	return input.isEmpty();
	    }
	    
	    private int stringToInt(String input) {
	    	 return Integer.parseInt(input);
	    }
	    
	    private int getSum(String no1, String no2)
	    {
	    	return Integer.parseInt(no1) + Integer.parseInt(no2);
	    }
	    
	    
	 
}
