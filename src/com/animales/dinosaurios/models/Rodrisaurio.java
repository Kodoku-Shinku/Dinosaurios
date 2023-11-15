package com.animales.dinosaurios.models;

public class Rodrisaurio extends Dinosaurio{
	public Rodrisaurio(String nombre, String periodoGeologico, double longitud, double peso, String dieta) {
	super(nombre,periodoGeologico,longitud,peso,dieta);
	}
	//Sobreescribe al metodo emitirSonido
	@Override 
	public void emitirSonido()
	{
		System.out.println("¡Rugido de Rodrisaurio! ");
		}
	@Override
	public void correr(){
		System.out.println("Rodrisaurio corre a 1 km/h");
	}
}
	


