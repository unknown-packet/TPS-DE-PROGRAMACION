package TP2.Ejercicio5;

public class Empleados {
    private int legajo;
    private String nombre;
    private double salario;
    private String motivoAumento;

    private static int contadorEmpleados = 0; //para llevar el control
    private static int siguienteLegajo = 1432;// el empleado tendra su propio legajo

    public Empleados(String nombre, double salario){
            this.legajo = siguienteLegajo;
            this.nombre = nombre;
            this.salario = salario;
            this.motivoAumento = "Buen desempeño";
            contadorEmpleados++;
    }

    public void aumentarSalarioPorcentaje(double porcentaje, String motivo){
        if (porcentaje > 0){
            salario += salario * (porcentaje / 100);
            motivoAumento = motivo;
        }else {
            System.out.println("El porcentaje debe ser mayor a cero..");
        }
    }
    public void aumentarSalarioMonto(double monto, String motivo){
        if (monto > 0){
            salario += monto;
            motivoAumento = motivo;
        }else{
            System.out.println("El monto debe ser mayor a cero");
        }
    }
    public static int obtenerCantidadEmpleados(){
        return contadorEmpleados;
    }
    public void mostrarInformacion(){
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre:" + nombre);
        System.out.println("Aumento: " + motivoAumento);
        System.out.println();
    }

    public int getLegajo(){
        return legajo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getSalario(){
        return salario;
    }
    public String getMotivoAumento(){
        return motivoAumento;
    }
}
