package com.animales.dinosaurios.principal;

import com.animales.dinosaurios.views.DinosauriosConsoleView;
import com.animales.dinosaurios.views.DinosauriosView;
import com.animales.dinosaurios.utilities.DinosaurioListaManager;

import java.util.Scanner;
import java.util.List;

import com.animales.dinosaurios.controllers.DinosauriosController;
import com.animales.dinosaurios.models.Dinosaurio;
import com.animales.dinosaurios.models.Tiranosaurio;
import com.animales.dinosaurios.models.Triceratops;
import com.animales.dinosaurios.models.Velociraptor;

public class Main {

	public static void main(String[] args) {
		
		DinosauriosView vista = new DinosauriosConsoleView();
		DinosaurioListaManager listaManager = new DinosaurioListaManager();
        DinosauriosController controller = new DinosauriosController(vista, listaManager);


        Dinosaurio tiranosaurio = new Tiranosaurio("Tyrannosaurus rex", "Cretácico", 12.3, 9000, "Carnívoro");
        Dinosaurio triceratops = new Triceratops("Triceratops horridus", "Cretácico", 8.0, 8000, "Herbívoro");
        Dinosaurio velociraptor = new Velociraptor("Velociraptor mongoliensis", "Cretácico", 2.0, 30, "Carnívoro");

        controller.mostrarDinosaurio(tiranosaurio);
        controller.mostrarDinosaurio(triceratops);
        controller.mostrarDinosaurio(velociraptor);
        
        controller.agregarDinosaurioALista(tiranosaurio);
        controller.agregarDinosaurioALista(triceratops);
        controller.agregarDinosaurioALista(velociraptor);
        
        controller.mostrarListaDinosaurios();
        
        listaManager.agregarDinosaurio(tiranosaurio);
        listaManager.agregarDinosaurio(triceratops);
        listaManager.agregarDinosaurio(velociraptor);
        
        listaManager.guardarEnArchivo("src/com/animales/dinosaurios/resources/dinosaurios.txt");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del dinosaurio que deseas buscar: \n");
        
		String nombre = sc.nextLine();
		Dinosaurio resultadoBusqueda = controller.buscarPorNombre(nombre);
			
		if(resultadoBusqueda == null) {
			System.out.println("El nombre del dinosaurio: '"+nombre+ "' no se encuentra en la base de datos. \n");
				
		}else {
			System.out.println("El dinosaurio resultado de la busqueda es: \n");
			controller.mostrarDinosaurio(resultadoBusqueda);
		}
		
        
        System.out.println("Ingresa el periodo geológico que deseas buscar: \n");
        
		String periodo = sc.nextLine();
		List<Dinosaurio> listaPorPeriodo = controller.filtrarPorPeriodoGeologico(periodo);
			
		if(listaPorPeriodo == null || listaPorPeriodo.size() == 0) {
			System.out.println("El periodo ingresado: '"+periodo+ "' no existe");
		
		}else {
			System.out.println("Los dinosaurios que viven en el periodo '" + periodo + "' son: \n");
			for(Dinosaurio dinosaurio : listaPorPeriodo) {
				System.out.println(dinosaurio.getNombre());
			}
		}
		
		System.out.println("\nIngresa la dieta que deseas buscar: \n");
        
		String dieta = sc.nextLine();
		List<Dinosaurio> listaPorDieta = controller.filtrarPorDieta(dieta);
			
		if(listaPorDieta == null || listaPorDieta.size() == 0) {
			System.out.println("La dieta ingresada: '"+dieta+ "' no existe");
		
		}else {
			System.out.println("Los dinosaurios con dieta '" + dieta + "' son: ");
			for(Dinosaurio dinosaurio : listaPorDieta) {
				System.out.println(dinosaurio.getNombre());
			}
		}		
		
		sc.close();
	}

}
