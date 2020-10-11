package pack.poo1;//Paquete por defecto
//Importación de librerías
import java.util.ArrayList;
import java.util.List;


public class Principal {
	/*Lista de productos: Se quita el estático ya que estaba dando problemas lógicos a la hora de crear los productos, Por Ej:
	 * los productos "JETS" se sustituían con los productos siguientes si los colocabamos así:
	 * listaJets = llamarApi("JETS")
	 * listaComp = llamarApi("COMPLEMENTOS")
	 * listaMundos = llamarApi("MUNDOS")
	 * Por eso también se crearon instancias por separado en llamarApi() en la clase gui para cada lista de productos anterior
	 */
    ArrayList<Producto> productos = new ArrayList<Producto>();

    public void main(String opcion) throws Exception {
        List<Integer> listaPrecios;
        List<String> listaProductos;
        /*
         * opcion solo puede ser tres valores: -JETS -COMPLEMENTOS -MUNDOS
         */       
        Categoria categoria = new Categoria();
        categoria.leerCategoria(opcion);
        listaPrecios = categoria.obtenerPrecios();
        listaProductos = categoria.obtenerProductos();
        
        for (int i = 0; i < listaPrecios.size(); i = i + 1) {
            Producto producto = new Producto();//Nuevas instancias de productos
            producto.crearProducto(listaPrecios.get(i), listaProductos.get(i), opcion);// int pprecio, String pnombre,String ptipo
            productos.add(producto);
        }
    }
    public ArrayList<Producto> devolverLista() {
    	return productos;
    }

}
