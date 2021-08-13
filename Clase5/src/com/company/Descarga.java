package com.company;

public class Descarga implements ServicioDescarga{

    @Override
    public void descargar(Usuario usuario) {
        System.out.println("Felicidades; tu canción se está descargando.");
    }
}
