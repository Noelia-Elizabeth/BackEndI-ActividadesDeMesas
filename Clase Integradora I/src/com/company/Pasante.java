package com.company;

public class Pasante extends Vendedor{

    public Pasante(String nombre, int puntosAlcanzados, String categoria) {
        super(nombre, puntosAlcanzados, categoria);
    }

    public Pasante() {
    }

    @Override
    public void vender(int cantidadVentas) {
        this.setPuntosAlcanzados((cantidadVentas * 5) + this.getPuntosAlcanzados());
    }



}
