package pack.poo1;//Paquete por defecto

import java.util.List;

public class Principal {
    public static void main(String[] args) throws Exception {
        List<Integer> listaPrecios;
        /*opcion solo puede ser tres valores:
            -JETS -COMPLEMENTOS -SKINS 
        */
        String opcion = "SKINS"; 
        Categoria categoria = new Categoria();
        categoria.leerCategoria(opcion);
        listaPrecios = categoria.obtenerPrecios();
        System.out.println("***********\n"+"Lista de precios para "+opcion+" :\n"+listaPrecios+"\n*************");
    }   
}
