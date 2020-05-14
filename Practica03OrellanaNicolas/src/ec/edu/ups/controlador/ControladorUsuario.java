/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.ITelefonoDao;
import ec.edu.ups.idao.IUsuarioDao;
import ec.edu.ups.model.Telefono;
import ec.edu.ups.model.Usuario;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.vista.VistaUsuario;

/**
 *
 * @author nicol
 */
public class ControladorUsuario {

    private VistaUsuario vistaUsuario;
    private VistaTelefono vistaTelefono;
    private Usuario usuario;
    private Telefono telefono;
    private IUsuarioDao usuarioDao;
    private ITelefonoDao telefonoDao;

    public ControladorUsuario(VistaUsuario vistaUsuario, VistaTelefono vistaTelefono, IUsuarioDao usuarioDao, ITelefonoDao telefonoDao) {
        this.vistaUsuario = vistaUsuario;
        this.vistaTelefono = vistaTelefono;
        this.usuarioDao = usuarioDao;
        this.telefonoDao = telefonoDao;
    }
    
    public void verCliente(){
        
    }
}
