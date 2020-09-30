package pack.poo1;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import com.mashape.unirest.http.exceptions.UnirestException;

class Categoria {
    // Atributos
    private int valorCategoria = 0;// valor numérico de la categoría (este número define el multiplicador del precio)
    private ArrayList<Integer> preciosL;// Lista de los precios obtenidos
    private ArrayList<String> productosL= new ArrayList<String>();
    // Métodos
    public void leerCategoria(String pcategoria) throws Exception {
        /*
         * Categorías según el valor que le corresponde a cada uno a enviar a la clase
         * Api Jets -> 5 Skins -> 3 Complementos -> 2
         */
        if (pcategoria == "JETS")
            valorCategoria = 5;
        if (pcategoria == "MUNDOS")
            valorCategoria = 3;
        if (pcategoria == "COMPLEMENTOS")
            valorCategoria = 2;
        switch(valorCategoria){
            case 5:
                productosL.add("Mini Jet");
                productosL.add("Super Jet");
                productosL.add("Ultra Jet");
                llamarApi();
                break;
            case 3:
                productosL.add("Andrómeda");
                productosL.add("Orión");
                productosL.add("Osa Mayor");
                llamarApi();
                break;
            case 2:
                productosL.add("Rayo Láser");
                productosL.add("Cuerno de Taurus");
                productosL.add("Leche de Vía Láctea");
                llamarApi();
                break;
            default:
                productosL.add("Sin productos para mostrar");             
        }
    }
    private void llamarApi() throws UnsupportedEncodingException, UnirestException {
        Api api = new Api();//NUEVA INSTANCIA
        //Obtener valores por el API
        api.obtenerApi(valorCategoria);
        //al atributo preciosL le asigna la lista de precios según los valores devueltos por el API
        preciosL = api.obtenerValores();
    }
    public ArrayList<Integer> obtenerPrecios(){
        return preciosL;//Devuelve los precios registrados
    }
    public ArrayList<String> obtenerProductos(){       
        return productosL;//Devuelve la lista de productos según la categoría
    }
}

