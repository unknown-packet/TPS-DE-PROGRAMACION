package TP3.Ejercicio4;

public class CamaraSeguridad extends Dispositivo implements Fotografiable{
    public CamaraSeguridad(String nombre){
        super(nombre);
    }

    @Override
    public void tomarFoto() {
        System.out.println("["+ getNombre() +"] Foto capturada.");
    }
}