package com.apple.practice.string;

//Total no of occurrences of a given character
public class CountCharacterInString {

	public static int getCharacterCount(String str, char occurrenceChar){
		int count = 0;
		
		char[] strArray = str.toLowerCase().toCharArray();
		for(char c : strArray){
			if(c == occurrenceChar)
				count++;
		}
		
		return count;
	}
	
	//if asked without loop then just do replace char and catch the return 
	// int count = str.replace("a","");
	
	public static void main(String[] args) {
		System.out.println("The oocurrence of letter i in Nikita Jain is = "+getCharacterCount("Nikita Jain", 'i'));
	}

}
