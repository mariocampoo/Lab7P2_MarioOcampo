package lab7p2_marioocampo;

import java.util.ArrayList;

public class restaurantes {
   private String nombre;
   private String ubicacion;
   private ArrayList <productos> producto = new ArrayList();


    public restaurantes() {
    }

    public restaurantes(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<productos> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<productos> producto) {
        this.producto = producto;
    }



    @Override
    public String toString() {
        return "Restaurantes" + "\n"
                + " Nombre = " + nombre + "\n"
                + " Ubicacion = " + ubicacion + "\n"
                + " Producto = " + producto;
    }
   
   
}
