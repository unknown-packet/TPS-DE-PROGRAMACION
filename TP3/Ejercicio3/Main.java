package TP3.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        MetodoPago tarjeta = new TarjetaCredito();
        MetodoPago cripto = new Criptomoneda();
        MetodoPago paypal = new PayPal();

        System.out.println("--- Procesando Carrito de Compras ---");

        tarjeta.procesarPago(679.25);
        cripto.procesarPago(374.12);
        paypal.procesarPago(363.10);

        System.out.println();
        System.out.println("Pago finalizado con éxito.");
    }
}