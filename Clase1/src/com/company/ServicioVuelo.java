package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServicioVuelo {

    private List<Vuelo> vuelos = new ArrayList<>();

    public void busquedaVuelo(Date fechaDeSalida, Date fechaDeRetorno, String origen, String destino) {
        System.out.println("   ✈ Para la ida:");
        for (Vuelo vuelo: vuelos){
            if (fechaDeSalida.equals(vuelo.getFecha()) && origen.equals(vuelo.getOrigen()) && destino.equals(vuelo.getDestino())) {
                System.out.println("               " + vuelo.getIdVuelo());
            }
        }

        System.out.println("   ✈ Para la vuelta:");
        for (Vuelo vuelo: vuelos){
            if (fechaDeRetorno.equals(vuelo.getFecha()) && origen.equals(vuelo.getDestino()) && destino.equals(vuelo.getOrigen())) {
                System.out.println("               " + vuelo.getIdVuelo());
            }
        }
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }


}
