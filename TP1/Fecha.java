package TP1;

import java.util.Scanner;

public class Fecha {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int año;

        System.out.println("Ingrese el dia:");
        dia = sc.nextInt();

        System.out.println("Ingrese el mes:");
        mes = sc.nextInt();

        System.out.println("Ingrese el año:");
        año = sc.nextInt();

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12)
            System.out.println("Fecha invalida");
        else
        {
            System.out.println("Fecha: " + dia + "/" + mes + "/" + año);

            if (mes >= 1 && mes <= 3)
                System.out.println("Primer Trimestre");
            else if (mes >= 4 && mes <= 6)
                System.out.println("Segundo Trimestre");
            else if (mes >= 7 && mes <= 9)
                System.out.println("Tercer Trimestre");
            else if (mes >= 10 && mes <= 12)
                System.out.println("Cuarto Trimestre");
        }
    }
}