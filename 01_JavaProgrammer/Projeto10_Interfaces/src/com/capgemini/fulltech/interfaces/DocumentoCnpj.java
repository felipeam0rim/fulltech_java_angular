package com.capgemini.fulltech.interfaces;

public class DocumentoCnpj implements Documento{
	
	private String numero;
	
	public DocumentoCnpj(String numero) {
		this.setNumero(numero);
	}

	@Override
	public void setNumero(String numero) {
		if(numero == null || !numero.matches("[0-9]{14}")) {
			throw new IllegalArgumentException("O CNPJ deve conter 14 dígitos numéricos.");
		}
		this.numero = numero;
	}

	@Override
	public String getInfoDocumento() {
		
		return "CNPJ: " + this.numero;
	}

}
