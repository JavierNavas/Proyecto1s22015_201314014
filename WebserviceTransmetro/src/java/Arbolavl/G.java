/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbolavl;

/**
 *
 * @author javier
 */
public class G {
     G siguiente;
     G  anterior;
    public String nombre;

    public G(String nombre) {
        this.siguiente =null;
        this.anterior =null;
        this.nombre=nombre;
    }
}
