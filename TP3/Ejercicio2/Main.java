package TP3.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Suscripcion> suscripcions = new ArrayList<>();
        suscripcions.add(new PlanBasico("gicito9252@gmail.com",4671,8.99));
        suscripcions.add(new PlanFamiliar("yagan12706@gmail.com",3867,15.49,2,7.74));
        suscripcions.add(new PlanPremium("rayexip923s@gmial.com",6312,22.99,2.50));

        System.out.println();
        System.out.println("Reporte de Suscripciones Activas: ");
        System.out.println();

        double totalIngresos = 0;

        for (Suscripcion suscripcion: suscripcions){
            suscripcion.mostrarInfo();
            totalIngresos += suscripcion.calcularCostoMensual();
            System.out.println();
        }

        System.out.println();
        System.out.printf("Ingresos Totales Del Mes: $%.2f%n", totalIngresos);
        System.out.println();
    }
}