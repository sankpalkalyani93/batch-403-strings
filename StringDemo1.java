package com.example;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "apple";   /// string constant pool
		String s2 = "apple";   /// we have only one/ same reference to the apple
		String s3 = new String("apple");	// is created inside heap memory
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
	}

}
