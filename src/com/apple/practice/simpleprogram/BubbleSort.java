package com.apple.practice.simpleprogram;

//Bubble sort 
//Not advised to use bubble sort because its performance is bad
public class BubbleSort {

	//assending order 
	public static int[] bubbleSortAsc(int[] arrayTobeSorted){
		
		for(int i=0; i < arrayTobeSorted.length ; i++){
			for(int j=1; j < (arrayTobeSorted.length)-i ; j++){
				if(arrayTobeSorted[j-1] > arrayTobeSorted[j] ){
					int temp = arrayTobeSorted[j-1];
					arrayTobeSorted[j-1] = arrayTobeSorted[j];
					arrayTobeSorted[j] = temp;
				}
			}
		}
		
		return arrayTobeSorted;
	}
	
	//assending order 
		public static int[] bubbleSortDec(int[] arrayTobeSorted){
			
			for(int i=0; i < arrayTobeSorted.length ; i++){
				for(int j=1; j < (arrayTobeSorted.length)-i ; j++){
					if(arrayTobeSorted[j-1] < arrayTobeSorted[j] ){
						int temp = arrayTobeSorted[j-1];
						arrayTobeSorted[j-1] = arrayTobeSorted[j];
						arrayTobeSorted[j] = temp;
					}
				}
			}
			
			return arrayTobeSorted;
		}
	
	public static void main(String[] args) {
		
		int[] arrayTobeSorted = {9,8,7,5,6};
		System.out.println("Array before sort : ");
		for(int each : arrayTobeSorted){
			System.out.print(each+" ");
		}
		
		System.out.println("\n"+"After sort in Assending : ");
		for(int each :bubbleSortAsc( arrayTobeSorted)){
			System.out.print(each+" ");
		}
		
		System.out.println("\n"+"After sort in Decending : ");
		for(int each :bubbleSortDec( arrayTobeSorted)){
			System.out.print(each+" ");
		}

	}

}
