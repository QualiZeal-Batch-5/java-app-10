package com.qualizeal.javaapp10.operation;

public class ArmstrongNumber {
	
	public String defineArmstrongNumber() {
		return "Armstrong numbers are special numbers that are equal to the sum of their digits raised to the power of the number of digits. ";
	}
	
	public String verifyIfNumberIsArmstrongOrNot(int num){
		int temp = num;
		int count = 0;
		int sum = 0;
		
		if(num < 0) return "-1";
		
		else if(num == 0) return "-2";
		
		else{
			while (temp != 0){
				count++;
				temp = temp / 10;
			}
			
			temp = num;
			
			while (temp != 0){
				int rem = temp % 10;
				int armstrong = 1;
			
				for (int i = 0; i < count; i++){
					armstrong *= rem;
				}
				
				sum = sum + armstrong;
				temp = temp / 10;
			}			
		}
		if (sum == num){
			return "Armstrong Number";
		} 
		else{
	        return "Not an Armstrong Number";
		}
	}
}