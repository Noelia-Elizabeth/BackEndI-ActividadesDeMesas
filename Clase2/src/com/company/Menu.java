package com.company;

public abstract class Menu {

    private Double precioBase;

    public Menu() {
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public abstract void armarMenu();

    public abstract Double calcularPrecio();

}
