package com.qualizeal;

import com.qualizeal.javaapp10.operation.ArmstrongNumber;

public class App {
	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		System.out.println(armstrongNumber.defineArmstrongNumber());
		System.out.println(armstrongNumber.verifyIfNumberIsArmstrongOrNot(153));

	}
}