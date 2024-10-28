package com.qualizeal.javaapp10.operation;

public class ArmstrongNumber {
	
	public String defineArmstrongNumber() {
		return "It is a number that is equal to the sum of its digits each raised to the power of the number of digits. ";
	}
	
	public String verifyIfNumberIsArmstrongOrNot(int number) {
		if (number < 0) {
			return "-1";
		} else if (number == 0) {
			return "-2";
		} else {
			int temp = number;
	        int numOfDigits = 0;
	        
	        while (temp > 0) {
	            temp /= 10;
	            numOfDigits++;
	        }
	        
	        temp = number;
	        int sum = 0;
	        
	        while (temp > 0) {
	            int digit = temp % 10; 
	            int power = 1; 
	            
	            for (int i = 0; i < numOfDigits; i++) {
	                power *= digit; 
	            }
	            
	            sum += power; 
	            temp /= 10; 
	        }

	        if (sum == number) {
	            return "Armstrong Number";
	        } else {
	            return "Not an Armstrong Number";
	        }
		}
	}
}
