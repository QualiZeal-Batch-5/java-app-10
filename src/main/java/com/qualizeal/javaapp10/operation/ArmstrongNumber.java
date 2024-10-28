package com.qualizeal.javaapp10.operation;

public class ArmstrongNumber {
	public String defineArmstrongNumber() {
		return "Given Number is equal to the sum of its own digits each raised to the power of the number of digits.";
	}
	
	public String verifyIfNumberIsArmstrongOrNot(int num) {
		if (num < 0) {
			return "-1";
		} else if (num == 0) {
			return "-2";
		} else {
			int temp = num;
	        int cntDigits = 0;
	        
	        while (temp > 0) {
	            temp /= 10;
	            cntDigits++;
	        }
	        
	        temp = num;
	        int sum = 0;
	        
	        while (temp > 0) {
	            int digit = temp % 10; 
	            int power = 1; 
	            
	            for (int i = 0; i < cntDigits; i++) {
	                power *= digit; 
	            }
	            
	            sum += power; 
	            temp /= 10; 
	        }

	        if (sum == num) {
	            return "Armstrong Number";
	        } else {
	            return "Not an Armstrong Number";
	        }
		}
	}

}
