package com.animales.dinosaurios.views;

import java.util.ArrayList;
import java.util.List;

import com.animales.dinosaurios.models.Dinosaurio;

public class DinosauriosConsoleView implements DinosauriosView{
	
	private List<Dinosaurio> listaDinosaurios = new ArrayList<>();
	
	@Override
    public void mostrarDinosaurio(Dinosaurio dinosaurio) {
        System.out.println("Nombre: " + dinosaurio.getNombre());
        System.out.println("Período Geológico: " + dinosaurio.getPeriodoGeologico());
        System.out.println("Longitud: " + dinosaurio.getLongitud() + " metros");
        System.out.println("Peso: " + dinosaurio.getPeso() + " kg");
        System.out.println("Dieta: " + dinosaurio.getDieta());
        dinosaurio.emitirSonido();
        dinosaurio.correr();
    }

	@Override
	public void agregarDinosaurioALista(Dinosaurio dinosaurio) {
		listaDinosaurios.add(dinosaurio);
	}

	@Override
	public void mostrarListaDinoasurios() {
		System.out.println("A continuación se muestra la lista de dinosaurios: ");
		for(Dinosaurio dinosaurio: listaDinosaurios) {
			System.out.println(dinosaurio.getNombre());
		}
	}
	
}
