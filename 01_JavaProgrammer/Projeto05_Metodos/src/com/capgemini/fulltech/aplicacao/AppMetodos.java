package com.capgemini.fulltech.aplicacao;

import com.capgemini.fulltech.metodos.Metodos;

public class AppMetodos {
	public static void main(String[] args) {
		
		double[] valores = {2.3, 4.5, 7.8, 9.0};
		
		double soma = Metodos.somarElementos(valores);
		
		System.out.println("Soma: " + soma);
		System.out.println("Soma: " + Metodos.somarElementos(valores));
	}
}
