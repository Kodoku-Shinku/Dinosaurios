package com.animales.dinosaurios.models;

public class Triceratops extends Dinosaurio{
	
	public Triceratops(String nombre, String periodoGeologico, double longitud, double peso, String dieta) {
        super(nombre, periodoGeologico, longitud, peso, dieta);
    }

    @Override
    public void emitirSonido() {
        System.out.println("¡Rugido de triceratops!");
    }
    
    @Override
    public void correr() {
    	System.out.println("Triceratops horridus corre a 10 km /hr \n");
    }

}
