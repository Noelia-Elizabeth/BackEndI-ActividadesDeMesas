package com.company;

import java.util.Scanner;

public class Vegetariano extends Menu{

    private Double precioPackaging;
    private int cantidadCondimentos;

    public Vegetariano() {
    }

    @Override
    public void armarMenu() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el precio base:");
        super.setPrecioBase(scanner.nextDouble());
        System.out.println("Ingrese el precio del Packaging:");
        this.precioPackaging = scanner.nextDouble();
        System.out.println("Ingrese la cantidad de condimentos:");
        this.cantidadCondimentos = scanner.nextInt();
    }

    @Override
    public Double calcularPrecio() {
        return super.getPrecioBase() + this.precioPackaging + ((super.getPrecioBase() + this.precioPackaging) * cantidadCondimentos * 0.1);
    }
}
