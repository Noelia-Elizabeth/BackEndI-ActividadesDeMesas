package com.company;

public class Vegetariano extends Menu{

    private Double precioPackaging;
    private int cantidadCondimentos;

    public Vegetariano(Double precioBase, Double precioPackaging, int cantidadCondimentos) {
        super(precioBase);
        this.precioPackaging = precioPackaging;
        this.cantidadCondimentos = cantidadCondimentos;
    }

    @Override
    public void armarMenu() {

    }

    @Override
    public Double calcularPrecio() {
        return null;
    }
}
