package com.company;

import java.util.Scanner;

public class Infantil extends Menu{

    private Double precioSorpresa;

    public Infantil() {
    }

    @Override
    public void armarMenu() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el precio base:");
        super.setPrecioBase(scanner.nextDouble());
        System.out.println("Ingrese el precio de la Sorpresa: ");
        this.precioSorpresa = scanner.nextDouble();
    }

    @Override
    public Double calcularPrecio() {
        return super.getPrecioBase() + (this.precioSorpresa);
    }
}
