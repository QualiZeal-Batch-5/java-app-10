package com.qualizeal;

import com.qualizeal.javaapp10.operation.ArmstrongNumber;

public class App {
	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		String result = armstrongNumber.verifyIfNumberIsArmstrongOrNot(153);
		System.out.println(result);
	}
}