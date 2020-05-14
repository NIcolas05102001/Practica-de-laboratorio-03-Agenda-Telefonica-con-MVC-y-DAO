/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.model.Telefono;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class VistaTelefono {

    Scanner teclado;

    public VistaTelefono() {
        teclado = new Scanner(System.in);
    }

    public Telefono ingresarTelefono() {
        teclado = new Scanner(System.in);
        System.out.println("Ingresar datos del telefono");
        System.out.println("Codigo:");
        int codigo = teclado.nextInt();
        System.out.println("Numero:");
        String numero = teclado.next();
        System.out.println("Tipo:");
        String tipo = teclado.next();
        System.out.println("Operadora");
        String operadora = teclado.next();
        return new Telefono(codigo, numero, tipo, operadora);
    }

    public Telefono actualizarTelefono() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el codigo del telefono a actualizar");
        System.out.println("Codigo:");
        int codigo = teclado.nextInt();
        System.out.println("Ingrese los nuevos datos");
        System.out.println("Numero:");
        String numero = teclado.next();
        System.out.println("Tipo:");
        String tipo = teclado.next();
        System.out.println("Operadora");
        String operadora = teclado.next();
        return new Telefono(codigo, numero, tipo, operadora);
    }

    public Telefono eliminarTelefono() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el codigo del numero a eliminar");
        int codigo = teclado.nextInt();
        return new Telefono(codigo, null, null, null);
    }

    public int buscarTelefono() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el codigo del numero a buscar");
        int codigo = teclado.nextInt();
        return codigo;
    }
    
    public void verTelefono(Telefono telefono){
        System.out.println("Datos del usuario: " + telefono);
    }
    
    public void verTelefonos(List<Telefono> telefonos){
        for (Telefono telefono : telefonos) {
            System.out.println("Datos de la telefonia: " + telefonos);
        }
    }
}
