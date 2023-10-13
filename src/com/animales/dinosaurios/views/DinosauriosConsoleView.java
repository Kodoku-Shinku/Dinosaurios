package com.animales.dinosaurios.views;

import com.animales.dinosaurios.models.Dinosaurio;

public class DinosauriosConsoleView implements DinosauriosView{
	
	@Override
    public void mostrarDinosaurio(Dinosaurio dinosaurio) {
        System.out.println("Nombre: " + dinosaurio.getNombre());
        System.out.println("Período Geológico: " + dinosaurio.getPeriodoGeologico());
        System.out.println("Longitud: " + dinosaurio.getLongitud() + " metros");
        System.out.println("Peso: " + dinosaurio.getPeso() + " kg");
        System.out.println("Dieta: " + dinosaurio.getDieta());
        dinosaurio.emitirSonido();
        dinosaurio.correr();
        System.out.println("");
    }

	@Override
	public void eliminarDinosaurio(Dinosaurio dinosaurio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dinosaurio buscarDinosaurio(String nombreDinosaurio) {
		// TODO Auto-generated method stub
		return null;
	}
}
