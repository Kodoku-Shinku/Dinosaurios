package com.animales.dinosaurios.views;

import com.animales.dinosaurios.models.Dinosaurio;

public interface DinosauriosView {
	
	void mostrarDinosaurio(Dinosaurio dinosaurio);
	void agregarDinosaurioALista(Dinosaurio dinosaurio);
	void mostrarListaDinoasurios();
}