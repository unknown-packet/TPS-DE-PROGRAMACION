package TP1;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int a;
        int b;
        int c;
        int equilatero = 0;
        int isosceles  = 0;
        int escaleno   = 0;
        int i = 1;

        System.out.print("Ingrese la cantidad de triangulos: ");
        n = sc.nextInt();

        while (i <= n)
        {
            System.out.println("\n--- Triangulo " + i + " ---");
            System.out.print("Lado a: ");
            a = sc.nextInt();
            System.out.print("Lado b: ");
            b = sc.nextInt();
            System.out.print("Lado c: ");
            c = sc.nextInt();

            if (a == b && b == c)
            {
                System.out.println("Equilatero");
                equilatero++;
            }
            else if (a == b || b == c || a == c)
            {
                System.out.println("Isosceles");
                isosceles++;
            }
            else
            {
                System.out.println("Escaleno");
                escaleno++;
            }

            i++;
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Equilateros: " + equilatero);
        System.out.println("Isosceles:   " + isosceles);
        System.out.println("Escalenos:   " + escaleno);

        System.out.print("Menor cantidad: ");
        if (equilatero <= isosceles && equilatero <= escaleno)
            System.out.println("Equilatero");
        else if (isosceles <= equilatero && isosceles <= escaleno)
            System.out.println("Isosceles");
        else
            System.out.println("Escaleno");

        sc.close();
    }
}