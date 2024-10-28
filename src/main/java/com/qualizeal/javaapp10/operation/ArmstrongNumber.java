package com.qualizeal.javaapp10.operation;

public class ArmstrongNumber {
	public String defineArmstrongNumber() {
		return "The Armstrong number is the number whose sum of each digit of the number powered to its total digits count is equal to the given number.";
	}
	public String verifyIfNumberIsArmstrongOrNot(int number1) {
		if (number1 < 0) {
			return "-1";
		} else if (number1 == 0) {
			return "-2";
		} else {
			int temp = number1;
	        int numOfDigits = 0;
	        
	        while (temp > 0) {
	            temp /= 10;
	            numOfDigits++;
	        }
	        
	        temp = number1;
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
 
	        if (sum == number1) {
	            return "Armstrong Number";
	        } else {
	            return "Not an Armstrong Number";
	        }
		}
	}
}


