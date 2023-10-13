package com.animales.dinosaurios.models;

public class Velociraptor extends Dinosaurio{
	
	public Velociraptor(String nombre, String periodoGeologico, double longitud, double peso, String dieta) {
        super(nombre, periodoGeologico, longitud, peso, dieta);
    }

    @Override
    public void emitirSonido() {
        System.out.println("¡Rugido de velociraptor!");
    }
    
    @Override
    public void correr() {
    	System.out.println("Velociraptor mongoliensis corre a 30 km/hr");
    }

}
