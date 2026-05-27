package TP2.Ejercicio3;

public class Main {
    public static void main(String[] args){
        cuentaBancaria cuentaBancaria = new cuentaBancaria("12345","Juan Perez",1000);

        cuentaBancaria.depositar(2000);
        // saldo actualizado: 3000

        cuentaBancaria.retirar(500);
        // saldo actualizado: 2500

        double saldoActual = cuentaBancaria.consultarSaldo();
        System.out.println("\nSaldo actual: " + saldoActual);
        System.out.println();

        cuentaBancaria.retirar(10000);
        // mostrara saldo insuficiente
    }
}
