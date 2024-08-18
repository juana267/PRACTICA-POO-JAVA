package org.example;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        int nomVec1 [] ={1,2,3,4,5,6,7,8,9,10};
        persona nomVec2 [] ={new persona("Juan", "", 'M'),
                new persona("Pablito", "", 'M'),};

        System.out.println("Registro de Asistencia");
        Scanner leer=new Scanner(System.in);

        for (int p : nomVec1) {
            System.out.println(p);
        }

        for (persona p : nomVec2) {
            System.out.println("Esta presente " + p.nombre + " : ");
            p.fechaReg = new Date();
            p.setEstadoAsis(leer.nextLine());
        }

        System.out.println("Registro de Asistencia");
        for (persona p : nomVec2){
            System.out.println(p.getNombre() + " (Masculino) - " + p.getEstadoAsis() + " - " + p.fechaReg);
        }
        leer.close();
    }
}