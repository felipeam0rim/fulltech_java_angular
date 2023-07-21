package com.capgemini.fulltech.metodos;

public class Metodos {
	
	public static double somarElementos(double[] numeros) {
		double soma = 0;
		for (double item: numeros) {
			soma += item;
		}
		
		return soma;
	}
	
	public static void trocarElementos(double[] numeros) {
		if(numeros.length < 3) {
			throw new ArithmeticException("O array deve ter pelo menos 2 elementos");
		}
	}
}
