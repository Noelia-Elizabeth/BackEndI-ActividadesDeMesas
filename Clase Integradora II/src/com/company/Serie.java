package com.company;

public class Serie implements ISerie{


    @Override
    public String getPelicula(String pelicula) {
        return "www." + pelicula.replace(" ","") + ".com";
    }


}
