package com.capgemini.fulltech.repeticoes;

import javax.swing.JOptionPane;

public class Exercicio02_UsoWhile {
	public static void main(String[] args) {
		int numero = (int)(Math.random() * 10) + 1;
		
		while(numero < 5) {
			System.out.println(numero);
			numero++;
		}
		
		JOptionPane.showMessageDialog(null, "FIM");
	}
}
