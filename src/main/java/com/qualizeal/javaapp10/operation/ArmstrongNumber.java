package com.qualizeal.javaapp10.operation;

public class ArmstrongNumber {
	public String defineArmstrongNumber() {
		
		return "Given Number is equal to the sum of its own digits each raised to the power of the number of digits.";
	}

	public String verifyIfNumberIsArmstrongOrNot(int number1) {

		  if (number1 < 0) {
			
			return "-1";
			
		  } 
		  else if (number1 == 0) {
			
			return "-2";
			
		  } 
		  else {
			  
			String s =  String.valueOf(number1);
			int len  = s.length(),temp = number1;
			double sum = 0.0;
			
            while(temp != 0) {
            	
                 int rem = temp % 10;
                 sum += Math.pow(rem, len);
                 temp /= 10;
            }

			if ((int)sum == number1) {
		
				return "Armstrong Number";
				
			} 
			else {
				
				return "Not an Armstrong Number";
			}
		}
	}
}
