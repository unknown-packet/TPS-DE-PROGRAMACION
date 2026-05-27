package TP1;

import java.util.Scanner;

public class Parciales {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double parcial1;
        double parcial2;
        double parcial3;
        double promedio;

        System.out.println("Ingrese la nota del parcial 1:");
        parcial1 = sc.nextDouble();

        System.out.println("Ingrese la nota del parcial 2:");
        parcial2 = sc.nextDouble();

        System.out.println("Ingrese la nota del parcial 3:");
        parcial3 = sc.nextDouble();

        if (parcial1 < 0 || parcial1 > 10 || parcial2 < 0 || parcial2 > 10 || parcial3 < 0 || parcial3 > 10)
            System.out.println("Nota invalida");
        else
        {
            promedio = (parcial1 + parcial2 + parcial3) / 3;
            System.out.println("Promedio: " + promedio);

            if (promedio >= 8)
                System.out.println("Promocionado");
            else
                System.out.println("No promocionado");
        }
    }
}