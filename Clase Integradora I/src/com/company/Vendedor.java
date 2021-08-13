package com.company;

public abstract class Vendedor {

    private String nombre;
    private int puntosAlcanzados = 0;
    private String categoria;

    public Vendedor(String nombre, int puntosAlcanzados, String categoria) {
        this.nombre = nombre;
        this.puntosAlcanzados = puntosAlcanzados;
        this.categoria = categoria;
    }

    public Vendedor() {

    }

    public int getPuntosAlcanzados() {
        return puntosAlcanzados;
    }

    public void setPuntosAlcanzados(int puntosAlcanzados) {
        this.puntosAlcanzados = puntosAlcanzados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void calcularPuntos() {
        if (this instanceof Pasante) {
            if (this.puntosAlcanzados < 50) {
                this.categoria = "Pasantes novatos";
            } else if (this.puntosAlcanzados >= 50) {
                this.categoria = "Pasantes aprendices";
            }
        } else {
            if (this.puntosAlcanzados < 20) {
                this.categoria = "Novatos";
            } else if (this.puntosAlcanzados >= 20 && this.puntosAlcanzados <= 30) {
                this.categoria = "Aprendices";
            } else if (this.puntosAlcanzados > 30 && this.puntosAlcanzados <= 40) {
                this.categoria = "Buenos";
            } else if (this.puntosAlcanzados > 40) {
                this.categoria = "Maestros";
            }
        }
    }

    public void mostrarCategoría() {
        this.calcularPuntos();
        System.out.println("El vendedor " + this.nombre + " es categoría: " + this.categoria);
    }

    public abstract void vender(int cantidadVentas);

}
