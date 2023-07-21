package com.capgemni.fulltech.arrays;

import javax.swing.JOptionPane;

public class Exercicio01 {
	public static void main(String[] args) {
		
		int qTurmas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de turmas: "));
		int qAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de turmas: "));		
		
		double[][] turmas = new double[qTurmas][];
				
		for (int i = 0; i < turmas.length; i++) {
			turmas[i] = new double[qAlunos];
			for (int j = 0; j < turmas[i].length; j++) {
				turmas[i][j] = Double.parseDouble(JOptionPane.showInputDialog(String.format("Nota %d, turma %d", j+1, i+1)));			}
		}

	}
}
