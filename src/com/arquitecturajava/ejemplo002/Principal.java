package com.arquitecturajava.ejemplo002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Libro l1 = new Libro("Ciencia Ficcion", 400, "El Juego de Ender", 20);
		Libro l2 = new Libro("Fantasia", 600, "Harry Potter y el caliz de fuego", 25);
		Libro l3 = new Libro("Novela Negra", 300, "Las hijas del frio", 15);
		Libro l4 = new Libro("Historica", 1000, "Los pilares de la tierra", 40);
		
		List<Libro> lista = Arrays.asList(l1, l2, l3, l4);
		List<Libro> listaFiltrada = new ArrayList<>();
		
		//filtro(lista, listaFiltrada, new FiltroPrecio());
		filtro(lista, listaFiltrada, new FiltroPagina());
		
		//mostrarLibros(lista);
		mostrarLibros(listaFiltrada);

	}
	
	private static void filtro(List<Libro> lista, List<Libro> listaFiltrada, FiltroLibro f) {
		for(Libro l: lista) {
			if(f.test(l)) {
				listaFiltrada.add(l);
			}
		}
	}
	
	private static void mostrarLibros(List<Libro> lista) {
		for(Libro l: lista) {
			System.out.println(l.getTitulo());
		}
	}

}
