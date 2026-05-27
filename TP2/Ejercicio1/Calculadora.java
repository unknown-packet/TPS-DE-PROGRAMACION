package TP2.Ejercicio1;

public class Calculadora {
    private double primerNumero;
    private double segundoNumero;

    public Calculadora(){
    }

    public Calculadora(double primerNumero, double segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }
    public double sumar(){
        double suma = this.primerNumero + this.segundoNumero;
        return suma;
    }
    public double restar(){
        double resta = this.primerNumero - this.segundoNumero;
        return resta;
    }
    public double multiplicar(){
        double multiplicacion = this.primerNumero * this.segundoNumero;
        return multiplicacion;
    }
    public double dividir(){
        double dividision = this.primerNumero / this.segundoNumero;
        return dividision;
    }

    public double getPrimerNumero(){
        return primerNumero;
    }
    public void setPrimerNumero(double primerNumero) {
        this.primerNumero = primerNumero;
    }

    public double getSegundoNumero(){
        return segundoNumero;
    }
    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }
}