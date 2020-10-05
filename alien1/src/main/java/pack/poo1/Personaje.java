package pack.poo1;
import java.util.ArrayList;

public class Personaje {
    private static int velocidad=3;
    private static int fuerza=4;
    private static int agilidad=2;
    private static int ps=15;
    private static int ataque=5;
    private static int dinero=5500;

    protected static void modificarVelocidad(int multiplicador) {
        velocidad = velocidad * multiplicador;        
    }
    protected static void modificarFuerza(int multiplicador) {
        fuerza = fuerza * multiplicador; 
    }
    protected static void modificarAgilidad(int multiplicador) {
        agilidad = agilidad * multiplicador;
    }
    protected static void modificarPS(int multiplicador) {
       ps = ps * multiplicador;
    }
    protected static void modificarAtaque(int multiplicador) {
        ataque = ataque * multiplicador;
    }
    protected static void modificarDinero(int diferencia) {
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
    public static ArrayList<Integer> previewStats(String pcategoria, int multiplicador){
    	ArrayList<Integer> listaStats = new ArrayList<Integer>();
    	if(pcategoria=="JETS") {
    		listaStats.add(fuerza);
    		listaStats.add(agilidad*multiplicador);
        	listaStats.add(ps);
        	listaStats.add(velocidad*multiplicador);
        	listaStats.add(ataque);
        	return listaStats;
    	}else if (pcategoria=="COMPLEMENTOS") {
    		listaStats.add(fuerza*multiplicador);
    		listaStats.add(agilidad);
        	listaStats.add(ps*multiplicador);
        	listaStats.add(velocidad);
        	listaStats.add(ataque*multiplicador);
        	return listaStats;
    	}else {
    		listaStats = devolverStats();
        	return listaStats;
    	}		
    }

}
