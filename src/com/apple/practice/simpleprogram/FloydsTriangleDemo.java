package com.apple.practice.simpleprogram;

//Java program to print floyds triangle
public class FloydsTriangleDemo {

	
	public static void printFloydsTriangle(int num){
		
		int count = 1;
		for(int i=1; i<= num; i++){
			
			for(int j=1; j<=i; j++){
				System.out.print(count+" ");
				count++;
			}
			System.out.print("\n");
		}
		
	}
	
	public static void main(String[] args) {
		printFloydsTriangle(5);
	}

}
