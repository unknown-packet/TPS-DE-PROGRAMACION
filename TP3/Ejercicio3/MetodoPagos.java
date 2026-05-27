package TP3.Ejercicio3;

interface MetodoPago {
    void procesarPago(double monto);
}

class TarjetaCredito implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando $" + monto + " con Tarjeta de Crédito.");
    }
}

class Criptomoneda implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando $" + monto + " con Cripto.");
    }
}

class PayPal implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando $" + monto + " con PayPal.");
    }
}