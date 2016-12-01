package com.apple.practice;

//Java program to count number of words in a String
public class WordsInStringCount {

	public static int getWordsCount(String str){
		int count = 0;
		
		String[] strArray = str.split(" ");
		count = strArray.length;
		return count;
	}
	
	public static void main(String[] args) {

		System.out.println("Number of words in given String = "+getWordsCount("Hi I'm  Nikita Jain"));
		
	}

}
