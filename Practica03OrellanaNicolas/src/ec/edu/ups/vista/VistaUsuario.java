/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

/**
 *
 * @author nicol
 */
public class VistaUsuario {

    public void imprimirDatosUsuario(String cedula, String nombre, String apellido, String correo, String contrasena) {
        System.out.println("**** DATOS CLIENTE ****");
        System.out.println("Id: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo: " + correo);
        System.out.println("Contraseña " + contrasena);
    }
}
