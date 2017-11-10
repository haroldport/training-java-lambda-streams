package com.arquitecturajava.ejemplo008;

public class Ordenador {
	
	private String marca;
	private double precio;
	private int disco;
	private int memoria;
	
	public Ordenador() {
		super();
	}

	public Ordenador(String marca, double precio, int disco, int memoria) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.disco = disco;
		this.memoria = memoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDisco() {
		return disco;
	}

	public void setDisco(int disco) {
		this.disco = disco;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return "Ordenador [marca=" + marca + ", precio=" + precio + ", disco=" + disco + ", memoria=" + memoria + "]";
	}

}
