/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.ITelefonoDao;
import ec.edu.ups.model.Telefono;
import ec.edu.ups.vista.VistaTelefono;
import java.util.List;

/**
 *
 * @author nicol
 */
public class ControladorTelefono {
    
    private VistaTelefono vistaTelefono;
    private Telefono telefono;
    private ITelefonoDao telefonoDao;

    public ControladorTelefono(VistaTelefono vistaTelefono, ITelefonoDao telefonoDao) {
        this.vistaTelefono = vistaTelefono;
        this.telefonoDao = telefonoDao;
    }
    
    public void registrar(){
        telefono = vistaTelefono.ingresarTelefono();
        telefonoDao.create(telefono);
    }
    
    public void verTelefono(){
        int codigo = vistaTelefono.buscarTelefono();
        telefono = telefonoDao.read(codigo);
        vistaTelefono.verTelefono(telefono);
    }
    
    public void actualizar(){
        telefono = vistaTelefono.actualizarTelefono();
        telefonoDao.update(telefono);
    }
    
    public void eliminar(){
        telefono = vistaTelefono.eliminarTelefono();
        telefonoDao.delete(telefono);
    }
    
    public void verTelefonos(){
        List<Telefono> telefonos;
        telefonos = telefonoDao.findAll();
        vistaTelefono.verTelefonos(telefonos);
    }
    
}
