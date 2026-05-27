package TP3.Ejercicio4;

public class Smartphone extends Dispositivo implements ConectableWifi, Fotografiable {

    public Smartphone(String nombre) {
        super(nombre);
    }

    @Override
    public void conectarseWifi(String redWifi) {
        System.out.println("[" + getNombre() + "] Conectado a la red: " + redWifi);
    }

    @Override
    public void tomarFoto() {
        System.out.println("[" + getNombre() + "] Foto tomada.");
    }
}