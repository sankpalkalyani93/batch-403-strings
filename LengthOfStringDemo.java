package com.example;

import java.util.Scanner;

public class LengthOfStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. WAP to find the length of string without using length property.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = scan.nextLine();
		
		int tempLength = 0;
		for(char c : str.toCharArray()) {
			tempLength++;
		}
		System.out.println("Length of string : " + tempLength);
	}

}
