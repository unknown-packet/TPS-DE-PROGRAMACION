package TP2.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primer Numero:");
        double primerNumero = sc.nextDouble();

        System.out.println("Segundo Numero: ");
        double segundoNumero = sc.nextDouble();

        Calculadora calculadora = new Calculadora(primerNumero, segundoNumero);

        System.out.println("1. Suma ");
        System.out.println("2. Resta ");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir ");
        int Opcion = sc.nextInt();

        switch (Opcion) {
            case 1:
                System.out.println("El resultado es: " + calculadora.sumar());
                break;
            case 2:
                System.out.println("El resultado es: " + calculadora.restar());
                break;
            case 3:
                System.out.println("El resultado es: " + calculadora.multiplicar());
                break;
            case 4:
                System.out.println("El resultado es: " + calculadora.dividir());
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }
}