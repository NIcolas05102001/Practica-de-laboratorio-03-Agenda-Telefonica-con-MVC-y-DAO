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
public class VistaTelefono {
    public void imprimirDatosTelefono(int codigo, String numero, String tipo, String operadora){
        System.out.println("**** DATOS TELEFONO ****");
        System.out.println("Codigo: " + codigo);
        System.out.println("Numero: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Operadora " + operadora);
    }
}
