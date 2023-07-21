package com.capgemini.fulltech.classes;

public class Endereco {
	//atributos da classe
//	String logradouro, cep, cidade;
//	int numero;
	
//	public String logradouro, cep, cidade;
//	public int numero;
	
	private String logradouro, cep, cidade;
	private int numero;
	
	public Endereco(String logradouro, String cep, String cidade, int numero) {
		this.setLogradouro(logradouro);
		this.setCep(cep);
		this.setCidade(cidade);
		this.setNumero(numero);
		
	}
	
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
		if(cep == null || cep.length() == 0) {
			throw new NullPointerException("Cep incorreto");
		}
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		if(cidade == null || cidade.length() == 0) {
			throw new NullPointerException("Cidade não informada corretamente");
		}
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
		
	}
	
	
	
	
	
//	protected String logradouro, cep, cidade;
//	protected int numero;
}
