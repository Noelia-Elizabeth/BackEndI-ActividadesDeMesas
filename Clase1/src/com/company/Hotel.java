package com.company;

import java.util.Date;

public class Hotel {

    private Date fechaDeEntrada;
    private Date fechaDeSalida;
    private String ciudad;
    private String nombre;
    //ServicioHotel servicioHotel = new ServicioHotel();

    public Hotel(Date fechaDeEntrada, Date fechaDeSalida, String ciudad, String nombre, Facade facade) {
        this.fechaDeEntrada = fechaDeEntrada;
        this.fechaDeSalida = fechaDeSalida;
        this.ciudad = ciudad;
        this.nombre = nombre;
        facade.agregar(this);
        //this.servicioHotel.getHoteles().add(this);
        //this.servicioHotel.getHoteles().forEach(element ->
        //        System.out.println("Soy un hotel " + element.getNombre())
        //);
    }

    public Hotel(Date fechaDeEntrada, Date fechaDeSalida, String ciudad, String nombre) {
        this.fechaDeEntrada = fechaDeEntrada;
        this.fechaDeSalida = fechaDeSalida;
        this.ciudad = ciudad;
        this.nombre = nombre;
    }

    public Date getFechaDeEntrada() {
        return fechaDeEntrada;
    }

    public Date getFechaDeSalida() {
        return fechaDeSalida;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getNombre() {
        return nombre;
    }
}
