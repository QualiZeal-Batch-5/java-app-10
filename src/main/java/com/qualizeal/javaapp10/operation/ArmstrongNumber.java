package com.qualizeal.javaapp10.operation;

public class ArmstrongNumber {
	public String defineArmstrongNumber() {
		//definition of Armstrong number.
		return "An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.";
	}
	
	//method to calculate power.
	public int powerOf(int num1, int exponent) {
		int power = 1;
		for(int i = 0; i < exponent; ++i) {
			power *= num1;
		}
		return power;
	}
	
	public String verifyIfNumberIsArmstrongOrNot(int number) {
		
		//return -1, if the value passed as a parameter is a negative number.
		if(number < 0) {
			return "-1";
		}
		
		//return -2, if the value passed as a parameter is 0.
		if(number == 0) {
			return "-2";
		}
		
		//counting the number of digits in number.
		int NoOfDigits = 0;
		int temp = number;
		while(temp > 0) {
			temp = temp / 10;
			NoOfDigits++;
		}
		temp = number;
		int armstrongSum = 0;
		int digit;
		
		//Calculating sum of digits each raised to the power of the number of digits of number.
		while(temp != 0) {
			digit = temp % 10;
			armstrongSum += powerOf(digit, NoOfDigits);
			temp = temp / 10;
		}
		
		//Comparing number and Armstrongsum.
		if(number == armstrongSum) {
			return "Armstrong Number";
		}
		return "Not an Armstrong Number";
	}
}
