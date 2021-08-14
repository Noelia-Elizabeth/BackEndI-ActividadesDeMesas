package com.company;

import java.util.Scanner;

public class Adulto extends Menu{

    public Adulto() {
    }

    @Override
    public void armarMenu() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el precio base:");
        super.setPrecioBase(scanner.nextDouble());
        System.out.println("Menú Adulto armando.");
    }

    @Override
    public Double calcularPrecio() {
        return super.getPrecioBase();
    }
}
