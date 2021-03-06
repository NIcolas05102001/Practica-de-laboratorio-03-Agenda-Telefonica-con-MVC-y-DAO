/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.model;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Usuario {

    private Scanner teclado;
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;

    private int cont;
    private int cont2;
    private Telefono[] telefonos;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Usuario() {
        teclado = new Scanner(System.in);
        System.out.println("Ingresa el numero de telefonos a ingresar");
        int x = teclado.nextInt();
        cont2 = x;
        telefonos = new Telefono[x];
        cont = 0;

    }

    public Usuario(Scanner teclado, String cedula, String nombre, String apellido, String correo, String contrasena) {
        this.teclado = teclado;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
    }

  


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.contrasena != other.contrasena) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.contrasena);
        return hash;
    }

    
    
    public void agregarTelefono(Telefono telefono) {
        if (cont < cont2) {
            telefonos[cont] = telefono;
            cont++;
        }else{
            System.out.println("Has llegado al maximo de telefonos");
        }
    }
    
    public Telefono[] getTelefonos(){
        return telefonos;
    }

    @Override
    public String toString() {
        String telefonos = "";
        for (int i = 0; i < cont; i++) {
            telefonos += this.telefonos[i] + "\n";
        }
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrasena=" + contrasena + '}' + "\nTelefonos: " + telefonos;
    }

}
