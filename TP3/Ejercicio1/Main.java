package TP3.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Vehiculo> flota = new ArrayList<>();

        flota.add(new Furgoneta("Mercedes","Spriter",120.0,1500.0));
        flota.add(new Furgoneta("Ford","Transit",95.0,900.0));
        flota.add(new Motocicleta("Honda","CB500F",45.0,500));
        flota.add(new Motocicleta("Yamaha","MT-07",60,700));

        System.out.println("~*~*~*~*~*~*~*~*~*~");
        System.out.println("REPORTE DE FLOTA");
        System.out.println("~*~*~*~*~*~*~*~*~*~");
        System.out.println();

        for (Vehiculo vehiculos: flota){
            vehiculos.mostrarInfo();
            System.out.println();
        }
        System.out.println("Total de Vehiculos: "+ flota.size());
    }
}
