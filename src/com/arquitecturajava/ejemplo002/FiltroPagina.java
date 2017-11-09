package com.arquitecturajava.ejemplo002;

public class FiltroPagina implements FiltroLibro {

	@Override
	public boolean test(Libro libro) {
		return libro.getPaginas() > 400;
	}

}
