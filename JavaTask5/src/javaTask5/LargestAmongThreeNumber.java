package javaTask5;

import java.util.Scanner;

public class LargestAmongThreeNumber {

	public static void main(String[] args) {
		int largest;
		int num1 = 20;
		int num2 = 30;
		int num3 = 25;
		if (num1 >= num2 && num1 >= num3) {
	            largest = num1;
	        } else if (num2 >= num1 && num2 >= num3) {
	            largest = num2;
	        } else {
	            largest = num3;
	        }
		
        System.out.println("The largest number is: " + largest);

	}

}
