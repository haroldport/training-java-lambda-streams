package com.arquitecturajava.ejemplo002;

public class Libro {
	
	private String categoria;
	private int paginas;
	private String titulo;
	private double precio;
	
	public Libro(String categoria, int paginas, String titulo, double precio) {
		super();
		this.categoria = categoria;
		this.paginas = paginas;
		this.titulo = titulo;
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
