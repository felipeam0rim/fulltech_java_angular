package com.capgemini.fulltech.figuras;

public class Retangulo extends Figura{
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		
		return this.getAltura() * this.getBase();
	}
	
	
}
