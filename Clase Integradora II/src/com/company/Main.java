package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        SerieProxy serieProxy = new SerieProxy();

        try {
            System.out.println(" ");
            System.out.println("⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛");
            System.out.println("Ingrese la película a descargar:");
            System.out.println("⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩚⩛⩛");
            serieProxy.getPelicula(scanner.next());
            System.out.println("⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛");
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }

    }
}
