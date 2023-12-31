package com.capgemini.fulltech.classes;

import com.capgemini.fulltech.enumeracoes.Sexos;

public class Pessoa {
	
	private String nome;
	private int idade;
	private Sexos sexo;
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Sexos getSexo() {
		return sexo;
	}
	public void setSexo(Sexos sexo) {
		this.sexo = sexo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getDados() {
		
		StringBuilder sb = new StringBuilder("Nome: ").append(this.getNome())
				.append("Idade: ").append(this.getIdade())
				.append("Sexo: ").append(this.getSexo())
				.append("Endereço: ").append(this.getEndereco().getDados());
		if(this.getEndereco() != null) {
			
		}
		
		return sb.toString();
	}
	
}
