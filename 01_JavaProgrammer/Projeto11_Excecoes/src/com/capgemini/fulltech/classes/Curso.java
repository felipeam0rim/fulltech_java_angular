package com.capgemini.fulltech.classes;

import java.text.NumberFormat;

public class Curso {
	
	private int codigo;
	private String descricao;
	private int ch;
	private double preco;
	
	public Curso() {
		super();
	}
	
	public Curso(int codigo, String descricao, int ch) throws NoSuchFieldException, IllegalAccessException{
		this();
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCh(ch);
	}
	
	public Curso(int codigo, String descricao, int ch, double preco) throws NoSuchFieldException, IllegalAccessException{
		this(codigo, descricao, ch);
		this.setPreco(preco);
	}
	
	public int getCodigo() {
		if(codigo <= 0 || codigo % 10 != 0) {
			throw new  IllegalArgumentException("O código deve ser múltiplo de 10");
		}
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) throws NoSuchFieldException, IllegalAccessException{
		if(ch < 0) {
			throw new IllegalAccessException("A carga horária não foi informada corretamente");
		}
		if(ch < 4) {
			throw new NoSuchFieldException("A carga horária deve ser no mínimo 4 horas");
		}
		this.ch = ch;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		
		return this.getCodigo() + " - " + this.getDescricao();
	}

	public String getDados() {
		return new StringBuilder()
				.append("Dados do Curso: ")
				.append("\nCódigo: ").append(this.getCodigo())
				.append("\nDescrição: ").append(this.getDescricao())
				.append("\nCarga Horária: ").append(this.getCh())
				.append("\nPreço: ").append(NumberFormat.getCurrencyInstance().format(this.getPreco()))
				.toString();
	}	
}
