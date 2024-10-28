package com.qualizeal.javaapp10.operation;

public class ArmstrongNumber {

   
    public String defineArmstrongNumber() {
        return "An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.";
    }

   
    public String verifyIfNumberIsArmstrongOrNot(int number) {
        if (number < 0) {
            return "-1"; 
        }
        if (number == 0) {
            return "-2"; 
        }

       
        int originalNumber = number;
        int countDigits = 0;
        int temp = number;

       
        while (temp > 0) {
            countDigits++;
            temp /= 10;
        }

       
        int sum = 0;
        temp = originalNumber; 

      
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1; 
            
        
            for (int i = 0; i < countDigits; i++) {
                power *= digit;
            }

          
            sum += power;
            temp /= 10;
        }

       
        if (sum == originalNumber) {
            return "Armstrong Number";
        } else {
            return "Not an Armstrong Number";
        }
    }
}
