package com.qualizeal.javaapp10.operation;

public class ArmstrongNumber {
	public String defineArmstrongNumber() {
		return "An armstrong number is a number that is equal to sum of cubes of its own digits.";
	}
	
	public String verifyIfNumberIsArmstrongOrNot(int num) {
		int number = num;
		int result = 0;
		int rem = 1;
		int res = 1;
		int count = 0;
		int cnt = 0;
		
		if(num == 0)
			return "-2";
		else if(num < 0)
			return "-1";
		else {
			while(num != 0) {
				num = num / 10;
				count++;
			}
			
			cnt = count;
			num = number;
			
			while(num != 0) {
				rem = num % 10;
				
				while(cnt != 0) {
				res = res * rem;
				cnt--;
				}
			
				result += res;
				cnt = count;
				num = num / 10;
				res = 1;
			}
			
			if(result == number)
				return "Armstrong Number";
			else
				return "Not an Armstrong Number";
			
		}
	}

}
