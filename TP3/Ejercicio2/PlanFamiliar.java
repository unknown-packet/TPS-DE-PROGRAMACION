package TP3.Ejercicio2;

public class PlanFamiliar extends Suscripcion{
    private int perfilesAdicionales;
    private double recargoPorPerfil;

    public PlanFamiliar(String correo,int numeroCliente,double costoBase,int perfilesAdicionales,double recargoPorPerfil){
        super(correo,numeroCliente,costoBase);
        this.perfilesAdicionales = perfilesAdicionales;
        this.recargoPorPerfil = recargoPorPerfil;
    }

    public int getPerfilesAdicionales(){
        return perfilesAdicionales;}
    public double getRecargoPorPerfil(){
        return recargoPorPerfil;}

    @Override
    public double calcularCostoMensual(){
        return getCostoBase() + (perfilesAdicionales * recargoPorPerfil);}

    @Override
    public void mostrarInfo(){
        System.out.println("~~*~~ Plan Familiar ~~*~~");
        System.out.println("Cliente N: "+ getNumeroCliente());
        System.out.println("Correo: "+ getCorreo());
        System.out.println("Costo Base:$ " + getCostoBase());
        System.out.println("Perfiles Adicionales: "+ perfilesAdicionales +" x $"+ recargoPorPerfil);
        System.out.println("Total Mes:$ " + calcularCostoMensual());
    }
}