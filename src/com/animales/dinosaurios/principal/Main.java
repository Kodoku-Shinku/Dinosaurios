package com.animales.dinosaurios.principal;

import com.animales.dinosaurios.views.DinosauriosConsoleView;
import com.animales.dinosaurios.views.DinosauriosView;
import com.animales.dinosaurios.controllers.DinosauriosController;
import com.animales.dinosaurios.models.Dinosaurio;
import com.animales.dinosaurios.models.Tiranosaurio;
import com.animales.dinosaurios.models.Triceratops;
import com.animales.dinosaurios.models.Velociraptor;

public class Main {

	public static void main(String[] args) {
		DinosauriosView vista = new DinosauriosConsoleView();
        DinosauriosController controller = new DinosauriosController(vista);

        Dinosaurio tiranosaurio = new Tiranosaurio("Tyrannosaurus rex", "Cretácico", 12.3, 9000, "Carnívoro");
        Dinosaurio triceratops = new Triceratops("Triceratops horridus", "Cretácico", 8.0, 8000, "Herbívoro");
        Dinosaurio velociraptor = new Velociraptor("Velociraptor mongoliensis", "Cretácico", 2.0, 30, "Carnívoro");

        controller.mostrarDinosaurio(tiranosaurio);
        controller.mostrarDinosaurio(triceratops);
        controller.mostrarDinosaurio(velociraptor);

	}

}
