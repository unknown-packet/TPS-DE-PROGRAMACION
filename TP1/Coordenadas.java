package TP1;

import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;

        System.out.println("Ingrese la coordenada de x: ");
        x = sc.nextDouble();

        System.out.println("Ingrese la coordenada de y: ");
        y = sc.nextDouble();

        if (x > 0 && y > 0)
            System.out.println("Primer cuadrante: ");
        else if (x < 0 && y > 0)
            System.out.println("Secundo cuandrete: ");
        else if (x < 0 && y < 0)
            System.out.println("Tercer cuadrante:");
        else if (x > 0 && y < 0)
            System.out.println("Cuarto cuadrante");
        else
            System.out.println("El punto esta sobre el eje");
    }
}