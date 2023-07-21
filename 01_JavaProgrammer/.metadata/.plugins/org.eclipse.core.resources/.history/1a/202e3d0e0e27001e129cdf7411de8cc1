package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.classes.Endereco;
import com.capgemini.fulltech.classes.Pessoa;
import com.capgemini.fulltech.enumeracoes.Sexos;

public class AppPessoa {
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Av. Rio Branco", "57654234", "Rio", 3000);
		
//		endereco.setLogradouro("Av. Rio Branco");
//		endereco.setNumero(3000);
//		endereco.setCep("5256789");
//		endereco.setCidade("Rio");
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Felipe");
		pessoa.setIdade(28);
		pessoa.setSexo(Sexos.MASCULINO);
		pessoa.setEndereco(endereco);
		
		JOptionPane.showMessageDialog(null, pessoa.getDados());
		
	}
}
