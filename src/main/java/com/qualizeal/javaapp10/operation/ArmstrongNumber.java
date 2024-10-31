package com.qualizeal.javaapp10.operation;

public class ArmstrongNumber {
	public void defineArmstrongNumber() {
		System.out.println("Number that is equal to the sum of its digits, each raised to the power of the number of digits");
	}
	public String verifyIfNumberIsArmstrongOrNot(int num) {
		if (num <0) {
			return "-1";
		}
		else if (num ==0) {
			return "-2";
		}
		else {
			int temp=num;
			int l = String.valueOf(num).length();
			int sum=0;
			while(temp!=0) {
				int rem = temp %10;
				
				int power=1;
				for(int i=0; i<l; i++) {
					power = power * rem ;
				}
				temp = temp /10;
				sum = sum + power ;
				
			}
			if (num == sum) {
				return "Armstrong Number";
			}
			else {
				return "Not an Armstrong Number";
			}
		}
		
	}

}
