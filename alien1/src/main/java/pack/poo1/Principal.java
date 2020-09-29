package pack.poo1;//Paquete por defecto
//Importación de librerías
import java.util.ArrayList;
import java.util.List;


public class Principal {
    //Lista de productos
    private static ArrayList<Producto> productos = new ArrayList<Producto>();

    public static ArrayList<Producto> main(String opcion) throws Exception {
        List<Integer> listaPrecios;
        List<String> listaProductos;
        /*
         * opcion solo puede ser tres valores: -JETS -COMPLEMENTOS -MUNDOS
         */       
        Categoria categoria = new Categoria();
        categoria.leerCategoria(opcion);
        listaPrecios = categoria.obtenerPrecios();
        listaProductos = categoria.obtenerProductos();
        
        //System.out.println("***********\n" + "Lista de precios para " + opcion + " :\n" + listaPrecios + "\n*************");
        //System.out.println("Lista de productos:\n" + listaProductos);
        productos.clear();//para que no se sumen más elementos con todas las llamadas
        for (int i = 0; i < listaPrecios.size(); i = i + 1) {
            Producto producto = new Producto();//Nuevas instancias de productos
            producto.crearProducto(listaPrecios.get(i), listaProductos.get(i), opcion);// int pprecio, String pnombre,String ptipo
            productos.add(producto);
        }
        //verProductos();
        return productos;
    }
    private static void verProductos() {
        for(int i = 0; i < productos.size();i = i + 1){
            productos.get(i).devolverAttr();
        }
    }
}
