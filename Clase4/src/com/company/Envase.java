package com.company;

public class Envase extends CompruebaCalidad{


    @Override
    public void procesarPeticion(Articulo articulo) {
        if (articulo.getEnvasado().equals("sano") || articulo.getEnvasado().equals("casi sano")) {
            System.out.println("Todo válido.");
        } else {
            System.out.println("El artículo no es válido.");
        }
    }
}
