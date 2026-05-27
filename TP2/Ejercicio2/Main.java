package TP2.Ejercicio2;

public class Main {
    public static void main (String[] args){
        Reloj reloj = new Reloj();
        reloj.establecerHora(10,30,45);
        reloj.mostrarHora(); //esto muestra la hora actual: 10:30:45
        reloj.avanzarSegundo();
        reloj.mostrarHora(); // esto muestra la hora avanzando 1 segundo: 10:30:46
    }
}
