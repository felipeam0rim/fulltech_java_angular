package com.capgemini.fulltech.classes;

public class Endereco {
	
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
		if(logradouro == null || logradouro.length() == 0) {
			throw new NullPointerException("Logradouro incorreto");
		}
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
		if(numero <= 0) {
			throw new IllegalArgumentException("O número deve ser positivo");
		}
		this.numero = numero;
	}
	
	
	
	public String getDados() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Logradouro: ").append(this.getLogradouro());
		sb.append("\nNúmero: ").append(this.getNumero());
		sb.append("\nCidade: ").append(this.getCidade());
		sb.append("\nCep: ").append(this.getCep());
		
		return sb.toString();
		
	}
	
	
	
	
	
//	protected String logradouro, cep, cidade;
//	protected int numero;
}
