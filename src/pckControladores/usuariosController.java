package pckControladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import pckModelos.usuariosModel;
import pckVIsta.frmPrincipal;
import pckVIsta.frmUsuarios;

public class usuariosController implements ActionListener{

   frmPrincipal VistaPrincipal;
   frmUsuarios VistaUsuarios;
   usuariosModel ModeloUsuarios;
   public DefaultTableModel TablaUsuarios = new DefaultTableModel();
   
   //Levantar de forma automatica el formulario principal

    public usuariosController(frmPrincipal VistaPrincipal, frmUsuarios VistaUsuarios, usuariosModel ModeloUsuarios) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaUsuarios = VistaUsuarios;
        this.ModeloUsuarios = ModeloUsuarios;
        
        
        //Poner a la escucha los botones correspondientes
        
        this.VistaPrincipal.btnAgregar.addActionListener(this);
        
        //Levantar la vista principal
        
        //this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        this.TablaUsuarios.addColumn("APELLIDO");
        this.TablaUsuarios.addColumn("NOMBRE");
        this.TablaUsuarios.addColumn("TELEFONO");
            
        this.VistaUsuarios.jtUsuarios.setModel(TablaUsuarios);
    }
       
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnAgregar){
            
            //Poner a la escucha los botones de la vista usuario
            
            this.VistaUsuarios.btnInsertar.addActionListener(this);
            
            //Leventar la vista usuarios
            
            this.VistaUsuarios.setLocationRelativeTo(null);
            this.VistaUsuarios.setVisible(true);
            
        }
        
        if(e.getSource()== this.VistaUsuarios.btnInsertar){
            this.ModeloUsuarios.AgregarUsuarios(this.VistaUsuarios.txtApellido.getText(),
                    this.VistaUsuarios.txtNombre.getText(),
                    this.VistaUsuarios.txtTelefono.getText());
            
            this.TablaUsuarios.addRow(new Object[]{this.ModeloUsuarios.ListaUsuarios.get(0).getApellidos(),
            this.ModeloUsuarios.ListaUsuarios.get(0).getNombres(),
            this.ModeloUsuarios.ListaUsuarios.get(0).getTelefono()});
            
        }
    }
    
}
