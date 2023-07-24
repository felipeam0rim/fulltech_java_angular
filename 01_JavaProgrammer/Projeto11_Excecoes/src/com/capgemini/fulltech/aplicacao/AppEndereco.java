package com.capgemini.fulltech.aplicacao;

import com.capgemini.fulltech.classes.Endereco;

public class AppEndereco {
	public static void main(String[] args) {		

		try {
			Endereco endereco = new Endereco("Av. Rio Branco", "57654234", "Rio", 0);
			endereco.setNumero(0);
			System.out.println(endereco.getDados());
			
		} catch (NullPointerException e) { 
			System.out.println("Erro de referência nula: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Erro numérico: " + e.getMessage());
		}
		
	}
}
