package com.qualizeal.javaapp10.operation;

public class ArmstrongNumber {
	
	public String defineArmstrongNumber() {
        return "An Armstrong number (also known as a narcissistic number) " +
               "is a number that is equal to the sum of its own digits each raised to the power of the number of digits.";
    }

    public String verifyIfNumberIsArmstrongOrNot(int number) {
        if (number < 0) {
            return "-1"; 
        }
        if (number == 0) {
            return "-2";
        }

        String numberStr = Integer.toString(number);
        int numDigits = numberStr.length();
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, numDigits);
            temp /= 10;
        }

        if (sum == number) {
            return "Armstrong Number";
        } else {
            return "Not an Armstrong Number";
        }
    }

    private int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

}
