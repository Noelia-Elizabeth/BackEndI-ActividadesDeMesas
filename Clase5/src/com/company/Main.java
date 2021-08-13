package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Usuario usuario1, usuario2, usuario3;
        Proxy proxy1 = new Proxy();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        try {
            usuario1 = new Usuario("Charly Garcia",1,"premium");
            usuario2 = new Usuario("Grisel",2,"free");
            usuario3 = new Usuario("",3,"free");

            System.out.println(" ");
            usuario1.peticionDescarga(proxy1);
            usuario2.peticionDescarga(proxy1);

            System.out.println("⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛");
            System.out.println("Ingrese el nombre del usuario");
            usuario3.setNombre(scanner.next());

            System.out.println("Ingrese el tipo de suscripción (free/premium):");
            usuario3.setTipoSuscripcion(scanner.next().toLowerCase(Locale.ROOT));

            System.out.println("⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛");
            System.out.println("Procesando Descarga...");
            System.out.println("⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛⩚⩛");

            usuario3.peticionDescarga(proxy1);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }




    }
}
