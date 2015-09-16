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
public class Chofer {
    int id;
    String nombre;
    String apellido;
    String contra;
    int fe;
    Chofer hijoIzquierdo;
    Chofer hijoDerecho;
    Chofer padre;
    ListaBusAsignado Listabuses = new ListaBusAsignado();
    
    public Chofer( int id,String nombre,String apellido,String contra) {
        this.fe = 0;
        this.contra=contra;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
        this.padre=null;
        this.id=id;
        this.apellido=apellido;
        this.nombre=nombre;
    }
}
