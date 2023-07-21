package com.capgemini.fulltech.comandoif;

import javax.swing.JOptionPane;

public class Exercicio03_CaixaEletronico {
	public static void main(String[] args) {
		
		double valorSaque = Double.parseDouble(JOptionPane.
				showInputDialog("Digite o valor do saque:"));
		
		int valor = (int)valorSaque;
		
		int q50, q20, q10, q5;
		q50 = q20 = q10 = q5 = 0;
		
		if(valor % 5 != 0) {
			JOptionPane.showMessageDialog(null, "O valor deve ser múltiplo de 5!");
		} else {
		
		q50 = valor / 50;
		valor = valor % 50;
		
		q20 = valor / 20;
		valor = valor % 20;
		
		q10 = valor / 10;
		valor = valor % 10;
		
		q5 = valor / 5;
		
		String resposta = "Valor do saque: " + valorSaque +
				"\nNotas de 50: " + q50 +
				"\nNotas de 20: " + q20 +
				"\nNotas de 10: " + q10 +
				"\nNotas de 5: " + q5;
		
		JOptionPane.showMessageDialog(null, resposta);
		}
	}
}
