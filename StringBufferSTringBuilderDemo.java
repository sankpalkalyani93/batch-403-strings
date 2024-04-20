package com.example;

public class StringBufferSTringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer str1 = new StringBuffer("apple");
		StringBuilder str2 = new StringBuilder("orange");
		
		System.out.println("str1 => " + str1 + " : str2 => " + str2);
		str1.append(" a day keeps doctor away.");
		System.out.println(str1);
		
		str2.append(" citrus fruit");
		System.out.println(str2);
		
		String str = new String("kiwi");
		str.concat(" also a citrus fruit");
		System.out.println(str);
	}

}
