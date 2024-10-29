package com.qualizeal.javaapp10.operation;

public class ArmstrongNumber {

	public String defineArmstrongNumber() {
		return "An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.";
	}

	public String verifyIfNumberIsArmstrongOrNot(int number) {
		if (number < 0) {
			return "-1";
		} else if (number == 0) {
			return "-2";
		}

		int originalNumber = number;
		int sum = 0;
		int digits = 0;

		while (originalNumber > 0) {
			originalNumber /= 10;
			digits++;
		}

		originalNumber = number;

		while (originalNumber > 0) {
			int digit = originalNumber % 10;
			int power = 1;

			for (int i = 0; i < digits; i++) {
				power *= digit;
			}

			sum += power;
			originalNumber /= 10;
		}

		if (sum == number) {
			return "Armstrong Number";
		} else {
			return "Not an Armstrong Number";
		}
	}
}
