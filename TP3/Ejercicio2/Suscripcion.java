package TP3.Ejercicio2;

public abstract class Suscripcion {

    private String correo;
    private int numeroCliente;
    private double costoBase;

    public Suscripcion(String correo,int numeroCliente,double costoBase){
        this.correo = correo;
        this.numeroCliente = numeroCliente;
        this.costoBase = costoBase;
    }

    public String getCorreo(){
        return correo;}
    public int getNumeroCliente(){
        return numeroCliente;}
    public double getCostoBase(){
        return costoBase;}

    public abstract double calcularCostoMensual();
    public abstract void mostrarInfo();
}