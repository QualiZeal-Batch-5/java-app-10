package com.qualizeal.javaapp10.operation;
 
public class ArmstrongNumber {
 
    public String defineArmstrongNumber() {
        return "For a given number of digits 𝑛 n is a number that is equal to the sum of its own digits each raised to the power of 𝑛 n.";
    }
 
    public String verifyIfNumberIsArmstrongOrNot(int num1) {
        if (num1 < 0) {
            return "-1";
        } else if (num1 == 0) {
            return "-2";
        }
 
        int temp = num1, c = 0, temp1 = num1;
        while (temp != 0) {
            c++;
            temp /= 10;
        }
 
        int sum = 0, rem;
        while (temp1 != 0) {
            rem = temp1 % 10;
            int ams = 1;
            for (int i = 0; i < c; i++) {
                ams *= rem;
            }
            sum += ams;
            temp1 /= 10;
        }
 
        if (sum == num1) {
            return "Armstrong Number";
        } else {
            return "Not an Armstrong Number";
        }
    }
}
