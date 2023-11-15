package com.animales.dinosaurios.controllers;


import java.util.List;
import java.text.Normalizer;
import java.util.ArrayList;

import com.animales.dinosaurios.models.Dinosaurio;
import com.animales.dinosaurios.views.DinosauriosView;
import com.animales.dinosaurios.utilities.DinosaurioListaManager;

public class DinosauriosController {

	private DinosauriosView vista;
	private DinosaurioListaManager listaManager;

    public DinosauriosController(DinosauriosView vista, DinosaurioListaManager listaManager) {
        this.vista = vista;
        this.listaManager = listaManager;
    }

    public void mostrarDinosaurio(Dinosaurio dinosaurio) {
        vista.mostrarDinosaurio(dinosaurio);
    }
    
    public void agregarDinosaurioALista(Dinosaurio dinosaurio) {
    	vista.agregarDinosaurioALista(dinosaurio);
    }
    
    public void mostrarListaDinosaurios() {
    	vista.mostrarListaDinoasurios();
    }
    
    public Dinosaurio buscarPorNombre(String nombre) {
        for (Dinosaurio dinosaurio : listaManager.obtenerDinosaurios()) {
            if (dinosaurio.getNombre().equalsIgnoreCase(nombre) || dinosaurio.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                return dinosaurio;
            }
        }
        return null; // No se encontró ningún dinosaurio con ese nombre
    }

    public List<Dinosaurio> filtrarPorPeriodoGeologico(String periodo) {
        List<Dinosaurio> dinosauriosFiltrados = new ArrayList<>();
        for (Dinosaurio dinosaurio : listaManager.obtenerDinosaurios()) {
        	String getPeriodoGeologico = Normalizer.normalize(dinosaurio.getPeriodoGeologico(), Normalizer.Form.NFD);
        	String cadenaSinAcentos = getPeriodoGeologico.replaceAll("[^\\p{ASCII}]", "");
            if (cadenaSinAcentos.equalsIgnoreCase(periodo)) {
                dinosauriosFiltrados.add(dinosaurio);
            }
        }
        return dinosauriosFiltrados;
    }
    
    public List<Dinosaurio> filtrarPorDieta(String dieta) {
        List<Dinosaurio> dinosauriosFiltrados = new ArrayList<>();
        for (Dinosaurio dinosaurio : listaManager.obtenerDinosaurios()) {
        	String limpiaCadena = Normalizer.normalize(dinosaurio.getDieta(), Normalizer.Form.NFD);
        	String dietaSinAcentos = limpiaCadena.replaceAll("[^\\p{ASCII}]", "");
            if (dietaSinAcentos.equalsIgnoreCase(dieta)) {
                dinosauriosFiltrados.add(dinosaurio);
            }
        }
        return dinosauriosFiltrados;
    }


}
