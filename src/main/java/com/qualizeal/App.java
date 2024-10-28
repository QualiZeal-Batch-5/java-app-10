package com.qualizeal;

import com.qualizeal.javaapp10.operation.ArmstrongNumber;

public class App {
	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		
		System.out.println(armstrongNumber.verifyIfNumberIsArmstrongOrNot(153));
		System.out.println(armstrongNumber.verifyIfNumberIsArmstrongOrNot(-3));
		System.out.println(armstrongNumber.verifyIfNumberIsArmstrongOrNot(0));
		System.out.println(armstrongNumber.verifyIfNumberIsArmstrongOrNot(1504));
	}
}