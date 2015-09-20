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
public class C {
     C siguiente;
     C  anterior;
    public String nombre;

    public C(String nombre) {
        this.siguiente =null;
        this.anterior =null;
        this.nombre=nombre;
    }
}
