package pckModelos;

import java.util.ArrayList;

public class usuariosModel {
    public ArrayList<Usuarios> ListaUsuarios = new ArrayList<Usuarios>();
    
    public void AgregarUsuarios(String apellidos, String nombres, String telefono){
        
        Usuarios NuevoUsurios = new Usuarios (apellidos, nombres, telefono);
        this.ListaUsuarios.add(NuevoUsurios);
        
    }
    
    public ArrayList ListarUsuarios(){
        return ListaUsuarios;
    }
    
}
