package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Adulto adulto = new Adulto();
        Infantil infantil = new Infantil();
        Vegetariano vegetariano = new Vegetariano();
        String volverAlPrincipio;

        do {
            System.out.println(" ");
            System.out.println("ʭ Bienvenido al sistema de Menúes ʭ");
            System.out.println(" ");

            System.out.println("Elija el tipo de menú que desea armar: \n" +
                    "⨺ Menú Adulto (1) \n" +
                    "⨺ Menú Infantil (2) \n" +
                    "⨺ Menú Vegetariano (3) \n ");

            int opcionElegida = scanner.nextInt();

            switch (opcionElegida) {
                case 1:
                    adulto.armarMenu();
                    break;
                case 2:
                    infantil.armarMenu();
                    break;
                case 3:
                    vegetariano.armarMenu();
                    break;
            }

            System.out.println("¡Pedido armado!");
            System.out.println(" ");
            System.out.println("Calculando precio...");
            System.out.println(" ");
            System.out.print("El precio de su Menú es de: ");

            switch (opcionElegida) {
                case 1:
                    System.out.println(adulto.calcularPrecio());
                    break;
                case 2:
                    System.out.println(infantil.calcularPrecio());
                    break;
                case 3:
                    System.out.println(vegetariano.calcularPrecio());
                    break;
            }

            System.out.println("¿Quiere volver a armar un Menú? s/n");
            volverAlPrincipio = scanner.next().toLowerCase(Locale.ROOT);
        } while (volverAlPrincipio.equals("s"));
    }
}
