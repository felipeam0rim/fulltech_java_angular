package com.capgemini.fulltech.repeticoes;

import javax.swing.JOptionPane;

public class Exercicio05_AdvinhaNumero {
	public static void main(String[] args) {
		int numero = (int)(Math.random() * 100) + 1;
		int x = 1, y = 100, tentativas = 0;
		//System.out.println(numero);
		
		while(true) {
			int palpite = Integer.parseInt(JOptionPane.
					showInputDialog("Informe um valor entre " + x + " e " + y));
			if (palpite < x || palpite > y) {
				JOptionPane.showMessageDialog(null,
						"Número Inválido! Informe um valor entre " + x + " e " + y);
				continue;
			}
			if (palpite == numero) {
				tentativas++;
				break;
			} else if(palpite < numero){
				x = palpite + 1;
			} else if(palpite > numero){
				y = palpite - 1;;
			}
			if(x == y){
				JOptionPane.showMessageDialog(null, "Número Incurralado");
				tentativas++;
				break;
			}
			tentativas++;
			System.out.println("Tentativas válidas: " + tentativas);
		}
		if(tentativas == 1) {
			JOptionPane.showMessageDialog(null, "Você é muito sortudo e acertou o número: " +
					numero + " em uma ÚNICA tentativa");	
		} else {
			JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número: " +
					numero + " em " + tentativas + " tentativas");			
		}
	}
}
