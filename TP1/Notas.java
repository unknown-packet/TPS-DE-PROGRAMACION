package TP1;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.println("Ingrese la nota: ");
        nota = sc.nextDouble();

        if (nota < 0 || nota > 10)
            System.out.println("Nota invalida");
        else if (nota < 4)
            System.out.println("Desaprobo");
        else if (nota == 10)
            System.out.println("Sobresaliente");
        else
            System.out.println("Aprobado");
    }
}