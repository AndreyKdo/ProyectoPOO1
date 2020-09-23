package pack.poo1;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import com.mashape.unirest.http.exceptions.UnirestException;

class Categoria {
    // Atributos
    private int valorCategoria = 0;// valor numérico de la categoría (este número define el multiplicador del precio)
    private ArrayList<Integer> preciosL;// Lista de los precios obtenidos
    // Métodos
    public void leerCategoria(String pcategoria) throws Exception {
        /*
         * Categorías según el valor que le corresponde a cada uno a enviar a la clase
         * Api Jets -> 5 Skins -> 3 Complementos -> 2
         */
        if (pcategoria == "JETS")
            valorCategoria = 5;
        if (pcategoria == "SKINS")
            valorCategoria = 3;
        if (pcategoria == "COMPLEMENTOS")
            valorCategoria = 2;
        if (valorCategoria != 0) llamarApi();
    }

    private void llamarApi() throws UnsupportedEncodingException, UnirestException {
        Api api = new Api();//NUEVA INSTANCIA
        //Obtener valores por el API
        api.obtenerApi(valorCategoria);
        //al atributo preciosL le asigna la lista de precios según los valores devueltos por el API
        preciosL = api.obtenerValores(); 
    }
    public ArrayList<Integer> obtenerPrecios(){
        //Devuelve los precios registrados
        return preciosL;
    }
}

