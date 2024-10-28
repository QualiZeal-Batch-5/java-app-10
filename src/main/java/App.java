package com.qualizeal.javaapp10.operation;

import com.qualizeal.javaapp10.operation.ArmstrongNumber;

public class App{
	public static void main(String[] args){
		
		ArmstrongNumber armstrongNumber =  new ArmstrongNumber();
		
		String result1 = armstrongNumber.verifyIfNumberIsArmstrongOrNot(153);
		
		System.out.println(result1);
		
	}
}