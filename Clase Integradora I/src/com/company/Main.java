package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println(" ");
        System.out.println("⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗");

        //Desafío I
        Afiliado afiliado1 = new Afiliado();
        Empleado empleado1 = new Empleado();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un empleado: ");
        empleado1.setNombre(scanner.nextLine());
        System.out.println("Ingrese los puntos que tiene hasta el momento: ");
        empleado1.setPuntosAlcanzados(scanner.nextInt());
        System.out.println("Ingrese los años de antigüedad: ");
        empleado1.setAntiguedad(scanner.nextInt());

        //Empleado1 realiza una venta.
        empleado1.vender(1);
        //Empleado1 consigue un afiliado nuevo.
        empleado1.conseguirAfiliado();
        //Empleado1 consigue un afiliado nuevo.
        empleado1.conseguirAfiliado();
        //Empleado1 consigue un afiliado nuevo.
        empleado1.conseguirAfiliado();
        //Mostramos la categoría de empleado1.
        empleado1.mostrarCategoría();

        System.out.println("Ingrese el nombre de un afiliado: ");
        afiliado1.setNombre(scanner.next());
        System.out.println("Ingrese los puntos que tiene hasta el momento: ");
        afiliado1.setPuntosAlcanzados(scanner.nextInt());

        //Mostrar la categoría del afiliado1.
        afiliado1.mostrarCategoría();

        System.out.println("⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗");

        //Desafío II
        Pasante pasante1 = new Pasante();

        System.out.println("Ingrese el nombre de un pasante: ");
        pasante1.setNombre(scanner.next());
        System.out.println("Ingrese los puntos que tiene hasta el momento: ");
        pasante1.setPuntosAlcanzados(scanner.nextInt());

        //Se ingresa el nombre del pasante1.
        pasante1.setNombre("Pedrito");
        //Mostramos la categoría del pasante1.
        pasante1.mostrarCategoría();

        System.out.println("⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗⨗");

    }
}
