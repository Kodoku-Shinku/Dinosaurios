package com.animales.dinosaurios.utilities;

import com.animales.dinosaurios.models.Dinosaurio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class DinosaurioListaManager {
	
	private List<Dinosaurio> dinosaurios = new ArrayList<>();
	
	public void agregarDinosaurio(Dinosaurio dinosaurio) {
		
		dinosaurios.add(dinosaurio);
	}
	
	public List<Dinosaurio> obtenerDinosaurios(){
		
		return dinosaurios;
	}
	
	public void guardarEnArchivo(String nombreArchivo) {
		
		try(FileWriter fileWriter = new FileWriter(nombreArchivo);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
			
			for(Dinosaurio dinosaurio: dinosaurios) {
				
				bufferedWriter.write(dinosaurio.getNombre() + "," + dinosaurio.getPeriodoGeologico() + "," +
						dinosaurio.getLongitud() + "," + dinosaurio.getPeso() + "," + dinosaurio.getDieta());
				
				bufferedWriter.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
