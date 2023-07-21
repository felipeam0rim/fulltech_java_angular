package com.capgemini.fulltech.repeticoes;

import javax.swing.JOptionPane;

public class Exercicio03_UsoDoWhile {
	public static void main(String[] args) {
		int numero = (int)(Math.random() * 10) + 1;
		
		do {
			System.out.println(numero);
			numero++;
		} while(numero < 5);
		
		JOptionPane.showMessageDialog(null, "FIM");
	}
}
