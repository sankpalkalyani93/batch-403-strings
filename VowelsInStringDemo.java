package com.example;

import java.util.Scanner;

public class VowelsInStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. Find the number of vowels in given string.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = scan.nextLine();
		
		int countOfVowles = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch =='E' || ch == 'I' || ch == 'O' || ch == 'U') {
				countOfVowles++;
			}
		}
		
		System.out.println("Count of Vowels => " + countOfVowles);
	}

}
