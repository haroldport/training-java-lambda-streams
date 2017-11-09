package com.arquitecturajava.ejemplo002;

public class FiltroPrecio implements FiltroLibro {

	@Override
	public boolean test(Libro libro) {
		return libro.getPrecio() > 15;
	}

}
