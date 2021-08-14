package com.company;

import java.util.ArrayList;
import java.util.Date;

public class ServicioVuelo {

    private ArrayList<Vuelo> vuelos = new ArrayList<>();

    public void busquedaVuelo(Date fechaDeSalida, Date fechaDeRetorno, String origen, String destino) {
        System.out.println("   ✈ Para la ida:");
        for (Vuelo vuelo: vuelos){
            System.out.println("hola"); //REVISAR: No entra al bucle.
            if (fechaDeSalida.equals(vuelo.getFecha()) && origen.equals(vuelo.getOrigen()) && destino.equals(vuelo.getDestino())) {
                System.out.println("               " + vuelo.getIdVuelo());
            }
        }

        System.out.println("   ✈ Para la vuelta:");
        for (Vuelo vuelo: vuelos){
            System.out.println("hola"); //REVISAR: No entra al bucle.
            if (fechaDeRetorno.equals(vuelo.getFecha()) && origen.equals(vuelo.getDestino()) && destino.equals(vuelo.getOrigen())) {
                System.out.println("               " + vuelo.getIdVuelo());
            }
        }
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }
}
