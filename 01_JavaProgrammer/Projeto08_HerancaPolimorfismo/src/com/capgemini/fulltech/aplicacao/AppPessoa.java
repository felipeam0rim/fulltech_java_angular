package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.classes.Endereco;
import com.capgemini.fulltech.classes.Pessoa;
import com.capgemini.fulltech.enumeracoes.Sexos;

public class AppPessoa {
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Av. Rio Branco", "57654234", "Rio", 3000);
				
		Pessoa p1 = new Pessoa("Felipe", 28, Sexos.MASCULINO, endereco);
		
		JOptionPane.showMessageDialog(null, p1.getDados());
		
		Pessoa p2 = new Pessoa("Priscila", 30, Sexos.FEMININO, endereco);
		
		JOptionPane.showMessageDialog(null, p2.getDados());

		
	}
}
