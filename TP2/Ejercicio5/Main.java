package TP2.Ejercicio5;

public class Main {
    public static void main (String[] args){
        Empleados empleado1 = new Empleados("Lera Juan Pablo", 1000);

        empleado1.mostrarInformacion();

        empleado1.aumentarSalarioPorcentaje(5, "Buen Buen desempeño");

        System.out.println("Cantidad total de empleados: " + Empleados.obtenerCantidadEmpleados());
    }
}