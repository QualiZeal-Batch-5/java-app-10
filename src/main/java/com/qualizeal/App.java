package com.qualizeal.javaapp10.operation;
import com.qualizeal.javaapp10.operation.ArmstrongNumber;
public class App {
	public static void main(String[] args) {
       
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        String result1 = armstrongNumber.verifyIfNumberIsArmstrongOrNot(153);
        String result2 = armstrongNumber.verifyIfNumberIsArmstrongOrNot(0);
        String result3 = armstrongNumber.verifyIfNumberIsArmstrongOrNot(157);
        String result4 = armstrongNumber.verifyIfNumberIsArmstrongOrNot(-153);
         
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);



		
	}
}