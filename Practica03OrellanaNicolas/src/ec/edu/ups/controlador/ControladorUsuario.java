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
import java.util.List;

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
    
    public void registrar(){
        usuario = vistaUsuario.ingresarUsuario();
        usuarioDao.create(usuario);
    }
    
    public void verUsuario(){
        String correo = vistaUsuario.buscarUsuarioCorreo();
        String contrasena = vistaUsuario.buscarUsuarioContrasena();
        usuario = usuarioDao.read(correo, contrasena);
    }
    
    public void actualizar(){
        usuario = vistaUsuario.actualizarUsuario();
        usuarioDao.update(usuario);
    }
    
    public void eliminar(){
        usuario = vistaUsuario.eliminarUsuario();
        usuarioDao.delete(usuario);
    }
    
    public void verUsuarios(){
        List<Usuario> usuarios;
        usuarios = usuarioDao.findAll();
        vistaUsuario.verUsuarios(usuarios);
    }
    
    public void agregarTelefono(){
        int codigo = vistaTelefono.buscarTelefono();
        telefono = telefonoDao.read(codigo);
        usuario.agregarTelefono(telefono);
        usuarioDao.update(usuario);
    }
}
