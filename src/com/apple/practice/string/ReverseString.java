package com.apple.practice.string;

//Program to reverse a string
public class ReverseString {

	//Using String Builder
	public static String reverseString(String str){
		StringBuilder strBD = new StringBuilder(str);
		StringBuilder reverseStringSB = strBD.reverse();
		return reverseStringSB.toString();
	}
	
	//You can use for loop . Convert to char array and reverse the string
	
	public static void main(String[] args) {
		System.out.println("The reverse of - 'Nikita Jain' = "+reverseString("Nikita Jain"));
		
	}

}
