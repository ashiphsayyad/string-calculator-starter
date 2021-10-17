package IncubyteTest;

import org.testng.annotations.Test;

@Test
public class StringCalculator 
{
	private final String delimiter = ",|\n";

	 public int add(String input) throws Exception
	 {
		 String[] numbers = input.split(",|\n");
	    	
		 if(isEmpty(input)) {
	        	return 0;
	        }
		 
		 if(input.length() == 1) {
	        	return stringToInt(input);
	        }
		 else
	       return getSum(numbers);
	    }
	
	 	private boolean isEmpty(String input) {
	    	return input.isEmpty();
	    }
	    
	    private int stringToInt(String input) {
	    	 return Integer.parseInt(input);
	    }
	    
	    private int getSum(String [] numbers) throws Exception
	    {
	    	invalidInputs(numbers);
	    	int sum=0;
	    	for(String num:numbers)
	    	{
	    		sum = sum+stringToInt(num);
	    	}
	    	return sum;
	    }
	    
	    private void invalidInputs(String numbers[])throws Exception {
	    	for(String inp:numbers) {
	    		if(stringToInt(inp)<0) {
	    			throw new Exception("Invalid input Negative numbers not allowed");
	    		}
	    	}
	    }
	    
	    
	 
}
