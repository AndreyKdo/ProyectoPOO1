package pack.poo1;

import java.util.ArrayList; //librería necesaria para trabajar con listas
//Librerías necesarias para trabajar con el API
import java.io.UnsupportedEncodingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
//Librerías necesarias para trabajar con Json
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
// Se usó el Api https://rapidapi.com/accujazz/api/rawg-video-games-database?endpoint=apiendpoint_09fbc37a-91b6-49f8-9018-67627e8e670e
class Api {
    private static ArrayList<Integer> valores;
    public void obtenerApi(Integer valorCategoria) throws UnirestException, UnsupportedEncodingException {
        HttpResponse<JsonNode> response = Unirest.get("https://rawg-video-games-database.p.rapidapi.com/tags")// host+"?"+query
                .header("x-rapidapi-host", "rawg-video-games-database.p.rapidapi.com")
                .header("x-rapidapi-key", "ea428cb084msh37dc4a6749f4694p14980cjsn04e376bb9b78")
                .asJson();
        //Si imprimos response.getHeaders().get("Content-Type"), imprime [application/json]
        //Si imprimos response.getStatus(), si imprime 200 es éxito
        // OBTENER Json
        Gson gson = new GsonBuilder().setPrettyPrinting().create();// para visualizar el Json en lista string
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(response.getBody().toString());
        String prettyJsonString = gson.toJson(je);// para visualizar el Json en lista(prettyJsonString ES TIPO STRING)
        /*Realizar la lista de números según la categoría obtenida del dato entero de busqueda
            5 -> valor >= 5  Jets
            4 -> valor == 4 Skins
            2 -> valor <= 2 Complementos
        */
        ArrayList<Integer> lista = new ArrayList<>();//Lista de precios
        String valor = "";//cadena con los caracteres (números) que leyó en el for
        //LEE EL STRING prettyJsonString
        for (int i = 0; i < prettyJsonString.length(); i++) {
            if (Character.isDigit(prettyJsonString.charAt(i))) {//Si el caracter leído es un número
                valor = valor + i; //la cadena valor se extiende
                if (valor.length() == 2) {//si valor tiene dos dígitos (técnicamente dos caracteres)
                    int valorInt = Integer.parseInt(valor);//convierte la cadena valor a int
                    //agrega a la lista de precios el nuevo valorInt * valorCategoria
                    lista.add(valorInt*valorCategoria);
                    valor = "";//reinicia la variable valor como una cadena vacía
                }
            }
            if (lista.size() == 3) break; //Termina el ciclo hasta que la lista alcance los numeros totales
        }       
        valores = lista;
    }
    public ArrayList<Integer> obtenerValores(){
        return valores;
    }
}
