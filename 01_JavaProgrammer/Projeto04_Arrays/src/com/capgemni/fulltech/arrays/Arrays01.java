package com.capgemni.fulltech.arrays;

public class Arrays01 {
	public static void main(String[] args) {
		
		int[] numeros = new int[5];
		
		numeros[0] = 12;
		
		int[] numeros2 = {1, 2, 3};
		
		int[] numeros3;
		
		numeros3 = new int[]{1, 2, 3};
		
		for (int i = 0; i < numeros3.length; i++) {
			System.out.println(numeros3[i]);
		}
		
		System.out.println("-".repeat(10));
		
		for(int item : numeros2) {
			System.out.println(item);
		}
		
	}
}
