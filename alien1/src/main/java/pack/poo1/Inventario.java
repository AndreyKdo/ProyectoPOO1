package pack.poo1;
import java.util.ArrayList;
public class Inventario {
	 private static ArrayList<Producto> productosInv = new ArrayList<Producto>();
	 public static void agregarProducto(Producto producto) {
		 productosInv.add(producto);
	 }
	 public static ArrayList<Producto> getPorCategoria(String categoria){
		 //categoria solo puede ser tres valores: -JETS -COMPLEMENTOS -MUNDOS
		 ArrayList<Producto> verProductos = new ArrayList<Producto>();
		 for (int i = 0; i < productosInv.size(); i = i + 1) {
			 Producto producto = productosInv.get(i);
			 if (producto.getTipo()==categoria) {
				 verProductos.add(producto);
			 }
		 } return verProductos;
	 	}

	 public static int contarProductos(String nombre) {
		 int contador = 0;
		 for (int i = 0; i < productosInv.size(); i = i + 1) {
			 if (productosInv.get(i).getNombre() == nombre) {
				 contador++;
			 }
		 }
		 return contador;
	 }
	 public static boolean buscarObjeto(String nombre) {
		 for (int i = 0; i < productosInv.size(); i = i + 1) {
			 if (productosInv.get(i).getNombre() == nombre) {
				 return true;
			 }
		 }return false;
	 }
	 public static boolean eliminarProducto(String nombre) {
		 for (int i = 0; i < productosInv.size(); i = i + 1) {
			 if (productosInv.get(i).getNombre() == nombre) {
				 productosInv.remove(i);
				 return true;
			 }
		 }return false;
	 }
}

