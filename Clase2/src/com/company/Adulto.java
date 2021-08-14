package com.company;

public class Adulto extends Menu{

    public Adulto(Double precioBase) {
        super(precioBase);
    }

    @Override
    public void armarMenu() {

    }

    @Override
    public Double calcularPrecio() {
        return super.getPrecioBase();
    }
}
