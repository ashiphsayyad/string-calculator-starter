package IncubyteTest;

import org.testng.annotations.Test;

@Test
public class StringCalculator 
{
	private final String delimiter = ",|\n";

	 public int add(String input)
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
	    
	    private int getSum(String [] numbers)
	    {
	    	int sum=0;
	    	for(String num:numbers) {
	    		if(stringToInt(num)>1000) {
    			continue;
    		}
	    		sum = sum+Integer.parseInt(num);
	    	}
	    	return sum;
	    }
	    
	    
	 
}
