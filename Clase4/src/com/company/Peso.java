package com.company;

public class Peso extends CompruebaCalidad{

    @Override
    public void procesarPeticion(Articulo articulo) {
        if (articulo.getPeso() > 1200 && articulo.getPeso() < 1300) {
            this.getSiguienteControl().procesarPeticion(articulo);
        } else {
            System.out.println("El peso no válido.");
        }
    }
}
