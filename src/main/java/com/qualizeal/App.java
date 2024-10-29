package com.qualizeal;

import com.qualizeal.javaapp10.operation.ArmstrongNumber;

public class App {
    public static void main(String[] args) {
        ArmstrongNumber armstrongChecker = new ArmstrongNumber();
        
        int[] testInputs = {13, 1, 153, 120, 407, 290, 49};

        for (int input : testInputs) {
            String result = armstrongChecker.verifyIfNumberIsArmstrongOrNot(input);
            System.out.println("Input: " + input + " => Output: " + result);
        }

        String definition = armstrongChecker.defineArmstrongNumber();
        System.out.println("Definition: " + definition);
    }
}