/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.model.Telefono;
import ec.edu.ups.model.Usuario;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class VistaUsuario {

    Scanner teclado;

    public VistaUsuario() {
        teclado = new Scanner(System.in);
    }

    public Usuario ingresarUsuario() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos para su registro:");
        System.out.println("Cedula:");
        String cedula = teclado.next();
        System.out.println("Nombre:");
        String nombre = teclado.next();
        System.out.println("Apellido:");
        String apellido = teclado.next();
        System.out.println("Correo:");
        String correo = teclado.next();
        System.out.println("Contraseña:");
        String contrasena = teclado.next();
        return new Usuario(teclado, cedula, nombre, apellido, correo, contrasena);
    }

    public Usuario actualizarUsuario() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la contraseña");
        String contrasena = teclado.next();
        System.out.println("Ingrese los nuevos datos");
        System.out.println("Cedula:");
        String cedula = teclado.next();
        System.out.println("Nombre:");
        String nombre = teclado.next();
        System.out.println("Apellido:");
        String apellido = teclado.next();
        System.out.println("Correo:");
        String correo = teclado.next();
        Telefono t = new Telefono(0, "nombre", "correo", "contrasena");
        Telefono[] telefonos = null;
        telefonos[1]=t;
        return new Usuario(teclado, cedula, nombre, apellido, correo, contrasena);
    }

    public Usuario eliminarUsuario() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese su contraseña");
        String contrasena = teclado.next();
        Telefono t = new Telefono(0, "nombre", "correo", "contrasena");
        Telefono[] telefonos = null;
        telefonos[1]=t;
        return new Usuario(teclado, contrasena, contrasena, contrasena, contrasena, contrasena);
    }

    public String buscarUsuario() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese su contraseña");
        String contrasena = teclado.next();
        return contrasena;
    }

    public void verUsuario(Usuario usuario) {
        System.out.println("Datos del usuario: " + usuario);
    }

    public void verUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println("Datos del usuario: " + usuario);
        }
    }
}
