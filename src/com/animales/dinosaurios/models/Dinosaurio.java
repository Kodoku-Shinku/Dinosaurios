package com.animales.dinosaurios.models;

public class Dinosaurio {
	
	private String nombre; 
	private String periodoGeologico; //Periodo geológico en el que vivió
	private double longitud; //Longitud en metros
	private double peso; //Peso en kilogramos
	private String dieta; // Tipo de dieta (carnívoro, herbívoro, omnívoro)
	
	//Constructor
	public Dinosaurio (String nombre, String periodoGeologico, double longitud, double peso, String dieta) 
	{
		this.nombre = nombre;
		this.periodoGeologico = periodoGeologico;
		this.longitud = longitud;
		this.peso = peso;
		this.dieta = dieta;
	}
	
	public void emitirSonido()
	{
		System.out.println("El dinosaurio hace un sonido...");
	}
	
	public void correr() {
		System.out.println("El dinosaurio corre... \n");
	}

	/** Método que regresa el nombre del dinosaurio
	 * @return el nombre del dinosaurio
	 */
	public String getNombre() {
		return nombre;
	}

	/** Método que establece el nombre del dinosaurio
	 * @param nombre a establecer para el dinosaurio
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** Método que regresa el periodo geológico en el que vivió el dinosaurio
	 * @return el periodoGeologico en el que vivió
	 */
	public String getPeriodoGeologico() {
		return periodoGeologico;
	}

	/** Método que establece el periodo geológico en el que vivió el dinosaurio
	 * @param periodoGeologico a establecer
	 */
	public void setPeriodoGeologico(String periodoGeologico) {
		this.periodoGeologico = periodoGeologico;
	}

	/** Método que regresa la longitud en metros del dinosaurio
	 * @return La longitud en metros
	 */
	public double getLongitud() {
		return longitud;
	}

	/** Método que establece la longitud en metros del dinosaurio
	 * @param longitud en metros a establecer
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	/**Método que regresa el peso en kilogramos del dinosaurio
	 * @return el peso en kilogramos del dinosaurio
	 */
	public double getPeso() {
		return peso;
	}

	/** Método que establece el peso en kilogramos del dinosaurio
	 * @param peso el peso a establecer
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/** Método que regresa el tipo de dieta del dinosaurio (carnívoro, hervívoro, omnívoro)
	 * @return la dieta del dinosaurio: carnívoro, hervívoro u ovnívoro
	 */
	public String getDieta() {
		return dieta;
	}

	/** Método que establece el tipo de dieta del dinosaurio
	 * @param dieta la dieta a establecer: carnívoro, hervívoro u ovnívoro
	 */
	public void setDieta(String dieta) {
		this.dieta = dieta;
	}
	

}
