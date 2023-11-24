package lab7p2_marioocampo;

import java.util.ArrayList;

public class restaurantes {
   private String nombre;
   private String ubicacion;
   private ArrayList <productos> producto = new ArrayList();
   private int saldo;

    public restaurantes() {
    }

    public restaurantes(String nombre, String ubicacion, int saldo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.saldo = saldo;
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

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Restaurantes" + "\n"
                + " Nombre = " + nombre + "\n"
                + " Ubicacion = " + ubicacion + "\n"
                + " Producto = " + producto + "\n"
                + " Saldo = " + saldo;
    }
   
   
}
