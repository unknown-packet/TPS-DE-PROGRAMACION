package TP1;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero del 1 al 99:");
        num = sc.nextInt();

        if (num >=1 && num <=9)
           System.out.println("El numero tiene 1 digito:");
        else if (num >= 10 && num <=99)
           System.out.println("El numero tiene 2 digitos:");
        else
           System.out.println("Numero Invalido:");
    }
}