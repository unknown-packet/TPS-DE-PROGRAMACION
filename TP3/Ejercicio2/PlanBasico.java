package TP3.Ejercicio2;

public class PlanBasico extends Suscripcion{
    public PlanBasico(String correo,int numeroCliente,double costoBase) {
        super(correo,numeroCliente,costoBase);}

    @Override
    public double calcularCostoMensual(){
        return getCostoBase();}

    @Override
    public void mostrarInfo(){
        System.out.println("~~*~~ Plan Basico ~~*~~");
        System.out.println("Cliente N: "+ getNumeroCliente());
        System.out.println("Correo: "+ getCorreo());
        System.out.println("Costo Base:$ "+ getCostoBase());
        System.out.println("Total Mes:$ "+ calcularCostoMensual());
    }
}