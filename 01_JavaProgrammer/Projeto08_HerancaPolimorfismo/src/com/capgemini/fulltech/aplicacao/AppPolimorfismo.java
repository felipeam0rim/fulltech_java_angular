package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.classes.Aluno;
import com.capgemini.fulltech.classes.Curso;
import com.capgemini.fulltech.classes.Funcionario;
import com.capgemini.fulltech.classes.Pessoa;
import com.capgemini.fulltech.enumeracoes.Sexos;

public class AppPolimorfismo {
 public static void main(String[] args) {
	 
	Pessoa p1 = new Pessoa("Beatrice", 24, Sexos.FEMININO);
	Pessoa p2 = new Funcionario("Gustavo", 31, Sexos.MASCULINO, "Ferreiro", 20000);
	
	p2.setNome("Eduardo");
	
	//Funcionario func = (Funcionario)p2;
	
	//func.setCargo("Motorista");
	
	if(p2 instanceof Funcionario) {
		((Funcionario)p2).setCargo("Analista");
		JOptionPane.showMessageDialog(null, p2.getDados());		
	}
	
	p2 = p1;
	JOptionPane.showMessageDialog(null, p2.getDados());
	
	p2 = new Aluno("Gerson", 40, Sexos.MASCULINO, 5000);
	
	if(p2 instanceof Aluno) {
		((Aluno)p2).setCurso(new Curso(110, "Java", 100, 1200.0));;		
	}
	
	
	JOptionPane.showMessageDialog(null, p2.getDados());
 }
}
