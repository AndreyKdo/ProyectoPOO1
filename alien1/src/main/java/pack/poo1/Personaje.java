package pack.poo1;
import java.util.ArrayList;

public class Personaje {
    private static int velocidad=3;
    private static int fuerza=4;
    private static int agilidad=2;
    private static int ps=15;
    private static int ataque=5;
    private static int dinero=0;
    
    private static int velocidadSt=0;
    private static int fuerzaSt=0;
    private static int agilidadSt=0;
    private static int psSt=0;
    private static int ataqueSt=0;
/*
 * Multiplicadores:
 \+/ "JETS": 
 * 		"Mini Jet" : 2;
 *      "Super Jet" : 4;
 *      "Ultra Jet" : 8;
 \+/	"COMPLEMENTOS":
 *      "Rayo Láser" : 2;
 *      "Cuerno de Taurus" : 5;
 *      "Leche de Vía Láctea" : 10;
 \+/    "MUNDOS": 1; 
 */
    protected static void modificarVelocidad(int multiplicador) {
        velocidad = velocidad + multiplicador;        
    }
    protected static void modificarFuerza(int multiplicador) {
        fuerza = fuerza + multiplicador; 
    }
    protected static void modificarAgilidad(int multiplicador) {
        agilidad = agilidad + multiplicador;
    }
    protected static void modificarPS(int multiplicador) {
    	ps = ps + multiplicador;
    }
    protected static void modificarAtaque(int multiplicador) {
        ataque = ataque + multiplicador;
    }
    public static void modificarDinero(int diferencia) {
        dinero = dinero + diferencia;
    }
    public static int devolverDinero(){
    	return dinero;
    } 	
    protected static void modificarVelocidadSt(int multiplicador) {
    	velocidadSt = velocidadSt + multiplicador;        
    }
   
    protected static void modificarFuerzaSt(int multiplicador) {
    	fuerzaSt = fuerzaSt + multiplicador; 
    }
   
    protected static void modificarAgilidadSt(int multiplicador) {
    	agilidadSt = agilidadSt + multiplicador;
    }
    protected static void modificarPSSt(int multiplicador) {
    	psSt = psSt + multiplicador;
    }
    protected static void modificarAtaqueSt(int multiplicador) {
    	ataqueSt = ataqueSt + multiplicador;
    }
   
    protected static void resetearVelocidad(int multiplicador) {
    	velocidadSt =  multiplicador;        
    }
    protected static void resetearFuerza(int multiplicador) {
    	fuerzaSt = multiplicador; 
    }
    protected static void resetearAgilidad(int multiplicador) {
        agilidadSt =  multiplicador;
    }
    protected static void resetearPS(int multiplicador) {
    	psSt =  multiplicador;
    }
    protected static void resetearAtaque(int multiplicador) {
    	ataqueSt =  multiplicador;
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
    public static ArrayList<Integer> previewStats(){
    	ArrayList<Integer> listaStatsModificados = new ArrayList<Integer>();
    	listaStatsModificados.add(fuerzaSt);
    	listaStatsModificados.add(agilidadSt);
    	listaStatsModificados.add(psSt);
    	listaStatsModificados.add(velocidadSt);
    	listaStatsModificados.add(ataqueSt);
        return listaStatsModificados;
    			
    }

}
