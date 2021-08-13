package com.company;

public class SerieProxy implements ISerie{

    private int cantVistas = 0;
    private Serie serie;

    @Override
    public String getPelicula(String pelicula) throws SerieNoHabilitadaException {
        if (this.serie == null) {
            this.serie = new Serie();
        }
        if (this.cantVistas < 5) {
            cantVistas++;
            return this.serie.getPelicula(pelicula);
        } else {
            throw new SerieNoHabilitadaException("Lo lamento; alcanzaste el máximo de películas que podés pedir esta semana.");
        }
    }

}
