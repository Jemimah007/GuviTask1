package javaTask5;

import java.util.Scanner;

public class ReverseString {

	  public static void main(String args[])
	  {
	    String original, reverse = "";
	    Scanner input = new Scanner(System.in);

	    System.out.println("Enter a string to reverse");
	    original = input.nextLine();

	    int length = original.length();

	    for (int i = length - 1 ; i >= 0 ; i--)
	      reverse = reverse + original.charAt(i);

	    System.out.println("Reverse of the string: " + reverse);
	  }
	}