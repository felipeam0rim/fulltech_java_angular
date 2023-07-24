package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.classes.Aluno;
import com.capgemini.fulltech.classes.Curso;
import com.capgemini.fulltech.classes.Funcionario;
import com.capgemini.fulltech.classes.Pessoa;
import com.capgemini.fulltech.enumeracoes.Sexos;
import com.capgemini.fulltech.interfaces.DocumentoCnpj;

public class AppPolimorfismo {
 public static void main(String[] args) {
	 
	try {
		Pessoa p2 = new Funcionario(
				"Gustavo",
				31,
				Sexos.MASCULINO,
				"Ferreiro",
				new DocumentoCnpj("79756899000127"),
				20000);
		
		p2.setNome("Eduardo");
		
		if(p2 instanceof Funcionario) {
			((Funcionario)p2).setCargo("Analista");
			JOptionPane.showMessageDialog(null, p2.getDados());		
		}
		
		p2 = new Aluno("Gerson", 40, Sexos.MASCULINO, 5000);
		
		if(p2 instanceof Aluno) {
			((Aluno)p2).setCurso(new Curso(110, "Java", 100, 1200.0));;		
		}
		
		mostrarPessoa(p2);
		
		
		JOptionPane.showMessageDialog(null, p2.getDados());
		
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
 	private static void mostrarPessoa(Pessoa pessoa) {
 		JOptionPane.showMessageDialog(null, pessoa.getDados());
 }
}
