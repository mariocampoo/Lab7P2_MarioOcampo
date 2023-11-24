package lab7p2_marioocampo;
public class usuarios {
    private String nombre;
    private String usuario;
    private String contraseña;
    private int saldo;

    public usuarios() {
    }

    public usuarios(String nombre, String usuario, String contraseña, int saldo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.saldo = saldo;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    @Override
    public String toString() {
        return "Usuarios" + "\n"
                + " Nombre = " + nombre + "\n"
                + " Usuario = " + usuario + "\n"
                + " Contrase\u00f1a = " + contraseña + "\n"
                + " Saldo = " + saldo;
    }
    
    
}
