package com.capgemini.fulltech.classes;

public class Endereco {
	//atributos da classe
//	String logradouro, cep, cidade;
//	int numero;
	
//	public String logradouro, cep, cidade;
//	public int numero;
	
	private String logradouro, cep, cidade;
	private int numero;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getDados() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Logradouro: ").append(this.getLogradouro());
		sb.append("Número: ").append(this.getNumero());
		sb.append("Cidade: ").append(this.getCidade());
		sb.append("Cep: ").append(this.getCep());
		
		return sb.toString();
		
//		String resultado = "Logradouro: " + this.getLogradouro() +
//				"\nNúmero: " + this.getNumero() +
//				"\nCidade: " + this.getCidade() +
//				"\nCep: " + this.getCep();
	}
	
	
	
	
	
//	protected String logradouro, cep, cidade;
//	protected int numero;
}
