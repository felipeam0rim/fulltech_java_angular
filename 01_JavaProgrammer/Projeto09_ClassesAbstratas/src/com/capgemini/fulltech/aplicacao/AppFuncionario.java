package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.classes.Endereco;
import com.capgemini.fulltech.classes.Funcionario;
import com.capgemini.fulltech.enumeracoes.Sexos;

public class AppFuncionario {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Tv. A", "6574890", "Rio", 5000);
		
		Funcionario funcionario = new Funcionario("Raul", 25, Sexos.MASCULINO, "Motorista", 5000);
		
		funcionario.setEndereco(endereco);
		
		JOptionPane.showMessageDialog(null, funcionario.getDados());
		
		
		
	}
}
