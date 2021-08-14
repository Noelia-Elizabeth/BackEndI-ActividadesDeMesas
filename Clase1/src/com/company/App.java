package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class App {

    public static void main(String[] args) {

        Facade facade = new Facade();
        Hotel hotel1 = new Hotel(new Date(15/02/2022),new Date(11/3/2022),"Bariloche", "Paraíso en Bariloche");
        Hotel hotel2 = new Hotel(new Date(15/02/2022),new Date(11/3/2022),"Mendoza","Paraíso en Mendoza");
        Vuelo vuelo1 = new Vuelo(1,new Date(15/02/2022),"Mendoza", "Bariloche");
        Vuelo vuelo2 = new Vuelo(2,new Date(11/3/2022),"Bariloche", "Mendoza");

        //Implementación de la calse Facade
        System.out.println(" ");
        System.out.println("Empleamos la clase Facade: ");
        System.out.println(" ");
        facade.buscar(new Date(15/02/2022),new Date(11/3/2022),"Mendoza", "Bariloche");

    }

}
