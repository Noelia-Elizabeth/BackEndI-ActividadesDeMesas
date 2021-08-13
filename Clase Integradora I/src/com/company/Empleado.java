package com.company;

public class Empleado extends Vendedor{

    private int antiguedad = 0;
    private int cantidadNuevosAfiliados = 0;

    public Empleado(String nombre, int puntosAlcanzados, String categoria, int antiguedad) {
        super(nombre, puntosAlcanzados, categoria);
        this.antiguedad = antiguedad;
    }

    public Empleado() {
        super();
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getCantidadNuevosAfiliados() {
        return cantidadNuevosAfiliados;
    }

    public void setCantidadNuevosAfiliados(int cantidadNuevosAfiliados) {
        this.cantidadNuevosAfiliados = cantidadNuevosAfiliados;
    }

    public void conseguirAfiliado() {
        this.cantidadNuevosAfiliados++;
    }

    @Override
    public void vender(int cantidadVentas) {
        this.setPuntosAlcanzados((cantidadVentas * 5) + (this.cantidadNuevosAfiliados * 10) + (this.antiguedad * 5) + this.getPuntosAlcanzados());
    }
}
