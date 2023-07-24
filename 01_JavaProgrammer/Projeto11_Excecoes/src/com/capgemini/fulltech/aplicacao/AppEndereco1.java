package com.capgemini.fulltech.aplicacao;

import com.capgemini.fulltech.classes.Endereco;

public class AppEndereco1 {
	public static void main(String[] args) {		

		try {
			Endereco endereco = new Endereco("Av. Rio Branco", "57654234", "Rio", 3000);
			endereco.setNumero(0);
			System.out.println(endereco.getDados());
			
		} catch (Exception e) { 
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
