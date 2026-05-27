package TP2.Ejercicio3;

public class cuentaBancaria{
    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public cuentaBancaria(){
    }

    public cuentaBancaria(String numeroCuenta, String nombreTitular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }
    public void depositar(double cantidad){
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito Realizado... Se deposito: $" + cantidad);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a cero.");
        }
    }
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor a cero.");
        } else if (cantidad > saldo) {
            System.out.println("Saldo insuficiente. Su saldo actual es: $" + saldo);
        } else {
            saldo -= cantidad;
            System.out.println("Retiro Realizado... Se retiro: $" + cantidad);
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getNombreTitular() {
        return nombreTitular;
    }
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }
}