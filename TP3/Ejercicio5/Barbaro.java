package TP3.Ejercicio5;

public class Barbaro extends PersonajeJugable {

    public Barbaro(double x, double y) {
        super(x, y, 320, 25, 95, 40, "Bárbaro");
    }

    @Override
    public String getNombre(){
        return "Guts el Destructor"; }

    @Override
    public void habilidadEspecial() {
        System.out.println("  >> " + getNombre() + " usa [Torbellino de Acero]!");
        System.out.println("     Gira rápidamente y golpea a todos los enemigos cercanos causando " + (getFuerza() * 2) + " de daño!");
    }
}