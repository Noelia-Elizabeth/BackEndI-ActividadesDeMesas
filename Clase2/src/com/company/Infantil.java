package com.company;

public class Infantil extends Menu{

    private Double precioSorpresa;

    public Infantil(Double precioBase, Double precioSorpresa) {
        super(precioBase);
        this.precioSorpresa = precioSorpresa;
    }

    @Override
    public void armarMenu() {

    }

    @Override
    public Double calcularPrecio() {
        return null;
    }
}
