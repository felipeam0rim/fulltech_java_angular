package com.capgemni.fulltech.arrays;

public class Exercicio02_DiasRestantes {
	public static void main(String[] args) {
		/*int dia = Integer.parseInt("Informe o dia: ");
		int mes = Integer.parseInt("Digite o mês");
		int ano = Integer.parseInt("Digite o ano");*/
		
		int[][]calendario = new int[12][];
		
		for (int i = 0; i < calendario.length; i++) {
			for (int j = 0; j < calendario[i].length; j++) {
				if(i == 1) {
					calendario[i][j] = 28;
				} else if(i == 3 || i == 5 || i == 8 || i == 10) {
					calendario[i][j] = 30;
				} else {
					calendario[i][j] = 31;
				}
			}
		}
		
		System.out.println(calendario);
		
	}
}
