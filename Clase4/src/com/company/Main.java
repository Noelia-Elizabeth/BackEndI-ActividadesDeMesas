package com.company;

public class Main {

    public static void main(String[] args) {

        Articulo articulo1 = new Articulo("tijera",1500,1250,"sano");

        CompruebaCalidad comprueba = new Lote().setSiguienteControl((new Peso().setSiguienteControl(new Envase())));

        comprueba.procesarPeticion(articulo1);

    }
}
