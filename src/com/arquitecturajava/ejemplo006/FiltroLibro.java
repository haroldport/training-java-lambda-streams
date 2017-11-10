package com.arquitecturajava.ejemplo006;

public class FiltroLibro {
	
	public static boolean cienciaFiccion(Libro l) {
		return l.getCategoria().toLowerCase().equals("ciencia ficcion");
	}

	public static boolean libroCaro(Libro l) {
		return l.getPrecio() > 15;
	}
}
