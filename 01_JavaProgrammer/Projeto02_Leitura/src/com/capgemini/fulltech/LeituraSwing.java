package com.capgemini.fulltech;

import javax.swing.JOptionPane;

public class LeituraSwing {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
		
		String resultado = "Nome: " + nome +
				"\nIdade: " + idade +
				"\nAltura: " + altura;
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}
