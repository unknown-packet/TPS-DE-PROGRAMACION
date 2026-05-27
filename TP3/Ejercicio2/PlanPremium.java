package TP3.Ejercicio2;

public class PlanPremium extends Suscripcion{
    private double cargoExtra4K;

    public PlanPremium(String correo,int numeroCliente,double costoBase,double cargoExtra4K){
        super(correo,numeroCliente,costoBase);
        this.cargoExtra4K = cargoExtra4K;
    }

    public double getCargoExtra4K(){
        return cargoExtra4K;}

    @Override
    public double calcularCostoMensual(){
        return getCostoBase() + cargoExtra4K;}

    @Override
    public void mostrarInfo(){
        System.out.println("~~*~~ Plan Premium ~~*~~");
        System.out.println("Cliente N: "+ getNumeroCliente());
        System.out.println("Correo: "+ getCorreo());
        System.out.println("Costo Base:$ "+ getCostoBase());
        System.out.println("Cargo 4K+:$ "+ cargoExtra4K);
        System.out.println("Total Mes:$ "+ calcularCostoMensual());
    }
}