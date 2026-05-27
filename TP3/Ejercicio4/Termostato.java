package TP3.Ejercicio4;

public class Termostato extends Dispositivo implements ConectableWifi {

    public Termostato(String nombre) {
        super(nombre);
    }

    @Override
    public void conectarseWifi(String redWifi) {
        System.out.println("[" + getNombre() + "] Conectado a la red: " + redWifi);
    }
}