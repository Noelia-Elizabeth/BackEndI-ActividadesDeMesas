package com.company;

public abstract class Menu {

    private Double precioBase;

    public Menu(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public abstract void armarMenu();

    public abstract Double calcularPrecio();

}
