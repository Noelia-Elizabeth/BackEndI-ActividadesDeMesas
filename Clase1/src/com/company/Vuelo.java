package com.company;

import java.util.Date;

public class Vuelo {

    private int idVuelo;
    private Date fecha;
    private String origen;
    private String destino;
    //ServicioVuelo servicioVuelo = new ServicioVuelo();

    public Vuelo(int idVuelo, Date fecha, String origen, String destino, Facade facade) {
        this.idVuelo = idVuelo;
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        facade.agregar(this);
        //this.servicioVuelo.getVuelos().add(this);
    }

    public Date getFecha() {
        return fecha;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getIdVuelo() {
        return idVuelo;
    }
}
