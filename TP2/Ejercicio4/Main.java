package TP2.Ejercicio4;

public class Main {
    public static void main(String[] args){
        Libro libro = new Libro("Metamorfosis", "Franz Kafka", "9789871997322");

        libro.mostrarInformacion(); // muestra informacion del libro

        libro.prestar();
        libro.mostrarInformacion(); // muestra que el libro esta prestado

        libro.devolver();
        libro.mostrarInformacion(); // muestra que el libro ya esta devuelto
    }
}
