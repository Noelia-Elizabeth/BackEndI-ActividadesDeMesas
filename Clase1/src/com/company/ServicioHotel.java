package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServicioHotel {

    private List<Hotel> hoteles = new ArrayList<>();

    public void busquedaHotel(Date fechaDeSalida, Date fechaDeRetorno, String destino) {

        //hoteles.forEach(hotel -> {
        //    System.out.println("hola"); //REVISAR: No entra al bucle.
        //    if (fechaDeSalida.equals(hotel.getFechaDeEntrada()) && fechaDeRetorno.equals(hotel.getFechaDeSalida()) && destino.equals(hotel.getCiudad())) {
        //        System.out.println("               " + hotel.getNombre());
        //    }
        //});

        for (Hotel hotel: hoteles){
            //System.out.println("hola"); //REVISAR: No entra al bucle.
            if (fechaDeSalida.equals(hotel.getFechaDeEntrada()) && fechaDeRetorno.equals(hotel.getFechaDeSalida()) && destino.equals(hotel.getCiudad())) {
                System.out.println("               " + hotel.getNombre());
            }
        }
    }

    public List<Hotel> getHoteles() {
        return hoteles;
    }
}
