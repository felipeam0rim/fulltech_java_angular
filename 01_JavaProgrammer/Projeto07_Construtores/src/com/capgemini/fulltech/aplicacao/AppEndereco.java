package com.capgemini.fulltech.aplicacao;

import com.capgemini.fulltech.classes.Endereco;

public class AppEndereco {
	public static void main(String[] args) {		
		Endereco endereco = new Endereco("Av. Rio Branco", "57654234", "Rio", 3000);

		
//		endereco.setLogradouro("Av. Rio Branco");
//		endereco.setNumero(3000);
//		endereco.setCep("5256789");
//		endereco.setCidade("Rio");
		
		String cep = endereco.getCep();
		System.out.println(cep);
		
		System.out.println(endereco.getDados());
	}
}
