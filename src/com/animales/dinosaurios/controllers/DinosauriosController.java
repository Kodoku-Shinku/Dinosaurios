package com.animales.dinosaurios.controllers;

import com.animales.dinosaurios.models.Dinosaurio;
import com.animales.dinosaurios.views.DinosauriosView;

public class DinosauriosController {

	private DinosauriosView vista;

    public DinosauriosController(DinosauriosView vista) {
        this.vista = vista;
    }

    public void mostrarDinosaurio(Dinosaurio dinosaurio) {
        vista.mostrarDinosaurio(dinosaurio);
    }
}
