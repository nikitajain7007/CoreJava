package com.apple.practice.string;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicate {

	//Find duplicate character in a string and character count
	public static Map<Character, Integer> duplicatecharCount(String stringValue){
		Map<Character,Integer> duplicatecharCount = new HashMap<Character,Integer>();
		char[] charArray = stringValue.toCharArray();
		for(char c :  charArray){
			if(!Character.isWhitespace(c)){
				if(duplicatecharCount.containsKey(c)){
					int count = duplicatecharCount.get(c);
					duplicatecharCount.put(c, ++count);
				}else{
					duplicatecharCount.put(c, 1);
				}
			}
		}
		return duplicatecharCount;
	}
	
	public static void main(String[] args){
		Map<Character, Integer> duplicatecharCount = duplicatecharCount("Nikita  Jain");
		System.out.println("Entered String's character and its count "+duplicatecharCount.toString());
	}
}
