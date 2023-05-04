package pckModelos;

public class Usuarios {
    String apellidos;
    String nombres;
    String telefono;

    public Usuarios(String apellidos, String nombres, String telefono) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.telefono = telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    
    
}
