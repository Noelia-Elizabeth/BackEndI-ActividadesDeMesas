package com.company;

public class Envase extends CompruebaCalidad{


    @Override
    public void procesarPeticion(Articulo articulo) {
        if (articulo.getEnvasado().equals("sano") && articulo.getEnvasado().equals("casi sano")) {
            this.getSiguienteControl();
        }
    }
}
