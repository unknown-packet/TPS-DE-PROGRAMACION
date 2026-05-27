package TP3.Ejercicio5;

public abstract class SerVivo extends EntidadEspacial {
    private int vidaMaxima;
    private int vidaActual;
    private int nivel;
    private int fuerza;
    private int defensa;

    public SerVivo(double x, double y, int vidaMaxima, int nivel, int fuerza, int defensa) {
        super(x, y);
        this.vidaMaxima = vidaMaxima;
        this.vidaActual = vidaMaxima;
        this.nivel = nivel;
        this.fuerza = fuerza;
        this.defensa = defensa;
    }

    public int getVidaActual(){
        return vidaActual;}
    public int getVidaMaxima(){
        return vidaMaxima;}
    public int getNivel(){
        return nivel;}
    public int getFuerza(){
        return fuerza;}
    public int getDefensa(){
        return defensa;}

    public void recibirDaño(int daño) {
        int dañoReal = Math.max(1, daño - defensa);
        vidaActual -= dañoReal;
        if (vidaActual < 0) vidaActual = 0;

        System.out.print("  >> " + getNombre());
        System.out.print(" recibe " + dañoReal + " de daño");
        System.out.print(" (bloqueó " + defensa + ")");
        System.out.println(". Vida: " + vidaActual + "/" + vidaMaxima);
    }

    public boolean estaVivo() {
        return vidaActual > 0;
    }

    public String barraDeVida() {
        int bloques = (int) ((double) vidaActual / vidaMaxima * 10);
        String barra = "[" + "█".repeat(bloques) + "░".repeat(10 - bloques) + "]";
        return barra + " " + vidaActual + "/" + vidaMaxima + " HP";
    }
}