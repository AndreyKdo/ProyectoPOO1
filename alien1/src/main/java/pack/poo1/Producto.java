package pack.poo1;


public class Producto {
    private int precio;
    private boolean equipado=false;
    private int multiplicador;
    private String nombre;
    private String tipo;
    private int precioVender;

    public void crearProducto(int pprecio, String pnombre, String ptipo) {
        precio = pprecio;
        nombre = pnombre;
        tipo = ptipo;
        definirMultiplicador();
        precioVender = (precio - multiplicador) / multiplicador * 2 ;
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
            } else if (nombre == "Cuerno de Taurus") {
                multiplicador = 5;
            } else {
                multiplicador = 10;//Leche de Vía Láctea
            }
        } else {
            multiplicador = 1; //Mundos
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
    public Integer getPrecioVender() {
    	return precioVender;
    }
    public void devolverAttr() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Precio:"+precio);
        System.out.println("Tipo:"+tipo);
        System.out.println("Multiplicador:"+multiplicador+"\n");
    }
    public void equipar() {
    	if(equipado==false) {
        	if (tipo=="JETS") {
    			Personaje.modificarVelocidad(multiplicador);
    			Personaje.modificarAgilidad(multiplicador);
    		}else if (tipo=="COMPLEMENTOS") {
    			Personaje.modificarFuerza(multiplicador);
    			Personaje.modificarPS(multiplicador);
    			Personaje.modificarAtaque(multiplicador);
    		}else;
        	equipado=true;
    	} else {
    		if (tipo=="JETS") {
    			Personaje.modificarVelocidad(-multiplicador);
    			Personaje.modificarAgilidad(-multiplicador);
    		}else if (tipo=="COMPLEMENTOS") {
    			Personaje.modificarFuerza(-multiplicador);
    			Personaje.modificarPS(-multiplicador);
    			Personaje.modificarAtaque(-multiplicador);
    		}else;
    		equipado=false;
    	}
    }
    public void previsualizar() {
    	if (tipo=="JETS") {
    		Personaje.modificarVelocidad(multiplicador);
    		Personaje.modificarAgilidad(multiplicador);
    	}else if (tipo=="COMPLEMENTOS") {
    		Personaje.modificarFuerza(multiplicador);
    		Personaje.modificarPS(multiplicador);
    		Personaje.modificarAtaque(multiplicador);
    	}else;
       	
    }
    
    public void desprevisualizar() {
    	if (tipo=="JETS") {
    		Personaje.modificarVelocidad(-multiplicador);
    		Personaje.modificarAgilidad(-multiplicador);
    	}else if (tipo=="COMPLEMENTOS") {
    		Personaje.modificarFuerza(-multiplicador);
    		Personaje.modificarPS(-multiplicador);
    		Personaje.modificarAtaque(-multiplicador);
    	}else;
       	
    }
   
    public void previsualizarStats() {
    	if (tipo=="JETS") {
    		Personaje.modificarVelocidadSt(multiplicador);
    		Personaje.modificarAgilidadSt(multiplicador);
    	}else if (tipo=="COMPLEMENTOS") {
    		Personaje.modificarFuerzaSt(multiplicador);
    		Personaje.modificarPSSt(multiplicador);
    		Personaje.modificarAtaqueSt(multiplicador);
    	}else;
       	
    }
    
    public void desprevisualizarStats() {
    	if (tipo=="JETS") {
    		Personaje.modificarVelocidadSt(-(multiplicador*2));
    		Personaje.modificarAgilidadSt(-(multiplicador*2));
    	}else if (tipo=="COMPLEMENTOS") {
    		Personaje.modificarFuerzaSt(-(multiplicador*2));
    		Personaje.modificarPSSt(-(multiplicador*2));
    		Personaje.modificarAtaqueSt(-(multiplicador*2));
    	}else;
       	
    }
    
    public void resetearStats() {
    	if (tipo=="JETS") {
    		Personaje.resetearVelocidad(0);
    		Personaje.resetearAgilidad(0);
    	}else if (tipo=="COMPLEMENTOS") {
    		Personaje.resetearFuerza(0);
    		Personaje.resetearPS(0);
    		Personaje.resetearAtaque(0);
    	}else;
       	
    }
    public boolean comprar() {
    	int dinero = Personaje.devolverDinero();
    	if (dinero>=precio) {
    		Personaje.modificarDinero(precio*-1);
    		return true;
    	}else return false;
    }
    public int enInventario() {
    	int contador = Inventario.contarProductos(nombre);
    	return contador;
    }
    public boolean vender() {
    	if (Inventario.eliminarProducto(nombre)) {
    		if (equipado)equipar();
    		Personaje.modificarDinero(precioVender);
    		return true;
    	}else return false;
    }

}

