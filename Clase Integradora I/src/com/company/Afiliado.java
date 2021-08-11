package com.company;

public class Afiliado extends Vendedor{

    public Afiliado(String nombre, int puntosAlcanzados, String categoria) {
        super(nombre, puntosAlcanzados, categoria);
    }

    public Afiliado() {
    }

    @Override
    public void vender(int cantidadVentas) {
        this.setPuntosAlcanzados((cantidadVentas * 15) + this.getPuntosAlcanzados());
    }

}
