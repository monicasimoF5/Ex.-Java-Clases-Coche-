package org.msc;

public class Principal {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Renault", "Clio", 2007, 1000);
        Coche coche2 = new Coche("Seat", "Ibiza", 1999, 20000);
        Coche coche3 = new Coche("Peugeot", "308", 2010, 5000);

        Coche[] coches = {coche1, coche2, coche3};

        for (Coche coche : coches) {
            System.out.println(coche.mostrarInformación());
        }

        for (Coche coche : coches) {
            coche.conducir(100);
            System.out.println(coche.mostrarInformación());
        }
    }
}