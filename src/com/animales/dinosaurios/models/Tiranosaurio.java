package com.animales.dinosaurios.models;

public class Tiranosaurio extends Dinosaurio{
	
	public Tiranosaurio(String nombre, String periodoGeologico, double longitud, double peso, String dieta) {
        super(nombre, periodoGeologico, longitud, peso, dieta);
    }

    @Override
    public void emitirSonido() {
        System.out.println("¡Rugido de tiranosaurio!");
    }
    
    @Override
    public void correr() {
    	System.out.println("Tyrannosaurus rex corre a 5 km/hr");
    }
    

}
