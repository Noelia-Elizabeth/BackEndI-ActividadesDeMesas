package com.company;

import java.util.Date;

public class Facade {

    private ServicioVuelo servicioVuelo = new ServicioVuelo();
    private ServicioHotel servicioHotel = new ServicioHotel();

    public void buscar(Date fechaDeSalida, Date fechaDeRetorno, String origen, String destino) {
        System.out.println("⨮ Hoteles disponibles: ");
        //System.out.println(servicioHotel.getHoteles()); //Debug
        this.servicioHotel.busquedaHotel(fechaDeSalida, fechaDeRetorno, destino);
        System.out.println(" ");
        System.out.println("⨮ Vuelos disponibles: ");
        this.servicioVuelo.busquedaVuelo(fechaDeSalida,fechaDeRetorno,origen,destino);
    }

    public void agregar(Object object) {
        if (object instanceof Vuelo) {
            servicioVuelo.getVuelos().add((Vuelo) object);
        } else if (object instanceof Hotel) {
            servicioHotel.getHoteles().add((Hotel) object);
        }
    }
}
