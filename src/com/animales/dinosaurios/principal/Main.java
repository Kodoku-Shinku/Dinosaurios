package com.animales.dinosaurios.principal;

import com.animales.dinosaurios.views.DinosauriosConsoleView;
import com.animales.dinosaurios.views.DinosauriosView;
import com.animales.dinosaurios.controllers.DinosauriosController;
import com.animales.dinosaurios.models.Dinosaurio;
import com.animales.dinosaurios.models.Tiranosaurio;
import com.animales.dinosaurios.models.Triceratops;
import com.animales.dinosaurios.models.Velociraptor;
import com.animales.dinosaurios.models.Rodrisaurio;

public class Main {

	public static void main(String[] args) {
		DinosauriosView vista = new DinosauriosConsoleView();
        DinosauriosController controller = new DinosauriosController(vista);
        //instancias
        Dinosaurio tiranosaurio = new Tiranosaurio("Tyrannosaurus rex", "Cretácico", 12.3, 9000, "Carnívoro");
        Dinosaurio triceratops = new Triceratops("Triceratops horridus", "Cretácico", 8.0, 8000, "Herbívoro");
        Dinosaurio velociraptor = new Velociraptor("Velociraptor mongoliensis", "Cretácico", 2.0, 30, "Carnívoro");
        Dinosaurio rodrisaurio = new Rodrisaurio("Rodrisaurio Bebe","Cretacico", 0.5, 25,"Lechivoro");

        controller.mostrarDinosaurio(tiranosaurio);
        controller.mostrarDinosaurio(triceratops);
        controller.mostrarDinosaurio(velociraptor);
        controller.mostrarDinosaurio(rodrisaurio);

	}

}
