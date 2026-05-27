package TP3.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Dispositivo> dispositivos = new ArrayList<>();

        dispositivos.add(new CamaraSeguridad("Cámara Puerta Principal"));
        dispositivos.add(new Termostato("Termostato Comedor"));
        dispositivos.add(new Smartphone("Motorola G75 5G - Dueño"));

        System.out.println("~*~*~ CONTROLADOR - CONECTAR A WIFI ~*~*~");

        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo instanceof ConectableWifi) {
                ((ConectableWifi) dispositivo).conectarseWifi("Conectate");
            } else {
                System.out.println("["+ dispositivo.getNombre() +"] No tiene WiFi.");
            }
        }

        System.out.println("\n~*~*~ CONTROLADOR - TOMAR FOTOS ~*~*~");

        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo instanceof Fotografiable) {
                ((Fotografiable) dispositivo).tomarFoto();
            } else {
                System.out.println("[" + dispositivo.getNombre() + "] No puede tomar fotos.");
            }
        }
    }
}