package com.capgemini.fulltech.comandoif;

import javax.swing.JOptionPane;

public class Exercicio01_ValeTransporte {
	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Valor do Salário:"));
		double transporte = Double.parseDouble(JOptionPane.showInputDialog("Gasto com transporte:"));
		double desconto = 0;
		double vt = salario * 0.06;
		
		if (vt > transporte) {
			vt = transporte;
		}
	}
}
