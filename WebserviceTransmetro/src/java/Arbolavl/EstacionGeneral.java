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
public class EstacionGeneral {
    EstacionGeneral hijoIzquierdo;
    EstacionGeneral hijoDerecho;
    EstacionGeneral padre; 
    int id;
    String nombre;
    String contra;
    int numeroPersonas;
    int fe;

    public EstacionGeneral(int id, String nombre, String contra) {
        this.id = id;
        this.nombre = nombre;
        this.contra = contra;
        this.hijoDerecho=null;
        this.fe=0;
        this.hijoIzquierdo= null;
        this.padre= null;
        numeroPersonas=0;
    }
}
