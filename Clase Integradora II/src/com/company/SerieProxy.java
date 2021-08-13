package com.company;

public class SerieProxy implements ISerie{

    private int cantVistas;
    private Serie serie;

    @Override
    public String getPelicula(String pelicula) throws Exception {
        if (this.cantVistas < 5) {
            return this.serie.getPelicula(pelicula);
        } else {
            throw new Exception("Lo lamento; alcanzaste el máximo de películas que podés pedir esta semana.");
        }
    }

}
