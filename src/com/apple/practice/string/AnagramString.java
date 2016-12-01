package com.apple.practice.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Program to find if Stings are Anagram
public class AnagramString {

	//if Stings are Anagram using sort and equals method.
	public static boolean isAnagramUsingSortEqual(String string1, String string2){
		boolean isAnagram = true;
		
		String copyOfString1 = string1.replace(" ", "");
		String copyOfString2 = string2.replace(" ", "");
		
		if(copyOfString1.length() != copyOfString2.length()){
			isAnagram = false;
		}else{
			char[] string1Array = copyOfString1.toLowerCase().toCharArray();
			char[] string2Array = copyOfString2.toLowerCase().toCharArray();
			
			Arrays.sort(string1Array);
			Arrays.sort(string2Array);
			
			isAnagram = Arrays.equals(string1Array, string2Array);
			
		}
		
		return isAnagram;
	}
	
	//if String is anagram while iterative over
	public static boolean isAnagramIterative(String string1, String string2){
		
		boolean isAnagram = true;
		
		String copyString1 = string1.replace(" ", "").toLowerCase();
		String copyString2 = string2.replace(" ", "").toLowerCase();
		
		if(copyString1.length() != copyString2.length()){
			isAnagram = false;
		}else{
			char[] copyString1Array =  copyString1.toLowerCase().toCharArray();
			for(char c : copyString1Array){
				int index = copyString2.indexOf(c);
				if(index != -1){
					copyString2 = copyString2.substring(0,index) + copyString2.substring(index+1,copyString2.length());
				}else{
					isAnagram = false;
					break;
				}
			}
		}
		
		return isAnagram;
	}
	
	//if String is anagram using StringBuilder
	public static boolean isAnagramUsingStrBuilder(String string1, String string2){
		boolean isAnagram = true;
		
		String copyOfString1 = string1.replace(" ", "").toLowerCase();
		String copyOfString2 = string2.replace(" ", "").toLowerCase();
		
		if(copyOfString1.length() != copyOfString2.length()){
			isAnagram = false;
		}else{
			
			char[] copyOfString1Array = copyOfString1.toCharArray();
			StringBuilder string2SB = new StringBuilder(copyOfString2);
			
			for(char c : copyOfString1Array){
				// ""+c is because indexOf method takes only String arg
				int index = string2SB.indexOf(""+c);
				if(index != -1){
					string2SB = string2SB.deleteCharAt(index);
				}else{
					isAnagram = false;
					break;
				}
			}
			
		}
		
		return isAnagram;
	}
	
	//if String is anagram using HashMap
	public static boolean isAnagramUsingMap(String string1, String string2){
		boolean isAnagram = true;
		String copyOfString1 = string1.replace(" ", "").toLowerCase();
		String copyOfString2 = string2.replace(" ", "").toLowerCase();
		
		if(copyOfString1.length() != copyOfString2.length()){
			isAnagram = false;
		}else{
			char[] string1Array = copyOfString1.toCharArray();
			char[] string2Array = copyOfString2.toCharArray();
			
			Map<Character, Integer> duplicateCharCount = new HashMap<Character, Integer>();
			
			for(char c : string1Array){
				if(duplicateCharCount.containsKey(c)){
					int count = duplicateCharCount.get(c);
					duplicateCharCount.put(c, ++count);
				}else{
					duplicateCharCount.put(c, 1);
				}
			}
			
			
			for(char c : string2Array){
				if(duplicateCharCount.containsKey(c)){
					int count = duplicateCharCount.get(c);
					duplicateCharCount.put(c, --count);
				}else{
					isAnagram  = false;
					break;
				}
			}
			
			if(!isAnagram){
				for(int value : duplicateCharCount.values()){
					if(value != 0){
						isAnagram  = false;
						break;
					}
				}
			}
			
		}
		
		
		return isAnagram;
	}
	
	public static void main(String[] args) {
		
		//isAnagramUsingSortEqual
		System.out.println("Using Sort Equal");
		if(isAnagramUsingSortEqual("asd", "das"))
			System.out.println("Entered string are Anagram");
		else
			System.out.println("Not Anagram");
		System.out.println("*************************************");
		
		System.out.println("Using Iterative");
		//isAnagram Using Iterative
		if(isAnagramIterative("asd", "aaa"))
			System.out.println("Entered string are Anagram");
		else
			System.out.println("Not Anagram");
		System.out.println("*************************************");
		
		System.out.println("Using String Builder");
		//isAnagram Using StringBuilder
		if(isAnagramIterative("Mother In Law", "Hitler Woman"))
			System.out.println("Entered string are Anagram");
		else
			System.out.println("Not Anagram");
		System.out.println("*************************************");
		
		//isAnagram Using Map
		System.out.println("Using Map");
		if(isAnagramUsingMap("Mother In kaw", "Hitler Woman"))
			System.out.println("Entered string are Anagram");
		else
			System.out.println("Not Anagram");
		System.out.println("*************************************");
		
	}

}
