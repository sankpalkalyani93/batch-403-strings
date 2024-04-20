package com.example;

public class StringMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("apple");
		String s2 = "apple";
		
		System.out.println(s1 + " equalsto " + s2 + " => " + (s1.equals(s2)));
		System.out.println(s1 == s2);
		
		System.out.println("substring demo : " + s1.substring(0, 3));
		System.out.println("concat demo : " + s1.concat(" is good for health."));
		
		System.out.println("Replace Demo : " + s1.replace('p', 'P'));
		System.out.println("s1 : " + s1);
		
		System.out.println("Contains Demo : " + s1.contains("pp"));
		System.out.println("Contains Demo : " + s1.contains("x"));
		
		System.out.println("length demo : " + s1.length());
		
		String s3 = "apple is good fruit";
		String[] elementsAfterSplitting = s3.split(" ");
		for(String s : elementsAfterSplitting) {
			System.out.println(s);
		}
	}

}
