package pack.poo1;

public class Personaje {
    private int velocidad=5;
    private int fuerza=5;
    private int agilidad=5;
    private int ps=5;
    private int ataque=5;
    private int dinero=5;

    public void modificarVelocidad(int multiplicador) {
        this.velocidad = velocidad * multiplicador;        
    }
    public void modificarFuerza(int multiplicador) {
        this.fuerza = fuerza * multiplicador; 
    }
    public void modificarAgilidad(int multiplicador) {
        this.agilidad = agilidad * multiplicador;
    }
    public void modificarPS(int multiplicador) {
        this.ps = ps * multiplicador;
    }
    public void modificarAtaque(int multiplicador) {
        this.ataque = ataque * multiplicador;
    }
    public void modificarDinero(int diferencia) {
        this.dinero = dinero + diferencia;
    }

}
