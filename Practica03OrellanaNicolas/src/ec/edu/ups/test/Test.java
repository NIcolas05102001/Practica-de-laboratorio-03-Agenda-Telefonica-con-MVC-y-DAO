/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.dao.TelefonoDaoImpl;
import ec.edu.ups.dao.UsuarioDaoImpl;
import ec.edu.ups.model.Telefono;
import ec.edu.ups.model.Usuario;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.vista.VistaUsuario;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Test {
    public static void main(String[] args) {
        VistaUsuario vistaUsuario = new VistaUsuario();
        VistaTelefono vistaTelefono = new VistaTelefono();
        
        UsuarioDaoImpl usuarioDaoImpl = new UsuarioDaoImpl();
        TelefonoDaoImpl telefonoDaoImpl = new TelefonoDaoImpl();
        
        ControladorUsuario controladorUsuario = new ControladorUsuario(vistaUsuario, vistaTelefono, usuarioDaoImpl, telefonoDaoImpl);
        ControladorTelefono controladorTelefono = new ControladorTelefono(vistaTelefono, telefonoDaoImpl);
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de usuarios a ingresar");
        int x = teclado.nextInt();
        for (int i = 0; i < x; i++) {
            controladorUsuario.registrar();
           
        }
        
        controladorUsuario.verUsuario();
    }
}
