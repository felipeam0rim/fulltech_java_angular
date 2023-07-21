package com.capgemini.fulltech.repeticoes;

import javax.swing.JOptionPane;

public class Exercicio04_MostrarNumero {
	public static void main(String[] args) {
		
		while(true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
			if(numero == 0) {
				break;
			}
			System.out.println(numero);
		}
	}
}
