package com.animales.dinosaurios.views;

import com.animales.dinosaurios.models.Dinosaurio;

public interface DinosauriosView {
	
	void mostrarDinosaurio(Dinosaurio dinosaurio);
	void eliminarDinosaurio(Dinosaurio dinosaurio);
	Dinosaurio buscarDinosaurio(String nombreDinosaurio);
}