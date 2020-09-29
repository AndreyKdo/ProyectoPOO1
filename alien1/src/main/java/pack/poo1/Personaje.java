package pack.poo1;
import java.util.ArrayList;

public class Personaje {
    private static int velocidad=3;
    private static int fuerza=4;
    private static int agilidad=2;
    private static int ps=15;
    private static int ataque=5;
    private static int dinero=500;

    protected void modificarVelocidad(int multiplicador) {
        velocidad = velocidad * multiplicador;        
    }
    protected void modificarFuerza(int multiplicador) {
        fuerza = fuerza * multiplicador; 
    }
    protected void modificarAgilidad(int multiplicador) {
        agilidad = agilidad * multiplicador;
    }
    protected void modificarPS(int multiplicador) {
       ps = ps * multiplicador;
    }
    protected void modificarAtaque(int multiplicador) {
        ataque = ataque * multiplicador;
    }
    protected void modificarDinero(int diferencia) {
        dinero = dinero + diferencia;
    }
    public static int devolverDinero(){
    	return dinero;
    }
    public static ArrayList<Integer> devolverStats(){
    	ArrayList<Integer> listaStats = new ArrayList<Integer>();
    	listaStats.add(fuerza);
    	listaStats.add(agilidad);
    	listaStats.add(ps);
    	listaStats.add(velocidad);
    	listaStats.add(ataque);
    	return listaStats;
    }

}
