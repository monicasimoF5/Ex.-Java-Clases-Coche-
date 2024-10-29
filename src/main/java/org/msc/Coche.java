package org.msc;

public class Coche {
    private String marca;
    private String modelo;
    private int anyo;
    private double kilometraje;

    public Coche (String marcaCoche, String modeloCoche, int anyoCoche, double kmCoche) {
        this.marca = marcaCoche;
        this.modelo = modeloCoche;
        this.anyo = anyoCoche;
        this.kilometraje = kmCoche;
    }

    public void conducir (double km){
        this.kilometraje += km;
    }

    public String mostrarInformación() {
        return  marca + "  " + modelo + "  " + anyo + "  " + kilometraje;
    }


}
