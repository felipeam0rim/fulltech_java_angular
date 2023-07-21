package com.capgemini.fulltech.interfaces;

public class DocumentoCpf implements Documento {
	private String numero;
	
	public DocumentoCpf(String numero) {
		this.setNumero(numero);;
	}

	@Override
	public void setNumero(String numero) {
		if(numero == null || !numero.matches("[0-9]{11}")) {
			throw new IllegalArgumentException("O CPF deve conter 11 dígitos numéricos.");
		}
		this.numero = numero;
	}

	@Override
	public String getInfoDocumento() {
		
		return "CPF: " + this.numero;
	}
	
	
	
}
