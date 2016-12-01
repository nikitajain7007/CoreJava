package com.apple.practice.simpleprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInArray {

	
	public static boolean isPresent(int num, int[] array2){
		
		for(int each : array2){
			if(each == num){
				return true;
			}
		}
		
		return false;
		
	}
	
	
	public static List<Integer> getMissingElements(int[] array1, int[] array2){
		List<Integer> missingElements = new ArrayList<Integer>();
		if(array1.length > array2.length){
			
			for(int each : array1){
				if(!isPresent(each, array2)){
					missingElements.add(each);
				}
			}
			
		}else{
			for(int each : array2){
				if(!isPresent(each, array1)){
					missingElements.add(each);
				}
			}
		}
		return missingElements;
	}
	
	
	
	public static void main(String[] args) {

		int[] array1 = {1,2,3,4,6,7,9};
		int[] array2 = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> missingElements = getMissingElements(array2, array1);
		System.out.println(missingElements.toString());
	}

}
