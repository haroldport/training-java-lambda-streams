package com.arquitecturajava.ejemplo008;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {
		
		Ordenador o1 = new Ordenador("Lenovo", 700, 256, 8);
		Ordenador o2 = new Ordenador("Apple", 1300, 256, 8);
		Ordenador o3 = new Ordenador("Dell", 1000, 512, 16);
		Ordenador o4 = new Ordenador("HP", 800, 512, 8);
		
		List<Ordenador> listaOrdenador = new ArrayList<>();
		listaOrdenador.add(o1);
		listaOrdenador.add(o2);
		listaOrdenador.add(o3);
		listaOrdenador.add(o4);
		
		listaOrdenador.stream()
					  .filter((o) -> o.getPrecio() >= 1000)
				      .map((o) -> o.getPrecio() * 1.21)
				      .reduce(Double::sum)
				      .ifPresent(System.out::println);
					 

	}

}
