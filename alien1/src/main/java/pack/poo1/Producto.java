package pack.poo1;

public class Producto {
    private int precio;
    private boolean equipado;
    private int multiplicador;
    private String nombre;
    private String tipo;

    public void crearProducto(int pprecio, String pnombre, String ptipo) {
        precio = pprecio;
        nombre = pnombre;
        tipo = ptipo;
        definirMultiplicador();
    }
    private void definirMultiplicador() {
        if (tipo == "JETS"){
            if(nombre == "Mini Jet"){
                multiplicador = 2;
            }else if (nombre == "Super Jet") {
                multiplicador = 4;
            } else {
                multiplicador = 8;//Ultra Jet
            }
        }else if (tipo == "COMPLEMENTOS") {
            if (nombre == "Rayo Láser") {
                multiplicador = 2;
            } else if (nombre == "Manzana Estrella") {
                multiplicador = 3;
            } else if (nombre == "Cuerno de Taurus") {
                multiplicador = 5;
            } else {
                multiplicador = 10;//Leche de Vía Láctea
            }
        } else {
            multiplicador = 1; //Skins
        }
    }
    public String getNombre() {
    	return nombre;
    }
    public Integer getPrecio() {
    	return precio;
    }
    public Integer getMultiplicador() {
    	return multiplicador;
    }
    public Boolean getEquipado() {
    	return equipado;
    }
    public String getTipo() {
    	return tipo;
    }
    public void devolverAttr() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Precio:"+precio);
        System.out.println("Tipo:"+tipo);
        System.out.println("Multiplicador:"+multiplicador+"\n");
    }


}

