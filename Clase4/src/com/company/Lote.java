package com.company;

public class Lote extends CompruebaCalidad{

    @Override
    public void procesarPeticion(Articulo articulo) {
        if (articulo.getLote() > 1000 && articulo.getLote() < 2000) {
            this.getSiguienteControl();
        }
    }
}
